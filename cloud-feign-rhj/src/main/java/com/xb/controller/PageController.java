package com.xb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: medicine
 * @Date: 2019/5/16 21:52
 * @Author: 任豪杰
 * @Description:
 */
@Controller
@RequestMapping("page")
public class PageController {

    //视频中心
    @RequestMapping("shipinzhongxin")
    public String shipinzhongxin(){
        return "shipinzhuanqu";
    }

    //医药会展
    @RequestMapping("yiyaohuizhan")
    public String yiyaohuizhan(){
        return "Medical";
    }

    //医药人才
    @RequestMapping("yaoshi")
    public String yaoshi(){
        return "yaoshiList";
    }

    @RequestMapping("drugList")
    public String drugList(){
        return "drugList";
    }

    //资讯平台
    @RequestMapping("zixun")
    public String zixun(){
        return "zixunpingtai";
    }

    //医药人才
    @RequestMapping("yiyao")
    public String yiyao(){
        return "yiyaorencai";
    }

    //医药详情
    @RequestMapping("ggg")
    public String gg(){
        return "tuangou";
    }

}
