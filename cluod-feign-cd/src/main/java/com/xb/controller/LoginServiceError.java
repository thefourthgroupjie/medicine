package com.xb.controller;

import com.xb.model.UserBean;
import com.xb.service.LoginServiceFeign;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

@Controller
public class LoginServiceError {// implements LoginServiceFeign
    /**
     * 登录异常
     * @param userBean
     * @return
     */
   /* @Override
    public HashMap<String, Object> queryLogin(@RequestBody UserBean userBean) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("1","网络异常");
        return params;
    }*/

  /*  @Override
    public Boolean addLogon(UserBean userBean) {
        return null;
    }
*/
 /*   @Override
    public String queryUserPhone(String userPhone) {
        return null;
    }*/

    /**
     * 注册异常
     * @param userBean
     * @return
     */
   /* @Override
    public Boolean addLogon(UserBean userBean) {

        return false;
    }*/
}
