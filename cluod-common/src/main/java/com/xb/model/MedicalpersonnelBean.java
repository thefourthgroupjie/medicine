package com.xb.model;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.Serializable;

/**
 * @program: medicine
 * @Date: 2019/5/16 16:39
 * @Author: 任豪杰
 * @Description:
 */
public class MedicalpersonnelBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;
    private Integer id;
    //图片
    private String talentsimg;
    //性别
    private String sex;
    //专业
    private Integer specialtyId;
    private String specialtyName;

    //工作区域
    private String workingArea;
    //入职条件
    private String entryRequirement;
    //手机号
    private Integer cellPhoneNumber;

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTalentsimg() {
        return talentsimg;
    }

    public void setTalentsimg(String talentsimg) {
        this.talentsimg = talentsimg;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(Integer specialtyId) {
        this.specialtyId = specialtyId;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public String getEntryRequirement() {
        return entryRequirement;
    }

    public void setEntryRequirement(String entryRequirement) {
        this.entryRequirement = entryRequirement;
    }

    public Integer getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(Integer cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    @Override
    public String toString() {
        return "MedicalpersonnelBean{" +
                "id=" + id +
                ", talentsimg='" + talentsimg + '\'' +
                ", sex='" + sex + '\'' +
                ", specialtyId=" + specialtyId +
                ", specialtyName='" + specialtyName + '\'' +
                ", workingArea='" + workingArea + '\'' +
                ", entryRequirement='" + entryRequirement + '\'' +
                ", cellPhoneNumber=" + cellPhoneNumber +
                '}';
    }
}
