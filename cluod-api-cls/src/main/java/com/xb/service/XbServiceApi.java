package com.xb.service;

import com.xb.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    /**
     * 详情查看
     */
    /*@RequestMapping(value = "xiangqing",method = RequestMethod.POST)
    List<XiangDetails> xiangqing(XiangDetails xiangDetails);1*/


    @RequestMapping(value = "xiangqing1",method = RequestMethod.POST)
    List<XiangDetails> xiangqing1(Integer id);

    /**
     * 团购
     * @param id
     * @return
     */
    @RequestMapping(value = "tongbu",method = RequestMethod.POST)
    List<TuanDetails> tongbu(Integer id);

    /**
     * 买赠
     * @param id
     * @return
     */
    @RequestMapping(value = "maizengDetails",method = RequestMethod.POST)
    List<MaizengDetails> maizengDetails(Integer id);
}
