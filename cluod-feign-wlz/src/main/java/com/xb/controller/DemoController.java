package com.xb.controller;

import com.xb.model.GoodsBean;
import com.xb.service.DemoServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("goods")
public class DemoController {
    @Autowired
    private DemoServiceFeign demoServiceFeign;
    @Autowired
    private RedisTemplate redisTemplate;

    // 查询招商列表信息
    @RequestMapping(value = "queryGoods", method = RequestMethod.GET)
    @ResponseBody
    public List<GoodsBean> queryGoods(GoodsBean goodsBean) {
        // 定义一个缓存key
        String drugtKey = "t_goods";
        // 判断缓存是否有数据
        Boolean hasKey = redisTemplate.hasKey(drugtKey);
        // 如果有从缓存中查找，否则从数据库查询 存到缓存里

        if (hasKey) {
            List<Object> range = redisTemplate.opsForList().range(drugtKey, 0, -1);
            List<GoodsBean> rr = (List<GoodsBean>) range.get(0);
            return rr;
        } else {
            // 查询数据库、
            List<GoodsBean> goods = demoServiceFeign.queryGoods(goodsBean);

            Long leftPush = redisTemplate.opsForList().leftPush(drugtKey, goods);
            return goods;
            // return demoServiceFeign.queryGoods(goodsBean);
        }

    }

    //分页查询
    @RequestMapping(value = "findDaiLi", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findDaiLi(Integer page, Integer rows) {
         return demoServiceFeign.findDaiLi(page, rows);

    }

    //分页查询
    @RequestMapping(value = "findGlxx",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findGlxx(Integer page, Integer rows) {
        return demoServiceFeign.findGlxx(page, rows);

    }
}
