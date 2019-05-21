package com.xb.service;

import com.xb.model.InformationBean;
import com.xb.model.MedicalpersonnelBean;
import com.xb.model.XqdetailsBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: medicine
 * @Date: 2019/5/16 20:47
 * @Author: 任豪杰
 * @Description:
 */
public interface DrugServiceApi {

    @RequestMapping("queryInformation")
    List<InformationBean> queryInformation();

    @RequestMapping("queryMedicalpersonnel")
    List<MedicalpersonnelBean> queryMedicalpersonnel();

    @RequestMapping("queryXqdetails")
    List<XqdetailsBean> queryXqdetails();

    @RequestMapping("zhongyi")
    void zhongyi(Integer id);
}
