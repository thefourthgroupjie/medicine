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

    @RequestMapping("yiyaohuizhan")
    public String yiyaohuizhan(){
        return "Medical";
    }

    @RequestMapping("yaoshi")
    public String yaoshi(){
        return "yaoshiList";
    }

    @RequestMapping("drugList")
    public String drugList(){
        return "drugList";
    }

    @RequestMapping("zixun")
    public String zixun(){
        return "zixunpingtai";
    }

    @RequestMapping("yiyao")
    public String yiyao(){
        return "yiyaorencai";
    }

    @RequestMapping("hd")
    public String hd(){
        return "hd";
    }
    @RequestMapping("ggg")
    public String gg(){
        return "tuangou";
    }

}
