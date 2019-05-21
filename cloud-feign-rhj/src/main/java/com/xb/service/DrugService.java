package com.xb.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: medicine
 * @Date: 2019/5/17 14:03
 * @Author: 任豪杰
 * @Description:
 */
@FeignClient("springcloud-server")
public interface DrugService extends DrugServiceApi{
}
