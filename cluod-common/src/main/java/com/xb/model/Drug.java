package com.xb.model;


public class Drug {

    private Integer id;

    private String name;

    private Integer zhutype;

    private Integer futype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getZhutype() {
        return zhutype;
    }

    public void setZhutype(Integer zhutype) {
        this.zhutype = zhutype;
    }

    public Integer getFutype() {
        return futype;
    }

    public void setFutype(Integer futype) {
        this.futype = futype;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", zhutype=" + zhutype +
                ", futype=" + futype +
                '}';
    }
}
