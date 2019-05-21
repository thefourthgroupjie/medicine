package com.xb.mapper;

import com.xb.model.*;

import java.util.HashMap;
import java.util.List;

public interface XbMapper {


    List<DetailsBean> finduserPage(DetailsBean detailsBean);

    /**
     * 详情查寻  dao层    最后
     * @param
     * @return
     */
    List<Xqdetails> xqdetails(Xqdetails xqdetails);

    /**
     * 团购查询
     * @param tgdetails
     * @return
     */
    List<Xqdetails> tgdetails(Tgdetails tgdetails);

    /**
     * 积分查询
     * @param jfdetails
     * @return
     */
    List<Jfdetails> jfdetails(Jfdetails jfdetails);

    /**
     * 买赠查询
     */
    List<Mzdetails> mzdetails(Mzdetails mzdetails);

    /**
     * 详情查询
     */
    List<XiangDetails> xiangqing(XiangDetails xiangDetails);

    List<XiangDetails> xiangqing1(Integer id);
}
