package com.xb.controller;

import com.xb.model.*;
import com.xb.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("drug")
public class DrugController {


    @Autowired
    private DrugService drugService;


    //药品数据库查询分页
    @RequestMapping(value = "findDrugList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findDrugList(Integer page, Integer rows){

        return drugService.findDrugList(page,rows);
    }

    //查询药店数据列表
    @RequestMapping(value = "findDrugStoreList",method = RequestMethod.GET)
    @ResponseBody
    public List<DrugStoreBean>  findDrugStoreList(){

        return drugService.findDrugStoreList();
    }

    //查询医院数据列表
    @RequestMapping(value = "findHospitalList",method = RequestMethod.GET)
    @ResponseBody
    public List<hospitalBean>  findHospitalList(){

        return drugService.findHospitalList();
    }
    //分页查询药店数据
    @RequestMapping(value = "findDrugStoreList1",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findDrugStoreList1(Integer page, Integer rows){

        return drugService.findDrugStoreList1(page,rows);
    }
    //商业公司资质分页查询
    @RequestMapping(value = "findComPanyList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findComPanyList(Integer page, Integer rows){

        return drugService.findComPanyList(page,rows);
    }
    //查询国药会展资料
    @RequestMapping(value = "findConventionList",method = RequestMethod.GET)
    @ResponseBody
    public List<ConventionBean>  findConventionList(){

        return drugService.findConventionList();
    }
}
