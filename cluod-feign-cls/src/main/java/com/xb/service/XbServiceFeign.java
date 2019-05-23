package com.xb.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "provide-service")
public interface XbServiceFeign extends XbServiceApi {
}
