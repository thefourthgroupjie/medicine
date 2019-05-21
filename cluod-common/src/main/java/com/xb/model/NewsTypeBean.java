package com.xb.model;

/**
 * @program: medicine
 * @Date: 2019/5/16 16:38
 * @Author: 任豪杰
 * @Description:
 */
public class NewsTypeBean {
    private Integer id;
    private String TypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    @Override
    public String toString() {
        return "NewsTypeBean{" +
                "id=" + id +
                ", TypeName='" + TypeName + '\'' +
                '}';
    }
}
