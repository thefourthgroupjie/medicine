package model;

import java.io.Serializable;

public class ShopModel implements Serializable {

    private static final long serialVersionUID = 606418059593846595L;

    private Integer id;

    private String name;

    private String drugdetails;

    private String drugimg;

    private String drugfuction;

    private Integer kucun;

    private Integer drugid;

    private Double price;

    private Integer shulian;

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

    public String getDrugdetails() {
        return drugdetails;
    }

    public void setDrugdetails(String drugdetails) {
        this.drugdetails = drugdetails;
    }

    public String getDrugimg() {
        return drugimg;
    }

    public void setDrugimg(String drugimg) {
        this.drugimg = drugimg;
    }

    public String getDrugfuction() {
        return drugfuction;
    }

    public void setDrugfuction(String drugfuction) {
        this.drugfuction = drugfuction;
    }

    public Integer getKucun() {
        return kucun;
    }

    public void setKucun(Integer kucun) {
        this.kucun = kucun;
    }

    public Integer getDrugid() {
        return drugid;
    }

    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getShulian() {
        return shulian;
    }

    public void setShulian(Integer shulian) {
        this.shulian = shulian;
    }

    @Override
    public String toString() {
        return "ShopModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", drugdetails='" + drugdetails + '\'' +
                ", drugimg='" + drugimg + '\'' +
                ", drugfuction='" + drugfuction + '\'' +
                ", kucun=" + kucun +
                ", drugid=" + drugid +
                ", price=" + price +
                ", shulian=" + shulian +
                '}';
    }
}
