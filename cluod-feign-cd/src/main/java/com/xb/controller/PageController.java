package com.xb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {
    /**
     * 跳转注册
     * @return
     */
    @RequestMapping("zhuce")
    public String zhuce(){
        return "zhuce";
    }

    /**
     * 跳登陆界面
     *
     * @return
     */
    @RequestMapping("toLogin")
    public String toLogin() {
        return "denglu";
    }

    @RequestMapping("toMain")
    public String toMain() {
        return "main";
    }

    @RequestMapping("wangji")
    public String wangji(){
        return "wangji";
    }
}