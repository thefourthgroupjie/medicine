package com.xb.model;

import java.io.Serializable;

public class ConventionBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;

    private Integer id;

    private String name;



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

    @Override
    public String toString() {
        return "ConventionBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
