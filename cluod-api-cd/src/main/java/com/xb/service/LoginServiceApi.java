package com.xb.service;


import com.xb.model.UserBean;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

public interface LoginServiceApi {

    /**
     * 登录
     * @param userBean
     * @return
     */
    @RequestMapping(value = "queryLogin",method = RequestMethod.POST)
    UserBean queryUserByName(UserBean userBean);
    /**
     * 用户名验重
     * @param userBean
     * @return
     */
    //@RequestMapping(value = "queryLogin")
    @GetMapping("testUserName")
    @ResponseBody
    UserBean testUserName(UserBean userBean);

    /**
     * 手机号验重
     * @param userBean
     * @return
     */
    @GetMapping("testUserPhone")
    @ResponseBody
    UserBean testUserPhone(UserBean userBean);

    /**
     * 注册
     * @param userBean
     */
    @PostMapping("addUserBean")
    void addUserBean(UserBean userBean);

    /**
     * 修改密码
     * @param userBean
     */
    @PostMapping("updatePwd")
    void updatePwd(UserBean userBean);

    /**
     * 获取短信验证码
     * @param userPhone
     * @return
     */
    @GetMapping("gainMessgerCode")
    String gainMessgerCode(String userPhone);


    /**
     *
     * @param userPhone
     * @param messageCode
     * @param session
     * @return
     */
   /* String messageLogin(String userPhone, String messageCode, HttpSession session);*/
}
