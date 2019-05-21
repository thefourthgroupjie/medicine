package com.xb.controller;

import com.xb.model.*;
import com.xb.service.DrugService;
import com.xb.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
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


   //国药会展资料下载
    @RequestMapping("page/exportExcel1")
    public void exportExcel1(HttpServletResponse response,Integer id){
        //定义导出的excel标题
        String title="国药会展信息表";
        //定义导出的列头
        String[] rowname={"编号","名称"};
        //定义导出的数据
        List<Object[]>  dataList = new ArrayList<Object[]>();
        //查询出的数据库
        List<ConventionBean> list =drugService.queryConventionListPoi(id);
        for (ConventionBean user : list) {
            Object[] obj=new Object[rowname.length];
            obj[0]=user.getId();
            obj[1]=user.getName();

            dataList.add(obj);
        }
        ExportExcel exportExcel =new ExportExcel(title, rowname, dataList, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //产品资质下载
    @RequestMapping("page/exportExcel2")
    public void exportExcel2(HttpServletResponse response,Integer id){
        //定义导出的excel标题
        String title="产品资质信息表";
        //定义导出的列头
        String[] rowname={"药品编号","产品名称","规格","生产企业"};
        //定义导出的数据
        List<Object[]>  dataList = new ArrayList<Object[]>();
        //查询出的数据库
        List<DrugBean> list =drugService.queryDrugListPoi(id);
        for (DrugBean user : list) {
            Object[] obj=new Object[rowname.length];
            obj[0]=user.getDrugId();
            obj[1]=user.getDrugName();
            obj[2]=user.getSpecification();
            obj[3]=user.getManEnterprise();
            dataList.add(obj);
        }
        ExportExcel exportExcel =new ExportExcel(title, rowname, dataList, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //药店/诊所资质下载
    @RequestMapping("page/exportExcel3")
    public void exportExcel3(HttpServletResponse response,Integer id){
        //定义导出的excel标题
        String title="药店资质信息表";
        //定义导出的列头
        String[] rowname={"序号","药店/诊所","地址"};
        //定义导出的数据
        List<Object[]>  dataList = new ArrayList<Object[]>();
        //查询出的数据库
        List<DrugStoreBean> list =drugService.queryDrugStoreListPoi(id);
        for (DrugStoreBean user : list) {
            Object[] obj=new Object[rowname.length];
            obj[0]=user.getId();
            obj[1]=user.getDrugstoreName();
            obj[2]=user.getSite();
            dataList.add(obj);
        }
        ExportExcel exportExcel =new ExportExcel(title, rowname, dataList, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //公司资质下载
    @RequestMapping("page/exportExcel4")
    public void exportExcel4(HttpServletResponse response,Integer id){
        //定义导出的excel标题
        String title="公司资质信息表";
        //定义导出的列头
        String[] rowname={"编号","企业名称"};
        //定义导出的数据
        List<Object[]>  dataList = new ArrayList<Object[]>();
        //查询出的数据库
        List<CompanyBean> list =drugService.queryCompanyListPoi(id);
        for (CompanyBean user : list) {
            Object[] obj=new Object[rowname.length];
            obj[0]=user.getId();
            obj[1]=user.getCompanyName();
            dataList.add(obj);
        }
        ExportExcel exportExcel =new ExportExcel(title, rowname, dataList, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //招商信息下载
    @RequestMapping("page/exportExcel5")
    public void exportExcel5(HttpServletResponse response){
        //定义导出的excel标题
        String title="招商信息表";
        //定义导出的列头
        String[] rowname={"编号","名称","规格","生产厂家","区域","日期"};
        //定义导出的数据
        List<Object[]>  dataList = new ArrayList<Object[]>();
        //查询出的数据库
        List<ZsBean> list =drugService.queryAttratListPoi();
        for (ZsBean user : list) {
            Object[] obj=new Object[rowname.length];
            obj[0]=user.getId();
            obj[1]=user.getName();
            obj[2]=user.getGuage();
            obj[3]=user.getShenc();
            obj[4]=user.getQuyu();
            obj[5]=user.getTime();
            dataList.add(obj);
        }
        ExportExcel exportExcel =new ExportExcel(title, rowname, dataList, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
