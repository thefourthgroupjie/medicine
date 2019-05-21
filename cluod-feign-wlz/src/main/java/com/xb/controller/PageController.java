package com.xb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    //招商/代理
    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }

    //招商信息
    @RequestMapping("toDaiLi")
    public String toDaiLi(){
        return "add";
    }
    //代理信息
    @RequestMapping("toDaiLi2")
    public String toDaiLi2(){
        return "add2";
    }
    //供应信息
    @RequestMapping("toGlxx")
    public String toGlxx() {
        return "gunying";
    }

    //求购信息
    @RequestMapping("toGlxx2")
    public String toGlxx2() {
        return "gunying2";
    }
}
