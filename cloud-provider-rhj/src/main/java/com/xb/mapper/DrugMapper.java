package com.xb.mapper;

import com.xb.model.InformationBean;
import com.xb.model.MedicalpersonnelBean;
import com.xb.model.XqdetailsBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: medicine
 * @Date: 2019/5/16 21:32
 * @Author: 任豪杰
 * @Description:
 */
public interface DrugMapper {
    @Select("select \n" +
            "ti.id,\n" +
            "tn.TypeName as newsTypeName,\n" +
            "ti.headline,\n" +
            "ti.releaseTime,\n" +
            "ti.author,\n" +
            "ti.source,\n" +
            "ti.details,\n" +
            "ti.newsimg,\n" +
            "ti.readingQuantity  \n" +
            "from t_information ti\n" +
            "left join t_newstype tn on ti.newsTypeId = tn.id")
    List<InformationBean> queryInformation();

    @Select("select  \n" +
            "tm.talentsimg,\n" +
            "tm.sex,\n" +
            "ts.specialtyName as specialtyName ,\n" +
            "tm.workingArea,\n" +
            "tm.entryRequirement,\n" +
            "tm.cellPhoneNumber\n" +
            "from t_medicalpersonnel tm \n" +
            "left join t_specialty ts on tm.specialtyId = ts.id")
    List<MedicalpersonnelBean> queryMedicalpersonnel();

    @Select("select * from xs_details")
    List<XqdetailsBean> queryXqdetails();

    @Select("select * from t_medicalpersonnel where specialtyId = #{value}")
    void zhongyi(Integer id);
}
