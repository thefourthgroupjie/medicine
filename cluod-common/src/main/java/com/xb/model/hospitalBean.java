package com.xb.model;

import java.io.Serializable;

public class hospitalBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;

    private Integer id;

    private String hospitalName;

    private String site;

    private String contactWay;

    private String hospitalLevel;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    @Override
    public String toString() {
        return "hospitalBean{" +
                "id=" + id +
                ", hospitalName='" + hospitalName + '\'' +
                ", site='" + site + '\'' +
                ", contactWay='" + contactWay + '\'' +
                ", hospitalLevel='" + hospitalLevel + '\'' +
                '}';
    }
}
