package com.xb.mapper;

import com.xb.model.DaiLiBean;
import com.xb.model.GoodsBean;
import com.xb.model.GyxxBean;

import java.util.List;

public interface GoodsMapper {
    List<GoodsBean> queryGoods(GoodsBean goodsBean);


    int findDaiLiCount();
    List<DaiLiBean> findDaiLi(Integer start, Integer rows);


    int findGlxxCount();
    List<GyxxBean> findGlxx(Integer start, Integer rows);
}
