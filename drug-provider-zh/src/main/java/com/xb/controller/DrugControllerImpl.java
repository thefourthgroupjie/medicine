package com.xb.controller;

import com.xb.mapper.DrugMapper;
import com.xb.model.Demo;
import com.xb.model.DrugBean;
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


    @RequestMapping(value = "findDrugList",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public Map<String, Object> findDrugList(Integer page, Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        long total= drupMapper.findDrugCount();
        int start=(page-1)*rows;
        List<DrugBean>list=drupMapper.findDrugList(start,rows);
        params.put("total",total);
        params.put("rows",list);
        return params;
    }
}
