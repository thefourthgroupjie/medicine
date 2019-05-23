package com.xb.model;

public class UserBean {

    private Integer id;

    private String userName;

    private String userPhone;

    private String userPwd;

    private String userEmail;

    private Integer stuats;

    public Integer getStuats() {
        return stuats;
    }

    public void setStuats(Integer stuats) {
        this.stuats = stuats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
