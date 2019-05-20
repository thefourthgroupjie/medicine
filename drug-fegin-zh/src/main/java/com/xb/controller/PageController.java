package com.xb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("page")
public class PageController {
    //跳往药品库页面
    @RequestMapping("toDrugPage")
    public String toDrugPage(){
        return "drugpage";
    }
    //跳往药店大全页面
    @RequestMapping("toDrugStorePage")
    public String toDrugStorePage(){
        return "drugStorePage";
    }
    //跳往医院大全页面
    @RequestMapping("toHospitalPage")
    public String toHospitalPage(){
        return "hospitalPage";
    }
    //跳往产品资质页面
    @RequestMapping("toDrugAptitudePage")
    public String toDrugAptitudePage(){
        return "drugAptitudePage";
    }
    //跳往药店资质页面
    @RequestMapping("toDrugStoreAptitudePage")
    public String toDrugStoreAptitudePage(){
        return "drugStoreAptitudePage";
    }
    //跳往医院资质页面
    @RequestMapping("toHospitalAptitudePage")
    public String toHospitalAptitudePage(){
        return "hospitalAptitudePage";
    }



//跳往商业公司资质页面
    @RequestMapping("toComPanyAptitudePage")
    public String toComPanyAptitudePage(){
        return "ComPanyAptitudePage";
    }
    //跳往招商信息下载页面
    @RequestMapping("toAttractPage")
    public String toAttractPage(){

        return "AttractPage";
    }
    //跳往国药会展资料下载
    @RequestMapping("toConventionPage")
    public String toConventionPage(){
        return "ConventionPage";
    }
}

