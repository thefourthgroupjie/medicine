package com.xb.service;

import org.springframework.cloud.openfeign.FeignClient;
import service.ShangpinService;

@FeignClient(value = "server-provider")
public interface ShopService extends ShangpinService {



}
