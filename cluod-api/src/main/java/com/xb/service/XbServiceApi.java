package com.xb.service;

import com.xb.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface XbServiceApi {

    /**
     * 详情查寻2
     * @param detailsBean
     * @return
     */
    @RequestMapping(value = "userquery",method = RequestMethod.POST)
    List<DetailsBean> finduserPage(DetailsBean detailsBean);

    /**
     * 详情查询
     * @param xqdetails
     * @return
     */
    @RequestMapping(value = "xqdetails",method = RequestMethod.POST)
    List<Xqdetails> xqdetails(Xqdetails xqdetails);

    /**
     * 团购查询
     * @param tgdetails
     * @return
     */
    @RequestMapping(value = "tgdetails",method = RequestMethod.POST)
    List<Xqdetails> tgdetails(Tgdetails tgdetails);

    /**
     * 积分查询
     */
    @RequestMapping(value = "jfdetails",method = RequestMethod.POST)
    List<Jfdetails> jfdetails(Jfdetails jfdetails);

    /**
     * 买赠查询
     */
    @RequestMapping(value = "mzdetails",method = RequestMethod.POST)
    List<Mzdetails> mzdetails(Mzdetails mzdetails);
}
