package com.xb.mapper;

import model.Order;
import model.ShopModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {


    void findall(Integer id);


    ShopModel queryShop(Integer id);

    int findDrugCount();

    List<ShopModel> findDrugList(int start, Integer rows);


    void updateCar(Integer shulian, Integer id);

    ShopModel findDrugById(Integer goodsId);

    void uptAccount(Integer ids, Integer counts);

    ShopModel findProductById(Integer ids);

    void saveOrder(Order order);
}
