package com.xb.model;

import java.io.Serializable;

public class DrugBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;

    private  Integer id;

    private  Integer drugId;

    private  String drugName;

    private  String drugForm;

    private  String drugChara;

    private  String specification;

    private  Integer conversion;

    private  String unit;

    private  String packingUnit;

    private  String directoryType;

    private  String manEnterprise;

    private  String shoEnterprise;

    private  String price;

    private  String retail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugForm() {
        return drugForm;
    }

    public void setDrugForm(String drugForm) {
        this.drugForm = drugForm;
    }

    public String getDrugChara() {
        return drugChara;
    }

    public void setDrugChara(String drugChara) {
        this.drugChara = drugChara;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getConversion() {
        return conversion;
    }

    public void setConversion(Integer conversion) {
        this.conversion = conversion;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit;
    }

    public String getDirectoryType() {
        return directoryType;
    }

    public void setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
    }

    public String getManEnterprise() {
        return manEnterprise;
    }

    public void setManEnterprise(String manEnterprise) {
        this.manEnterprise = manEnterprise;
    }

    public String getShoEnterprise() {
        return shoEnterprise;
    }

    public void setShoEnterprise(String shoEnterprise) {
        this.shoEnterprise = shoEnterprise;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRetail() {
        return retail;
    }

    public void setRetail(String retail) {
        this.retail = retail;
    }

    @Override
    public String toString() {
        return "DrugBean{" +
                "id=" + id +
                ", drugId=" + drugId +
                ", drugName='" + drugName + '\'' +
                ", drugForm='" + drugForm + '\'' +
                ", drugChara='" + drugChara + '\'' +
                ", specification='" + specification + '\'' +
                ", conversion=" + conversion +
                ", unit='" + unit + '\'' +
                ", packingUnit='" + packingUnit + '\'' +
                ", directoryType='" + directoryType + '\'' +
                ", manEnterprise='" + manEnterprise + '\'' +
                ", shoEnterprise='" + shoEnterprise + '\'' +
                ", price='" + price + '\'' +
                ", retail='" + retail + '\'' +
                '}';
    }
}
