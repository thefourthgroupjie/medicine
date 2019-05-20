package com.xb.service;

import com.xb.mapper.ShopMapper;
import model.ShopModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.ShangpinService;

import java.util.List;
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
}
