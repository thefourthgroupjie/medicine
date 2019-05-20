package com.xb.model;

import java.io.Serializable;

public class DrugStoreBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;

    private Integer id;

    private String drugstoreName;

    private  String site;

    private  String contactway;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugstoreName() {
        return drugstoreName;
    }

    public void setDrugstoreName(String drugstoreName) {
        this.drugstoreName = drugstoreName;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getContactway() {
        return contactway;
    }

    public void setContactway(String contactway) {
        this.contactway = contactway;
    }

    @Override
    public String toString() {
        return "DrugStoreBean{" +
                "id=" + id +
                ", drugstoreName='" + drugstoreName + '\'' +
                ", site='" + site + '\'' +
                ", contactway='" + contactway + '\'' +
                '}';
    }
}
