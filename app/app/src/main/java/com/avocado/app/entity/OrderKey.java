package com.avocado.app.entity;

public class OrderKey {

    private Integer cId;
    private Integer fId;
    private Customer customer;
    private Food food;

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}