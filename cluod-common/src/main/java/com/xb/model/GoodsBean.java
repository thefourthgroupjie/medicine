package com.xb.model;

import java.util.Date;

public class GoodsBean {
    private Integer id;
    private String name;
    private String guge;
    private String lxdh;
    private String lxr;
    private String shul;

    private String time;
    private Integer sheId;
    private String sheName;
    private Integer shiId;
    private String shiName;
    private Integer quId;
    private String quName;

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

    public String getGuge() {
        return guge;
    }

    public void setGuge(String guge) {
        this.guge = guge;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public String getShul() {
        return shul;
    }

    public void setShul(String shul) {
        this.shul = shul;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getSheId() {
        return sheId;
    }

    public void setSheId(Integer sheId) {
        this.sheId = sheId;
    }

    public String getSheName() {
        return sheName;
    }

    public void setSheName(String sheName) {
        this.sheName = sheName;
    }

    public Integer getShiId() {
        return shiId;
    }

    public void setShiId(Integer shiId) {
        this.shiId = shiId;
    }

    public String getShiName() {
        return shiName;
    }

    public void setShiName(String shiName) {
        this.shiName = shiName;
    }

    public Integer getQuId() {
        return quId;
    }

    public void setQuId(Integer quId) {
        this.quId = quId;
    }

    public String getQuName() {
        return quName;
    }

    public void setQuName(String quName) {
        this.quName = quName;
    }

    @Override
    public String toString() {
        return "GoodsBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guge='" + guge + '\'' +
                ", lxdh='" + lxdh + '\'' +
                ", lxr='" + lxr + '\'' +
                ", shul='" + shul + '\'' +
                ", time='" + time + '\'' +
                ", sheId=" + sheId +
                ", sheName='" + sheName + '\'' +
                ", shiId=" + shiId +
                ", shiName='" + shiName + '\'' +
                ", quId=" + quId +
                ", quName='" + quName + '\'' +
                '}';
    }
}
