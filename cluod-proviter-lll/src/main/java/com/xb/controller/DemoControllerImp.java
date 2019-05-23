package com.xb.controller;

import com.alibaba.fastjson.JSON;

import com.xb.model.DrugName;
import com.xb.model.MySqls;

import com.xb.mapper.DemoMapper;
import com.xb.model.Drug;
import com.xb.model.DrugType;
import com.xb.service.DemoServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.List;

@Controller
public class DemoControllerImp implements DemoServiceApi {
    @Autowired
    private DemoMapper demoMapper;

    @RequestMapping(value = "queryDrug",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<Drug> queryDrug() {

return demoMapper.queryDrug();
    }

    @RequestMapping(value = "queryDrugType",method = RequestMethod.POST)
    @ResponseBody
    @Override  //传实体类在这里加@RequestBody
    public List<DrugType> queryDrugType(Integer id) {
        System.out.println(22222);
        return demoMapper.queryDrugType(id);
    }
    @RequestMapping(value = "queryDrugType2",method = RequestMethod.POST)
    @ResponseBody
    @Override  //传实体类在这里加@RequestBody
    public List<DrugType> queryDrugType2(Integer id) {
        return demoMapper.queryDrugType2(id);
    }




    @RequestMapping(value ="queryMySql",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<MySqls> queryMySql(Integer id) {
        return demoMapper.queryMySql(id);
    }

    @RequestMapping(value ="queryDrugName",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<DrugName> queryDrugName(Integer id) {

        return demoMapper.queryDrugName(id);
    }

    @Override
    public List<MySqls> shoucang(Integer id) {
        return demoMapper.shoucang(id);
    }

}
