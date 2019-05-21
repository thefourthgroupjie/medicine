package com.xb.controller;

import com.xb.mapper.DrugMapper;
import com.xb.model.*;
import com.xb.service.DrugServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DrugControllerImpl implements DrugServiceApi {

    @Autowired
    private DrugMapper drupMapper;

    //药品数据库查询分页
    @RequestMapping(value = "findDrugList",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findDrugList(Integer page, Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int total= drupMapper.findDrugCount();
        int start=(page-1)*rows;
        List<DrugBean>list=drupMapper.findDrugList(start,rows);
        params.put("total",total);
        params.put("rows",list);
        return params;
    }
    //查询药店数据列表
    @RequestMapping(value = "findDrugStoreList",method = RequestMethod.GET)
    @ResponseBody
    @Override
    public List<DrugStoreBean> findDrugStoreList() {
        return drupMapper.findDrugStoreList();
    }
    //查询医院数据列表
    @RequestMapping(value = "findHospitalList",method = RequestMethod.GET)
    @ResponseBody
    @Override
    public List<hospitalBean> findHospitalList() {

        return drupMapper.findHospitalList();
    }


    //分页查询药店数据
    @RequestMapping(value = "findDrugList1",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public Map<String, Object> findDrugStoreList1(Integer page, Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int total= drupMapper.findDrugStoreListCount();
        int start=(page-1)*rows;
        List<DrugBean>list=drupMapper.findDrugStoreList1(start,rows);
        params.put("total",total);
        params.put("rows",list);
        return params;
    }

    //商业公司资质分页查询
    @RequestMapping(value = "findComPanyList",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public Map<String, Object> findComPanyList(Integer page, Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int total= drupMapper.findComPanyCount();
        int start=(page-1)*rows;
        List<DrugBean>list=drupMapper.findComPanyList(start,rows);
        params.put("total",total);
        params.put("rows",list);
        return params;
    }

    //查询国药会展资料
    @RequestMapping(value = "findConventionList",method = RequestMethod.GET)
    @ResponseBody
    @Override
    public List<ConventionBean> findConventionList() {

        return drupMapper.findConventionList();
    }

    @RequestMapping(value = "queryConventionListPoi",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<ConventionBean> queryConventionListPoi(Integer id) {
        return drupMapper.queryConventionListPoi(id);
    }


    @RequestMapping(value = "queryDrugListPoi",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<DrugBean> queryDrugListPoi(Integer id) {
        return drupMapper.queryDrugListPoi(id);
    }


    @RequestMapping(value = "queryDrugStoreListPoi",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<DrugStoreBean> queryDrugStoreListPoi(Integer id) {
        return drupMapper.queryDrugStoreListPoi(id);
    }


    @RequestMapping(value = "queryCompanyListPoi",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<CompanyBean> queryCompanyListPoi(Integer id) {
        return drupMapper.queryCompanyListPoi(id);
    }

    @RequestMapping(value = "queryAttratListPoi",method = RequestMethod.GET)
    @ResponseBody
    @Override
    public List<ZsBean> queryAttratListPoi() {
        return drupMapper.queryAttratListPoi();
    }


}

