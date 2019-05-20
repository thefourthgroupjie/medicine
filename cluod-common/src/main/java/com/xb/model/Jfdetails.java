package com.xb.model;

public class Jfdetails {
    private Integer id;

    private  String picture;

    private String name;

    private Integer jf;

    private Integer jg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJf() {
        return jf;
    }

    public void setJf(Integer jf) {
        this.jf = jf;
    }

    public Integer getJg() {
        return jg;
    }

    public void setJg(Integer jg) {
        this.jg = jg;
    }

    @Override
    public String toString() {
        return "Jfdetails{" +
                "id=" + id +
                ", picture='" + picture + '\'' +
                ", name='" + name + '\'' +
                ", jf=" + jf +
                ", jg=" + jg +
                '}';
    }
}
