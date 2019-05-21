package com.xb.controller;

import com.xb.model.*;
import com.xb.service.XbServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("query")
public class XbController {

    @Autowired
    private XbServiceFeign userServiceFeign;

    /***
     *详情查询
     * @param detailsBean
     * @return
     */
    @RequestMapping(value = "userquery",method = RequestMethod.GET)
    @ResponseBody
    public List<DetailsBean> finduserPage(DetailsBean detailsBean){
        return userServiceFeign.finduserPage(detailsBean);
    }

    /**
     *限时秒杀
     * @param
     * @return
     */
    @RequestMapping(value = "xqdetails",method = RequestMethod.GET)
    @ResponseBody
    public List<Xqdetails> finduserPage(Xqdetails xqdetails){
        return userServiceFeign.xqdetails(xqdetails);
    }
    /**
     *团购查询
     * @para
     * @return
     */
    @RequestMapping(value = "tgdetails",method = RequestMethod.GET)
    @ResponseBody
    public List<Xqdetails> tgdetails(Tgdetails tgdetails){
        return userServiceFeign.tgdetails(tgdetails);
    }
    /**
     * 积分查询
     */
    @RequestMapping(value = "jfdetails",method = RequestMethod.GET)
    @ResponseBody
    public List<Jfdetails> jfdetails(Jfdetails jfdetails){
        return userServiceFeign.jfdetails(jfdetails);
    }
    /**
     * 买赠查询
     */
    @RequestMapping(value = "mzdetails",method = RequestMethod.GET)
    @ResponseBody
    public List<Mzdetails> jfdetails(Mzdetails mzdetails){
        return userServiceFeign.mzdetails(mzdetails);
    }
    /**
     * 详情查看
     */
    @RequestMapping(value = "xiangqing",method = RequestMethod.GET)
    @ResponseBody
    public List<XiangDetails> xiangqing(XiangDetails xiangDetails){
        return userServiceFeign.xiangqing(xiangDetails);
    }
    /**
     * 详情查看
     */
    @RequestMapping(value = "xiangqing1",method = RequestMethod.GET)
    @ResponseBody
    public List<XiangDetails> xiangqing1(Integer id){
        return userServiceFeign.xiangqing1(id);
    }
}
