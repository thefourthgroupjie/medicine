package com.xb.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("springcloud-server")
public interface DrugService extends  DrugServiceApi {
}
