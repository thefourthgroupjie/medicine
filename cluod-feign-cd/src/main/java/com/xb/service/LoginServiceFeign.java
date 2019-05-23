package com.xb.service;

import com.xb.controller.LoginServiceError;
import com.xb.model.UserBean;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "provide-service" )//,fallback = LoginServiceError.class
public interface LoginServiceFeign extends LoginServiceApi{


}
