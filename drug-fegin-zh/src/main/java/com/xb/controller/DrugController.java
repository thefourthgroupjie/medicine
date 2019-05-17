package com.xb.controller;

import com.xb.model.Demo;
import com.xb.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("drug")
public class DrugController {


    @Autowired
    private DrugService drugService;


    //药品数据库查询分页
    @RequestMapping(value = "findDrugList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findDrugList(Integer page,Integer rows){

        return drugService.findDrugList(page,rows);
    }
}
