package com.xb.model;

import java.io.Serializable;

public class DrugType implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;

    private Integer id;

    private String name;

    private Integer drugid;

    private Integer typeid;

    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

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

    public Integer getDrugid() {
        return drugid;
    }

    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    @Override
    public String toString() {
        return "DrugType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", drugid=" + drugid +
                ", typeid=" + typeid +
                ", picture='" + picture + '\'' +
                '}';
    }
}
