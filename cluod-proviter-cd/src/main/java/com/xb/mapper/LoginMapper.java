package com.xb.mapper;

import com.xb.model.UserBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface LoginMapper {


    //根据用户名查询
    UserBean testUserName(UserBean userBean);
    //根据手机号查询
    UserBean testUserPhone(UserBean userBean);
    //注册
    void addUserBean(@RequestParam("userBean") UserBean userBean);

   UserBean selectUser(UserBean userBean);
    void updatePwd(UserBean userBean);
    //获取短信验证码
    String gainMessgerCode(String userPhone);
    //调用短信接口
    String messageLogin(String userPhone, String messageCode, HttpSession session);


    UserBean findUserByLoginNumber(String userPhone);
    //用户名登录
    UserBean queryUserByName(UserBean userBean);
}
