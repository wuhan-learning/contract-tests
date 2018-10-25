package com.otr.wuhan.learning.shared.client.dto;

public class UserDto {
    private String userName;
    private Integer age;
    private String email;
    private String mobile;
    private String remark;

    public UserDto() {
    }

    public UserDto(String userName, Integer age, String email, String mobile, String remark) {
        this.userName = userName;
        this.age = age;
        this.email = email;
        this.mobile = mobile;
        this.remark = remark;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
