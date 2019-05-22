package com.xb.model;


import java.io.Serializable;

public class Drug implements Serializable {

    private static final long serialVersionUID = -2430219220702731185L;
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
