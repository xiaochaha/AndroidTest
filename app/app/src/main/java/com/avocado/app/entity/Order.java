package com.avocado.app.entity;

import java.util.Date;

public class Order extends OrderKey {
    private String oId;

    private Integer oQuantity;

    private Double oTotal;

    private String oRemarks;

    private Date oRegtime;

    private Date oCanceltime;

    public Order(Integer cId, Integer fId, String oId, Integer oQuantity, Double oTotal, String oRemarks, Date oRegtime, Date oCanceltime) {
        super(cId, fId);
        this.oId = oId;
        this.oQuantity = oQuantity;
        this.oTotal = oTotal;
        this.oRemarks = oRemarks;
        this.oRegtime = oRegtime;
        this.oCanceltime = oCanceltime;
    }

    public Order() {
        super();
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public Integer getoQuantity() {
        return oQuantity;
    }

    public void setoQuantity(Integer oQuantity) {
        this.oQuantity = oQuantity;
    }

    public Double getoTotal() {
        return oTotal;
    }

    public void setoTotal(Double oTotal) {
        this.oTotal = oTotal;
    }

    public String getoRemarks() {
        return oRemarks;
    }

    public void setoRemarks(String oRemarks) {
        this.oRemarks = oRemarks == null ? null : oRemarks.trim();
    }

    public Date getoRegtime() {
        return oRegtime;
    }

    public void setoRegtime(Date oRegtime) {
        this.oRegtime = oRegtime;
    }

    public Date getoCanceltime() {
        return oCanceltime;
    }

    public void setoCanceltime(Date oCanceltime) {
        this.oCanceltime = oCanceltime;
    }
}