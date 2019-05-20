package com.xb.model;

public class DeptBean {
    private Integer id;
    private String deptName;
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "DeptBean{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", pid=" + pid +
                '}';
    }
}
