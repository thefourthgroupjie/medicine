package com.xb.mapper;

import com.xb.model.Drug;
import com.xb.model.DrugType;
import com.xb.model.MySqls;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

public interface DemoMapper {

    List<Drug> queryDrug();

    List<DrugType> queryDrugType(@RequestParam("id") Integer id);

    List<DrugType> queryDrugType2(@RequestParam("id") Integer id);


    List<MySqls> queryMySql(Integer id);
}
