package com.xb.mapper;


import com.xb.model.DrugBean;
import java.util.List;


public interface DrugMapper {

    int findDrugCount();

    List<DrugBean> findDrugList(Integer start, Integer rows);
}
