package com.avocado.entity;

import java.util.List;

public class Food {
    private Integer fId;

    private String fName;

    private Double fPrice;

    private Double fDiscount;

    private String fPicture;

    private String fDescribe;

    private Integer fQuantity;

    private String fRecommend;

    private Integer categoryId;

    private Category category;

    public Food(String fName, Double fPrice, Double fDiscount, String fPicture, String fDescribe, Integer fQuantity, String fRecommend, Integer categoryId, Category category) {
        this.fId = fId;
        this.fName = fName;
        this.fPrice = fPrice;
        this.fDiscount = fDiscount;
        this.fPicture = fPicture;
        this.fDescribe = fDescribe;
        this.fQuantity = fQuantity;
        this.fRecommend = fRecommend;
        this.categoryId = categoryId;
        this.category = category;
    }

    public Food() {
        super();
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public Double getfPrice() {
        return fPrice;
    }

    public void setfPrice(Double fPrice) {
        this.fPrice = fPrice;
    }

    public Double getfDiscount() {
        return fDiscount;
    }

    public void setfDiscount(Double fDiscount) {
        this.fDiscount = fDiscount;
    }

    public String getfPicture() {
        return fPicture;
    }

    public void setfPicture(String fPicture) {
        this.fPicture = fPicture == null ? null : fPicture.trim();
    }

    public String getfDescribe() {
        return fDescribe;
    }

    public void setfDescribe(String fDescribe) {
        this.fDescribe = fDescribe == null ? null : fDescribe.trim();
    }

    public Integer getfQuantity() {
        return fQuantity;
    }

    public void setfQuantity(Integer fQuantity) {
        this.fQuantity = fQuantity;
    }

    public String getfRecommend() {
        return fRecommend;
    }

    public void setfRecommend(String fRecommend) {
        this.fRecommend = fRecommend == null ? null : fRecommend.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Food(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Food{" +
                "fId=" + fId +
                ", fName='" + fName + '\'' +
                ", fPrice=" + fPrice +
                ", fDiscount=" + fDiscount +
                ", fPicture='" + fPicture + '\'' +
                ", fDescribe='" + fDescribe + '\'' +
                ", fQuantity=" + fQuantity +
                ", fRecommend='" + fRecommend + '\'' +
                ", categoryId=" + categoryId +
                ", category=" + category +
                '}';
    }
}