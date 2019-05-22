package com.xb.controller;

import com.xb.mapper.XbMapper;
import com.xb.model.*;
import com.xb.service.XbServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class XbController implements XbServiceApi {

    @Autowired
    private XbMapper xbMapper;


    /**
     * 详情查询3
     * @param detailsBean
     * @return
     */
    @RequestMapping(value = "userquery",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<DetailsBean> finduserPage(@RequestBody DetailsBean detailsBean) {
        return xbMapper.finduserPage(detailsBean);
    }

    /**
     *详情查询
     * @param xqdetails
     * @return
     */
    @RequestMapping(value = "xqdetails",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<Xqdetails> xqdetails(@RequestBody Xqdetails xqdetails) {
        return xbMapper.xqdetails(xqdetails);
    }

    /**
     * 团购查询
     * @param tgdetails
     * @return
     */
    @RequestMapping(value = "tgdetails",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<Xqdetails> tgdetails(@RequestBody Tgdetails tgdetails) {
        return xbMapper.tgdetails(tgdetails);
    }

    /**
     * 积分查询
     * @param jfdetails
     * @return
     */
    @RequestMapping(value = "jfdetails",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<Jfdetails> jfdetails(@RequestBody Jfdetails jfdetails) {
        return xbMapper.jfdetails(jfdetails);
    }
    /**
     * 买赠查询
     */
    @RequestMapping(value = "mzdetails",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<Mzdetails> mzdetails(@RequestBody Mzdetails mzdetails) {
        return xbMapper.mzdetails(mzdetails);
    }

    /**
     * 详情查看
     */
    /*@RequestMapping(value = "xiangqing",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<XiangDetails> xiangqing(XiangDetails xiangDetails) {
        return xbMapper.xiangqing(xiangDetails);
    }
*/
    @RequestMapping(value = "xiangqing1",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<XiangDetails> xiangqing1(@RequestBody Integer id) {
        return xbMapper.xiangqing1(id);
    }

    /**
     * 团购
     * @param id
     * @return
     */
    @RequestMapping(value = "tongbu",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<TuanDetails> tongbu(@RequestBody Integer id) {
        return xbMapper.tongbu(id);
    }

    /**
     * 买赠
     * @param id
     * @return
     */
    @RequestMapping(value = "maizengDetails",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<MaizengDetails> maizengDetails(@RequestBody Integer id) {
        return xbMapper.maizengDetails(id);
    }


}
