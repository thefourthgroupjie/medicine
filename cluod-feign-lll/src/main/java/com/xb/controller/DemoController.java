package com.xb.controller;


import com.xb.common.ConstantConf;
import com.xb.model.Drug;
import com.xb.model.DrugName;
import com.xb.model.DrugType;
import com.xb.model.MySqls;
import com.xb.service.DemoServiceFeign;
import com.xb.utils.OSSClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("main")
public class DemoController {


    @Autowired
    private DemoServiceFeign demoServiceFeign;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "queryDrug",method = RequestMethod.GET)
    @ResponseBody
    public List<Drug> queryDrug(){

        // 定义一个缓存key
        String drugtKey = ConstantConf.DRUG;

        // 判断缓存是否有数据
        Boolean hasKey = redisTemplate.hasKey(drugtKey);
        // 如果有从缓存中查找，否则从数据库查询 存到缓存里

        if (hasKey) {
            List<Object> range = redisTemplate.opsForList().range(drugtKey, 0, -1);
            List<Drug> rr = (List<Drug>) range.get(0);
            return rr;
        } else {
            // 查询数据库
            List<Drug> findDrug = demoServiceFeign.queryDrug();

            Long leftPush = redisTemplate.opsForList().leftPush(drugtKey, findDrug);
            return findDrug;

        }


    }

    @RequestMapping(value = "queryDrugType",method = RequestMethod.GET)
    @ResponseBody
    public List<DrugType> queryDrugTypes(Integer id){



        return demoServiceFeign.queryDrugType(id);
    }

    @RequestMapping(value = "queryDrugType2",method = RequestMethod.GET)
    @ResponseBody
    public List<DrugType> queryDrugType(Integer id){


        return demoServiceFeign.queryDrugType2(id);
    }



    @RequestMapping(value = "queryMySql",method = RequestMethod.GET)
    @ResponseBody
    public List<MySqls> queryMySql(Integer id){


        return demoServiceFeign.queryMySql(id);
    }

    @RequestMapping(value = "queryDrugName",method = RequestMethod.GET)
    @ResponseBody
    public List<DrugName> queryDrugName(Integer id){


        return demoServiceFeign.queryDrugName(id);
    }

    @RequestMapping(value = "shoucang",method = RequestMethod.GET)
    @ResponseBody
    public List<MySqls> shoucang(Integer id){


        return demoServiceFeign.shoucang(id);
    }
    /**
     * OSS阿里云上传图片
     */
    @RequestMapping("updaloadImg")
    @ResponseBody
    public String uploadImg(MultipartFile imgg)throws IOException {
        if (imgg == null || imgg.getSize() <= 0) {
            throw new IOException("file不能为空");
        }
        OSSClientUtil ossClient=new OSSClientUtil();
        String name = ossClient.uploadImg2Oss(imgg);
        String imgUrl = ossClient.getImgUrl(name);
        String[] split = imgUrl.split("\\?");
        //System.out.println(split[0]);
        return split[0];
    }

}
