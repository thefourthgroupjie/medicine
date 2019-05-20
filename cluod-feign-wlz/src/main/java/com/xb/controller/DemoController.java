package com.xb.controller;

import com.xb.model.DaiLiBean;
import com.xb.model.GoodsBean;
import com.xb.service.DemoServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("goods")
public class DemoController {
    @Autowired
    private DemoServiceFeign demoServiceFeign;

    // 查询招商列表信息
    @RequestMapping(value = "queryGoods",method = RequestMethod.GET)
    @ResponseBody
    public List<GoodsBean> queryGoods(GoodsBean goodsBean){
        return demoServiceFeign.queryGoods(goodsBean);
    }
    //分页查询
    @RequestMapping(value = "findDaiLi",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findDaiLi(Integer page, Integer rows) {
        return demoServiceFeign.findDaiLi(page, rows);

    }

    }
