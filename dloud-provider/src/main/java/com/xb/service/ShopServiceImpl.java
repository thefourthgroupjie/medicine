package com.xb.service;

import com.xb.mapper.ShopMapper;
import model.ShopModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.ShangpinService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShopServiceImpl implements ShangpinService {

    @Autowired
    private ShopMapper shopMapper;

    @Override

    public void findall(Integer id) {
        shopMapper.findall(id);
    }

    @Override
    public ShopModel queryShop(Integer id) {
        return shopMapper.queryShop(id);
    }

    @Override
    public Map<String, Object> findDrugAll(Integer page, Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int total= shopMapper.findDrugCount();
        int start=(page-1)*rows;
        List<ShopModel>list=shopMapper.findDrugList(start,rows);
        params.put("total",total);
        params.put("rows",list);
        return params;
    }

    @Override
    public void updateCar(Integer shulian, Integer id) {
        shopMapper.updateCar(shulian,id);
    }


}
