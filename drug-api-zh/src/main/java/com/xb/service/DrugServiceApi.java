package com.xb.service;


        import com.xb.model.*;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;
        import java.util.Map;

public interface DrugServiceApi {

    @RequestMapping(value = "findDrugList",method = RequestMethod.POST)
    Map<String, Object> findDrugList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    @RequestMapping(value = "findDrugStoreList",method = RequestMethod.GET)
    List<DrugStoreBean> findDrugStoreList();
    @RequestMapping(value = "findHospitalList",method = RequestMethod.GET)
    List<hospitalBean> findHospitalList();
    @RequestMapping(value = "findDrugList1",method = RequestMethod.POST)
    Map<String, Object> findDrugStoreList1(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows);
    @RequestMapping(value = "findComPanyList",method = RequestMethod.POST)
    Map<String, Object> findComPanyList(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows);
    @RequestMapping(value = "findConventionList",method = RequestMethod.GET)
    List<ConventionBean> findConventionList();
    @RequestMapping(value = "queryConventionListPoi",method = RequestMethod.POST)
    List<ConventionBean> queryConventionListPoi(@RequestParam("id") Integer id);
    @RequestMapping(value = "queryDrugListPoi",method = RequestMethod.POST)
    List<DrugBean> queryDrugListPoi(@RequestParam("id") String id);
    @RequestMapping(value = "queryDrugStoreListPoi",method = RequestMethod.POST)
    List<DrugStoreBean> queryDrugStoreListPoi(@RequestParam("id") Integer id);
    @RequestMapping(value = "queryCompanyListPoi",method = RequestMethod.POST)
    List<CompanyBean> queryCompanyListPoi(@RequestParam("id") Integer id);
    @RequestMapping(value = "queryAttratListPoi",method = RequestMethod.GET)
    List<ZsBean> queryAttratListPoi();
}
