package com.xb.controller;


import com.xb.model.Drug;
import com.xb.model.DrugType;
import com.xb.model.MySqls;
import com.xb.service.DemoServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("main")
public class DemoController {
    @Autowired
    private DemoServiceFeign demoServiceFeign;

    @RequestMapping(value = "queryDrug",method = RequestMethod.GET)
    @ResponseBody
    public List<Drug> queryDrug(){

        return demoServiceFeign.queryDrug();
    }

    @RequestMapping(value = "queryDrugType",method = RequestMethod.GET)
    @ResponseBody
    public List<DrugType> queryDrugTypes(Integer id){
        System.out.println(11122222);

        return demoServiceFeign.queryDrugType(id);
    }

    @RequestMapping(value = "queryDrugType2",method = RequestMethod.GET)
    @ResponseBody
    public List<DrugType> queryDrugType(Integer id){


        return demoServiceFeign.queryDrugType2(id);
    }

    //简单的智能对话
    @RequestMapping(value = "testGet",method = RequestMethod.POST)
    @ResponseBody
    public String testGet(String msg){


        return demoServiceFeign.testGet(msg);

    }

    @RequestMapping(value = "queryMySql",method = RequestMethod.GET)
    @ResponseBody
    public List<MySqls> queryMySql(Integer id){


        return demoServiceFeign.queryMySql(id);
    }


}
