package com.xb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("page")
public class PageController {

    /**
     * 活动跳转页面
     * @return
     */
    @RequestMapping("activity")
    public String activity(){
        return "hd";
    }

    /**
     * 详情信息
     * @return
     */
    @RequestMapping("spxq")
    public String spxq(){
        return "shangp";
    }

    /**
     *商品详情跳转页面
     * @return
     */
    @RequestMapping("acdetails")
    public String details(){
        return "details";
    }
    /**
     *商品详情秒杀跳转更多页面
     * @return
     */
    @RequestMapping("more")
    public String More(){
        return "More";
    }
    /**
     *商品团购专区跳转更多页面
     * @return
     */
    @RequestMapping("group")
    public String Group(){
        return "Group";
    }
    /**
     *商品积分专区跳转更多页面
     * @return
     */
    @RequestMapping("integral")
    public String Integral(){
        return "Integral";
    }
    /**
     *商品买赠专区跳转更多页面
     * @return
     */
    @RequestMapping("Gift")
    public String Gift(){
        return "Gift";
    }
    /**
     *商品秒杀介绍跳转页面
     * @return
     */
    @RequestMapping("MSintroduceOne")
    public String MSintroduceOne(){
        return "xiangqing";
    }
}
