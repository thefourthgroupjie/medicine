package com.xb.model;

import java.io.Serializable;

public class GyxxBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String guge;
    private String lxdh;
    private String lxr;
    private String shul;
    private String time;
    private Integer typeId;
    private String  typeName;

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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "GyxxBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guge='" + guge + '\'' +
                ", lxdh='" + lxdh + '\'' +
                ", lxr='" + lxr + '\'' +
                ", shul='" + shul + '\'' +
                ", time='" + time + '\'' +
                ", typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
