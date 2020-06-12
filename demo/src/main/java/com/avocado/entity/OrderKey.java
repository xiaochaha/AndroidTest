package com.avocado.entity;

public class OrderKey {
    private Integer cId;

    private Integer fId;

    public OrderKey(Integer cId, Integer fId) {
        this.cId = cId;
        this.fId = fId;
    }

    public OrderKey() {
        super();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }
}