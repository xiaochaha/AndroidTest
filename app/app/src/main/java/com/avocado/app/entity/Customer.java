package com.avocado.app.entity;



import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Customer {

    @JSONField(name = "cId")
    private Integer cId;

    @JSONField(name = "cUsername")
    private String cUsername;

    @JSONField(name = "cPassword")
    private String cPassword;

    @JSONField(name = "cPhone")
    private String cPhone;

    @JSONField(name = "cTable")
    private String cTable;

    @JSONField(name = "cRegtime")
    private Date cRegtime;

    @JSONField(name = "cFrequency")
    private Integer cFrequency;

    public Customer(String cUsername, String cPassword, String cPhone, String cTable, Date cRegtime, Integer cFrequency) {
        this.cId = cId;
        this.cUsername = cUsername;
        this.cPassword = cPassword;
        this.cPhone = cPhone;
        this.cTable = cTable;
        this.cRegtime = cRegtime;
        this.cFrequency = cFrequency;
    }

    public Customer() {
        super();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername == null ? null : cUsername.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone == null ? null : cPhone.trim();
    }

    public String getcTable() {
        return cTable;
    }

    public void setcTable(String cTable) {
        this.cTable = cTable == null ? null : cTable.trim();
    }

    public Date getcRegtime() {
        return cRegtime;
    }

    public void setcRegtime(Date cRegtime) {
        this.cRegtime = cRegtime;
    }

    public Integer getcFrequency() {
        return cFrequency;
    }

    public void setcFrequency(Integer cFrequency) {
        this.cFrequency = cFrequency;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cId=" + cId +
                ", cUsername='" + cUsername + '\'' +
                ", cPassword='" + cPassword + '\'' +
                ", cPhone='" + cPhone + '\'' +
                ", cTable='" + cTable + '\'' +
                ", cRegtime=" + cRegtime +
                ", cFrequency=" + cFrequency +
                '}';
    }
}