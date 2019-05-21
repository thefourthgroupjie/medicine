package com.xb.model;

import java.io.Serializable;

public class XqdetailsBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;
    private Integer id;
    private String picture;
    private String name;
    private String gg;
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

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public Integer getJg() {
        return jg;
    }

    public void setJg(Integer jg) {
        this.jg = jg;
    }

    @Override
    public String toString() {
        return "XqdetailsBean{" +
                "id=" + id +
                ", picture='" + picture + '\'' +
                ", name='" + name + '\'' +
                ", gg='" + gg + '\'' +
                ", jg=" + jg +
                '}';
    }
}
