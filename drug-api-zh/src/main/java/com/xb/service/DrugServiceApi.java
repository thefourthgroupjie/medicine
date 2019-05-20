package com.xb.service;


        import com.xb.model.ConventionBean;
        import com.xb.model.DrugStoreBean;
        import com.xb.model.hospitalBean;
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
}
