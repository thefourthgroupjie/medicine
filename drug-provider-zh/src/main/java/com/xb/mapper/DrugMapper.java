package com.xb.mapper;


import com.xb.model.ConventionBean;
import com.xb.model.DrugBean;
import com.xb.model.DrugStoreBean;
import com.xb.model.hospitalBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface DrugMapper {

    int findDrugCount();

    List<DrugBean> findDrugList(Integer start, Integer rows);

    List<DrugStoreBean> findDrugStoreList();

    List<hospitalBean> findHospitalList();

    int findDrugStoreListCount();

    List<DrugBean> findDrugStoreList1(int start, Integer rows);

    int findComPanyCount();

    List<DrugBean> findComPanyList(int start, Integer rows);

    List<ConventionBean> findConventionList();
}