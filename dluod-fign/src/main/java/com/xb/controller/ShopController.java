package com.xb.controller;

import com.xb.service.ShopService;
import model.ShopModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    //加入收藏列表
    @RequestMapping(value = "queryShop")
    @ResponseBody
    public ShopModel queryShop(Integer id){

        ShopModel shopModel = new ShopModel();
        //List<ShopModel> shoplist = new ArrayList<>();
        String niubikey ="keys1"+"1";
        shopModel = (ShopModel) shopService.queryShop(id);
        redisTemplate.opsForList().leftPush(niubikey, shopModel);
        return shopModel;
    }
    //查询收藏列表
    @RequestMapping(value = "queryCar")
    @ResponseBody
    public List<ShopModel> queryCar(){
        String key ="keys1"+"1";
        //取redis
        List<ShopModel> list2 =(List<ShopModel>)redisTemplate.opsForList().range(key,0,-1);
        return list2;
    }
    //删除商品
    @RequestMapping(value = "deleteCang")
    @ResponseBody
    public void deleteCang(Integer id){
        //定义缓存key
        String key ="keys1"+"1";
        //根据key查找数据
        List<ShopModel> list = (List<ShopModel>)redisTemplate.opsForList().range(key, 0, -1);
        //循环
        redisTemplate.delete(key);
        ShopModel wupin = new  ShopModel();
        for (int k=0;k<list.size();k++){
            wupin = (ShopModel)list.get(k);
            Integer wupinid =  wupin.getId();
            if (id.equals(wupinid)){
                System.out.println(wupinid);
            }else {
                redisTemplate.opsForList().leftPush(key, wupin);
            }
        }
    }
    /*查询购物车*/
    @ResponseBody
    @RequestMapping(value = "selectCarAll")
    public List<ShopModel> selectCarAll(HttpServletRequest httpServletRequest){
        String key ="keys2"+"1";
        List<ShopModel> lists =(List<ShopModel>)redisTemplate.opsForList().range(key,0,-1);
        return lists;
    }
    //药品数据库查询分页
    @RequestMapping(value = "findDrugAll")
    @ResponseBody
    public Map<String,Object> findDrugAll(Integer page, Integer rows){

        return shopService.findDrugAll(page,rows);
    }
    //加入购物车
    @RequestMapping(value = "addDrugCar")
    @ResponseBody
    public ShopModel addDrugCar(Integer id,Integer shulian,HttpServletRequest httpServletRequest){
        ShopModel shopModel = new ShopModel();
        //List<ShopModel> shoplist = new ArrayList<>();
        String niubikey ="keys2"+"1";

        List<ShopModel> list = (List<ShopModel>)redisTemplate.opsForList().range(niubikey, 0, -1);

        if (list.size()>=5){
            System.out.println("购物车已满，请尽快清空购物车！");
        }else {
            shopService.updateCar(shulian,id);
            shopModel = (ShopModel) shopService.queryShop(id);
            redisTemplate.opsForList().leftPush(niubikey, shopModel);
            return shopModel;
        }
        return shopModel;
    }
    //删除商品
    @RequestMapping(value = "deleteCar")
    @ResponseBody
    public void deleteCar(Integer id){
        //定义缓存key
        String key ="keys2"+"1";
        //根据key查找数据
        List<ShopModel> list = (List<ShopModel>)redisTemplate.opsForList().range(key, 0, -1);
        //循环
        redisTemplate.delete(key);
        ShopModel wupin = new  ShopModel();
        for (int k=0;k<list.size();k++){
            wupin = (ShopModel)list.get(k);
            Integer wupinid =  wupin.getId();
            if (id.equals(wupinid)){
                System.out.println(wupinid);
            }else {
                redisTemplate.opsForList().leftPush(key, wupin);
            }
        }
    }
    //计算总价
    @RequestMapping(value = "queryTotal")
    @ResponseBody
    public Double queryTotal(String id, String count, HttpServletResponse response) {
        String[] ids = id.split(",");
        String[] counts = count.split(",");
        System.out.println(ids);
        double total=0;
        for (int i=0;i<ids.length;i++){
            ShopModel shopModel = findDrugById(Integer.parseInt(ids[i]));
            double goodsPrice = shopModel.getPrice();
            int count1 = Integer.parseInt(counts[i]);
            double xiaoji = count1*goodsPrice;
            total+=xiaoji;
        }
        return total;
    }

    public ShopModel findDrugById(Integer goodsId) {
        ShopModel shopModel = shopService.findDrugById(goodsId);
        return shopModel;
    }
    /**
     * 1.支付完成减库存2.赠订单3.删缓存
     * @param ids
     * @param count
     * @param request
     */
    @RequestMapping(value = "addOrdelGoods")
    @ResponseBody
    public void addOrdelGoods( String ids, String count,HttpServletRequest request){
        String[] split = ids.split(",");
        String[] split2 = count.split(",");
        String key ="keys2"+"1";
        List<ShopModel> list = (List<ShopModel>)redisTemplate.opsForList().range(key, 0, -1);
        redisTemplate.delete(key);
        ShopModel we = new  ShopModel();
        for (int k=0;k<list.size();k++){
            we = (ShopModel)list.get(k);
            System.out.println("商品编号Integer类型"+we.getId());
            String sts = String.valueOf(we.getId());
            System.out.println("商品编号String类型"+sts);
            if(ids.contains(sts) ){
                System.out.println("!!!!!!!!!!!1"+k);
            }else {
                redisTemplate.opsForList().leftPush(key,we);
            }
        }
        for (int i=0;i<split.length;i++){
            Integer id = Integer.parseInt(split[i]);
            Integer counts =Integer.parseInt(split2[i]);
            System.out.println("ids"+ids);
            System.out.println("counts"+counts);
            //生成订单
            shopService.addComment(id,counts);
        }

    }










}
