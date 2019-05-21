package com.xb.model;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @program: medicine
 * @Date: 2019/5/16 16:47
 * @Author: 任豪杰
 * @Description:
 */
public class SpecialtyBean {
    private Integer id;
    private String specialtyName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    @Override
    public String toString() {
        return "SpecialtyBean{" +
                "id=" + id +
                ", specialtyName='" + specialtyName + '\'' +
                '}';
    }
}
