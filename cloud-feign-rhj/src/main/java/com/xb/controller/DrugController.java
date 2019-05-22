package com.xb.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xb.model.HttpJson;
import com.xb.model.InformationBean;
import com.xb.model.MedicalpersonnelBean;
import com.xb.model.XqdetailsBean;
import com.xb.service.DrugServiceApi;
import com.xb.utils.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @program: medicine
 * @Date: 2019/5/16 16:57
 * @Author: 任豪杰
 * @Description:
 */
@Controller
@RequestMapping("drug")
public class DrugController  {

    @Autowired
    private DrugServiceApi drugSerivce;

    @RequestMapping("zhongyi")
    @ResponseBody
    public void zhongyi(Integer id){
        drugSerivce.zhongyi(id);
    }

    //医药会展查询
    @RequestMapping("queryXqdetails")
    @ResponseBody
    public List<XqdetailsBean> queryXqdetails(){
        return drugSerivce.queryXqdetails();
    }

    //医药人才列表查询
    @RequestMapping("queryMedicalpersonnel")
    @ResponseBody
    public List<MedicalpersonnelBean> queryMedicalpersonnel(){
        return drugSerivce.queryMedicalpersonnel();
    }


    //军事
    @ResponseBody
    @RequestMapping(value="junshi",produces= "application/json; charset=utf-8")
    public List junshi(String type){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("key", "003888abeaa639afdeb2adda5c4ba08e");
        params.put("type","junshi");
        String result = HttpClient.sendGet("http://v.juhe.cn/toutiao/index", params);
        JSONObject resultObject = JSONObject.parseObject(result);
        JSONObject resultJSONO = resultObject.getJSONObject("result");
        JSONArray data = resultJSONO.getJSONArray("data");
        System.out.println(data);
        List list=new ArrayList<String>();
        HashMap map = new HashMap();
        String jsonString = data.toJSONString();
        List<HttpJson> listHttpJson = JSONObject.parseArray(jsonString, HttpJson.class);//将字符串装换成对象,先封装个对象,用来传递数据
        return listHttpJson;
    }


    //体育
    @ResponseBody
    @RequestMapping(value="tiyuzixun",produces= "application/json; charset=utf-8")
    public List tiyuzixun(String type){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("key", "003888abeaa639afdeb2adda5c4ba08e");
        params.put("type","tiyu");
        String result = HttpClient.sendGet("http://v.juhe.cn/toutiao/index", params);
        JSONObject resultObject = JSONObject.parseObject(result);
        JSONObject resultJSONO = resultObject.getJSONObject("result");
        JSONArray data = resultJSONO.getJSONArray("data");
        System.out.println(data);
        List list=new ArrayList<String>();
        HashMap map = new HashMap();
        String jsonString = data.toJSONString();
        List<HttpJson> listHttpJson = JSONObject.parseArray(jsonString, HttpJson.class);//将字符串装换成对象,先封装个对象,用来传递数据
        return listHttpJson;
    }



    //今日头条
    @ResponseBody
    @RequestMapping(value="testxinwen",produces= "application/json; charset=utf-8")
    public List testxinwen(String type){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("key", "ecb31c3e6e927c6d009763e2abb4ee15");
        params.put("type","top");
        String result = HttpClient.sendGet("http://v.juhe.cn/toutiao/index", params);
        JSONObject resultObject = JSONObject.parseObject(result);
        JSONObject resultJSONO = resultObject.getJSONObject("result");
        JSONArray data = resultJSONO.getJSONArray("data");
        System.out.println(data);
        List list=new ArrayList<String>();
        HashMap map = new HashMap();
        String jsonString = data.toJSONString();
        List<HttpJson> listHttpJson = JSONObject.parseArray(jsonString, HttpJson.class);//将字符串装换成对象,先封装个对象,用来传递数据
        return listHttpJson;
    }


    @RequestMapping("queryInformation")
    @ResponseBody
    public List<InformationBean> queryInformation(){
        return drugSerivce.queryInformation();
    }

}
