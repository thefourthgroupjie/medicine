package com.xb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("goshop")
    public String goshop(){
        return "mycar";
    }

    @RequestMapping("goxiadan")
    public String goxiadan(){
        return "xiadan";
    }
    @RequestMapping("toShouye")
    public String toShouye(){
        return "shouye";
    }


}
