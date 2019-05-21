package com.xb.service;

import com.xb.model.GoodsBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface DemoServiceApi {
    // 查询列表
    @RequestMapping(value = "queryGoods",method = RequestMethod.POST)
    List<GoodsBean> queryGoods( GoodsBean goodsBean);
    //分页查询

    @RequestMapping(value = "findDaiLi",method = RequestMethod.POST)
    Map<String, Object> findDaiLi(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    //供应列表查询
    @RequestMapping(value = "findGlxx",method = RequestMethod.POST)
    Map<String, Object> findGlxx(@RequestParam("page")Integer page,@RequestParam("rows") Integer rows);
}
