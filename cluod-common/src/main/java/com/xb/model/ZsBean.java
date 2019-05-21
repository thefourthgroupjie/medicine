package com.xb.model;

import java.io.Serializable;

public class ZsBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;

    private String id;

    private String name;

    private String guage;

    private String shenc;

    private String quyu;

    private String time;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuage() {
        return guage;
    }

    public void setGuage(String guage) {
        this.guage = guage;
    }

    public String getShenc() {
        return shenc;
    }

    public void setShenc(String shenc) {
        this.shenc = shenc;
    }

    public String getQuyu() {
        return quyu;
    }

    public void setQuyu(String quyu) {
        this.quyu = quyu;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ZsBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", guage='" + guage + '\'' +
                ", shenc='" + shenc + '\'' +
                ", quyu='" + quyu + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
