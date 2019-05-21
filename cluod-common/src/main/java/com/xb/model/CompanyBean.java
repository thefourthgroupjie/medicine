package com.xb.model;

import java.io.Serializable;
//商业公司实体bean
public class CompanyBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;

    private Integer id;

    private String companyName;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "CompanyBean{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
