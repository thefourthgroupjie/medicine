package com.xb.controller;

import com.xb.service.ShopService;
import model.ShopModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ShopController {

    @Autowired
    private ShopService shopService;
    @Autowired
    private RedisTemplate redisTemplate;
    //*添加购物车*//*
    @ResponseBody
    @RequestMapping(value = "addCar")
    public void addCar( Integer id) {
        //int userids = Integer.parseInt(userId);
        String key ="keys"+"1";
      /*  shopModel.setGoodsId(productId);
        shopModel.setGoodsName(productName);
        shopModel.setGoodsPrice(productPrice);
        shopModel.setGoodsCount(1);
        shopModel.setGoodsImg(productImg);*/
       // shopModel.setId(1);
        //shopModel.setName("qqq");
        ShopModel shopModel = new ShopModel();
        shopService.findall(id);
        redisTemplate.opsForList().leftPush(key,shopModel);

    }
    @RequestMapping(value = "queryShop")
    @ResponseBody
    public ShopModel queryShop(Integer id){

        ShopModel shopModel = new ShopModel();
        //List<ShopModel> shoplist = new ArrayList<>();
        String niubikey ="keys2"+"1";
        shopModel = (ShopModel) shopService.queryShop(id);
        redisTemplate.opsForList().leftPush(niubikey, shopModel);
        return shopModel;
    }

    @RequestMapping(value = "queryCar")
    @ResponseBody
    public List queryCar(){
        String key ="keys2"+"1";
        //取redis
        List list = redisTemplate.opsForList().range(key,0, -1);
        return list;
    }
    /*查询购物车*/
    @ResponseBody
    @RequestMapping(value = "selectCarAll")
    public List<ShopModel> selectCarAll(HttpServletRequest httpServletRequest){
        String key ="keys2"+"1";
        List<ShopModel> lists =(List<ShopModel>)redisTemplate.opsForList().range(key,0,-1);
        return lists;
    }



}
