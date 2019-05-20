package com.xb.mapper;

import model.ShopModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {


    void findall(Integer id);


    ShopModel queryShop(Integer id);
}
