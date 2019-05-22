package com.xb.mapper;


import com.xb.model.*;
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


    List<ConventionBean> queryConventionListPoi(@Param("id") Integer id);

    List<CompanyBean> queryCompanyListPoi(@Param("id") Integer id);

    List<DrugStoreBean> queryDrugStoreListPoi(@Param("id") Integer id);

    List<DrugBean> queryDrugListPoi(@Param("id") String id);

    List<ZsBean> queryAttratListPoi();
}