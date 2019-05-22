package com.xb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("queryQiye")

    public String queryQiye(){

        return "queryQiye";
    }
    @RequestMapping("toquery")

    public String query(){

        return "query";
    }

    @RequestMapping("mySql")
    public String mySql(){

        return "mySql";
    }

    @RequestMapping("queryDianpu")
    public String queryDianpu(){

        return "queryDianpu";
    }

    @RequestMapping("cheshi")
    public String cheshi(){

        return "cheshi";
    }

    @RequestMapping("guanyu")
    public String xiangq(){

        return "guanyu";
    }
    @RequestMapping("hsoucang")
    public String hsoucang(){

        return "hsoucang";
    }
    @RequestMapping("addimg")
    public String addimg(){
        return "addimg";
    }

}