package com.xb.controller;

import com.xb.mapper.DemoMapper;
import com.xb.model.DaiLiBean;
import com.xb.model.GoodsBean;
import com.xb.model.GyxxBean;
import com.xb.service.DemoServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DemoControllerImp implements DemoServiceApi {
    @Autowired
    private DemoMapper demoMapper;

    // 查询列表
    @RequestMapping(value = "queryGoods", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<GoodsBean> queryGoods(@RequestBody GoodsBean goodsBean) {
        return demoMapper.queryGoods(goodsBean);
    }

    //分页查询
    @RequestMapping(value = "findDaiLi",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public Map<String, Object> findDaiLi(Integer page, Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int total= demoMapper.findDaiLiCount();
        int start=(page-1)*rows;
        List<DaiLiBean>list=demoMapper.findDaiLi(start,rows);
        params.put("total",total);
        params.put("rows",list);
        return params;
    }



    @RequestMapping(value = "findGlxx",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public Map<String, Object> findGlxx(Integer page, Integer rows ) {
        HashMap<String, Object> params = new HashMap<>();
        int total= demoMapper.findGlxxCount();
        int start=(page-1)*rows;
        List<GyxxBean>list=demoMapper.findGlxx(start,rows);
        params.put("total",total);
        params.put("rows",list);
        return params;
    }


}