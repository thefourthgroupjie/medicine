package com.xb.service;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

public interface DrugServiceApi {

    @RequestMapping(value = "findDrugList",method = RequestMethod.POST)
    Map<String, Object> findDrugList(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows);
        }
