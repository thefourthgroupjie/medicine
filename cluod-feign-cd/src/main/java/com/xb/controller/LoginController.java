package com.xb.controller;

import com.xb.model.UserBean;
import com.xb.service.LoginServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginServiceFeign loginServiceFeign;



    /**
     * 登录
     * @param userBean
     * @return
     */
    @RequestMapping (value = "queryLogin",method = RequestMethod.GET)
    @ResponseBody
    public String queryLogin( UserBean userBean,HttpSession session){
        //验证用户名
        UserBean user = loginServiceFeign.queryUserByName(userBean);
        if(user!=null){
            return "登录成功"+user.getStuats();
        }else{
            session.setAttribute("user", user);
            return "用户名不存在或密码错误";
        }
    }

    /**
     * 注册用户名验重
     * @param UserBean
     * @return
     */
    @GetMapping("testUserName")
    @ResponseBody
    public String testUserName(UserBean userBean ){
        UserBean name = loginServiceFeign.testUserName(userBean);
        if (name==null){
            return "可用";
        }
            return "1";


    }

    /**
     * 手机号验重
     * @param UserBean
     * @return
     */
    @GetMapping("testUserPhone")
    @ResponseBody
    public String testUserPhone(UserBean userBean){
        UserBean phone   = loginServiceFeign.testUserPhone(userBean);
        if (phone==null&&userBean!=null){
            return "可用";
        }else
            return "2";
    }

    /*

    /**
         * 注册表单提交
         * @param UserBean
         *//*
     */
    @PostMapping("addUserBean")
    @ResponseBody
    public void addUserBean(UserBean userBean){
        //System.out.println("收到的实体bean = [" + userBean + "]");

        //String rediskey = (String) redisTemplate.opsForValue().get("daka");
        /*if(!UserBean.getVcode().equals(rediskey)) {
            return "验证码错误";
        }else {

            redisTemplate.delete(rediskey);
            return "注册成功";
        }*/
        loginServiceFeign.addUserBean(userBean);
    }

    /**
     * 修改密码
     * @param UserBean
     * @return
     */
    @PostMapping(value = "updatePwd")
    @ResponseBody
    public void updatePwd(UserBean userBean){
        loginServiceFeign.updatePwd(userBean);
    }

    //获取短信验证码
    @GetMapping("gainMessgerCode")
    @ResponseBody
    public String gainMessgerCode(String userPhone){
        return loginServiceFeign.gainMessgerCode(userPhone);
    }

    //短信验证码登录
   /* @RequestMapping("messageLogin")
    @ResponseBody
    public String messageLogin(@RequestParam String userPhone, @RequestParam String messageCode,HttpSession session){
        return loginServiceFeign.messageLogin(userPhone,messageCode,session);
    }*/



}
