package com.xb.mapper;

import com.xb.model.DaiLiBean;
import com.xb.model.GoodsBean;

import java.util.List;

public interface DemoMapper {
    List<GoodsBean> queryGoods(GoodsBean goodsBean);


    int findDaiLiCount();

    List<DaiLiBean> findDaiLi(Integer start, Integer rows);
}
