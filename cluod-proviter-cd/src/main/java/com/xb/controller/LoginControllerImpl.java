package com.xb.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xb.CommonConf;
import com.xb.mapper.LoginMapper;
import com.xb.model.UserBean;
import com.xb.service.LoginServiceApi;
import com.xb.utils.HttpClientUtil;
import com.xb.utils.Md5Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class LoginControllerImpl implements LoginServiceApi {

    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "queryLogin",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public UserBean queryUserByName(@RequestBody UserBean userBean) {

        return loginMapper.queryUserByName(userBean);
    }

    /**
     * 注册用户名验重
     * @param UserBean
     * @return
     */
    @RequestMapping(value = "testUserName")
    @ResponseBody
    @Override
    public UserBean testUserName(@RequestBody UserBean userBean) {
        return loginMapper.testUserName(userBean);
    }

    /**
     *手机号验重
     * @param UserBean
     * @return
     */
    @RequestMapping(value = "testUserPhone")
    @ResponseBody
    @Override
    public UserBean testUserPhone(@RequestBody UserBean userBean) {
        return loginMapper.testUserPhone(userBean);
    }
    /**
     * 注册表单提交
     * @param UserBean
     */
    @ResponseBody
    @Override
    public void addUserBean(@RequestBody UserBean userBean) {
        //System.out.println("userBean = [" + userBean + "]");

        loginMapper.addUserBean(userBean);
    }

    /**
     * 修改密码
     * @param UserBean
     * @return
     */
    @ResponseBody
    @Override
    public void updatePwd(@RequestBody UserBean userBean) {

        UserBean user = loginMapper.selectUser(userBean);
        if (user!=null){
            loginMapper.updatePwd(userBean);
        }

    }
    //获取短信验证码
    @RequestMapping("gainMessgerCode")
    @ResponseBody
    @Override
    public String gainMessgerCode(@RequestParam("userPhone") String userPhone) {
        //验证手机号是否存在
        UserBean user = loginMapper.findUserByLoginNumber(userPhone);
        if(user==null){
            return "手机号不存在";
        }
        Object lock = redisTemplate.opsForValue().get(CommonConf.SMS_LOGIN_LOCK+userPhone);
        if(lock!=null){
            return "一分钟内不能重复获取";
        }
        String url = "https://api.miaodiyun.com/20150822/industrySMS/sendSMS";
        HashMap<String, Object> params = new HashMap<>();
        String userPhoneSid = "0374867b2c1844dbbe0bf019bf0def28";
        params.put("userPhoneSid", userPhoneSid);//开发者主账号ID（userPhone SID）
        params.put("templateid", "164547838");//短信模板ID
        //6位随机数，验证码
        int code = (int) Math.ceil(Math.random()*899999+100000);
        System.out.println(code);
        //String codeStr = String.valueOf(code);
        params.put("param", code);//短信模板中的变量值
        params.put("to", userPhone);//手机号
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String time = sdf.format(new Date());
        params.put("timestamp", time);//时间戳
        String token = "d05d06f418974fc6aceb9233e38b7539";
        String sig = Md5Util.getMd532(userPhoneSid+token+time);
        params.put("sig", sig);//签名
        //发送短信
        String returnStr = HttpClientUtil.post(url, params);
        JSONObject parseObject = JSON.parseObject(returnStr);
        String respCode = parseObject.getString("respCode");
        if(!respCode.equals("00000")){
            return "发送短信验证码失败";
        }
        //存验证码
        String key = "msgcode"+userPhone;
        System.out.println(key);
        redisTemplate.opsForValue().set(key, code, 5, TimeUnit.MINUTES);
        //加一个锁60秒不能再次获取
        redisTemplate.opsForValue().set(CommonConf.SMS_LOGIN_LOCK+userPhone,"lock",CommonConf.SMS_LOGIN_LOCK_TIME_OUT,TimeUnit.MINUTES);

        return "发送短信验证码成功";
    }

    //短信验证码登录
   /* @RequestMapping("messageLogin")
    @ResponseBody
    public String messageLogin(@RequestParam  String userPhone,@RequestParam String messageCode, HttpSession session){
        return loginMapper.messageLogin(userPhone,messageCode,session);
    }*/


}
