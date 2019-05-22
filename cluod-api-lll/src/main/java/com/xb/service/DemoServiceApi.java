package com.xb.service;


import com.xb.model.Drug;
import com.xb.model.DrugName;
import com.xb.model.DrugType;
import com.xb.model.MySqls;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;
//传单搁置要加@RequestParam
public interface DemoServiceApi {

    @RequestMapping(value = "queryDrug",method = RequestMethod.POST)
    List<Drug> queryDrug();


    @RequestMapping(value = "queryDrugType",method = RequestMethod.POST)
    List<DrugType> queryDrugType(@RequestParam("id") Integer id);

    @RequestMapping(value = "queryDrugType2",method = RequestMethod.POST)
    List<DrugType> queryDrugType2(@RequestParam("id") Integer id);



    @RequestMapping(value = "queryMySql",method = RequestMethod.POST)
    List<MySqls> queryMySql(@RequestParam("id") Integer id);

    @RequestMapping(value = "queryDrugName",method = RequestMethod.POST)
    List<DrugName> queryDrugName(@RequestParam("id") Integer id);

    @RequestMapping(value = "shoucang",method = RequestMethod.POST)
    List<MySqls> shoucang(@RequestParam("id") Integer id);
}
