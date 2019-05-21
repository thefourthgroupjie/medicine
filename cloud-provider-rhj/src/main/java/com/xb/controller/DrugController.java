package com.xb.controller;


import com.xb.mapper.DrugMapper;
import com.xb.model.InformationBean;
import com.xb.model.MedicalpersonnelBean;
import com.xb.model.XqdetailsBean;
import com.xb.service.DrugServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @program: medicine
 * @Date: 2019/5/16 16:57
 * @Author: 任豪杰
 * @Description:
 */
@Controller
public class DrugController implements DrugServiceApi {

    @Autowired
    private DrugMapper drugMapper;

    @RequestMapping("queryInformation")
    @ResponseBody
    @Override
    public List<InformationBean> queryInformation() {

        return drugMapper.queryInformation();
    }

    @RequestMapping("queryMedicalpersonnel")
    @ResponseBody
    @Override
    public List<MedicalpersonnelBean> queryMedicalpersonnel() {
        return drugMapper.queryMedicalpersonnel();
    }

    @RequestMapping("queryXqdetails")
    @ResponseBody
    @Override
    public List<XqdetailsBean> queryXqdetails() {
        return drugMapper.queryXqdetails();
    }

    @Override
    public void zhongyi(Integer id) {

        drugMapper.zhongyi(id);
    }
}
