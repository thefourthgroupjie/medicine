package com.xb.model;

import javafx.scene.text.Text;

import java.awt.*;
import java.io.Serializable;

/**
 * @program: medicine
 * @Date: 2019/5/16 16:05
 * @Author: 任豪杰
 * @Description:
 */
public class InformationBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;
    private Integer id;
    //新闻类型
    private Integer newsTypeId;

    private String newsTypeName;
    //标题
    private String headline;
    //发布时间
    private String releaseTime;
    //作者
    private String author;
    //来源
    private String source;
    //内容
    private String details;
    //图片
    private String newsimg;
    //阅读数量
    private Integer readingQuantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(Integer newsTypeId) {
        this.newsTypeId = newsTypeId;
    }

    public String getNewsTypeName() {
        return newsTypeName;
    }

    public void setNewsTypeName(String newsTypeName) {
        this.newsTypeName = newsTypeName;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getNewsimg() {
        return newsimg;
    }

    public void setNewsimg(String newsimg) {
        this.newsimg = newsimg;
    }

    public Integer getReadingQuantity() {
        return readingQuantity;
    }

    public void setReadingQuantity(Integer readingQuantity) {
        this.readingQuantity = readingQuantity;
    }

    @Override
    public String toString() {
        return "InformationBean{" +
                "id=" + id +
                ", newsTypeId=" + newsTypeId +
                ", newsTypeName='" + newsTypeName + '\'' +
                ", headline='" + headline + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", author='" + author + '\'' +
                ", source='" + source + '\'' +
                ", details='" + details + '\'' +
                ", newsimg='" + newsimg + '\'' +
                ", readingQuantity=" + readingQuantity +
                '}';
    }
}
