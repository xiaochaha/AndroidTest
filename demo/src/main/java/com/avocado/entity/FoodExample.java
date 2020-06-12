package com.avocado.entity;

import java.util.ArrayList;
import java.util.List;

public class FoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFNameIsNull() {
            addCriterion("f_name is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("f_name is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("f_name =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("f_name <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("f_name >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_name >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("f_name <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("f_name <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("f_name like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("f_name not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("f_name in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("f_name not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("f_name between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("f_name not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFPriceIsNull() {
            addCriterion("f_price is null");
            return (Criteria) this;
        }

        public Criteria andFPriceIsNotNull() {
            addCriterion("f_price is not null");
            return (Criteria) this;
        }

        public Criteria andFPriceEqualTo(Double value) {
            addCriterion("f_price =", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceNotEqualTo(Double value) {
            addCriterion("f_price <>", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceGreaterThan(Double value) {
            addCriterion("f_price >", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("f_price >=", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceLessThan(Double value) {
            addCriterion("f_price <", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceLessThanOrEqualTo(Double value) {
            addCriterion("f_price <=", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceIn(List<Double> values) {
            addCriterion("f_price in", values, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceNotIn(List<Double> values) {
            addCriterion("f_price not in", values, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceBetween(Double value1, Double value2) {
            addCriterion("f_price between", value1, value2, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceNotBetween(Double value1, Double value2) {
            addCriterion("f_price not between", value1, value2, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFDiscountIsNull() {
            addCriterion("f_discount is null");
            return (Criteria) this;
        }

        public Criteria andFDiscountIsNotNull() {
            addCriterion("f_discount is not null");
            return (Criteria) this;
        }

        public Criteria andFDiscountEqualTo(Double value) {
            addCriterion("f_discount =", value, "fDiscount");
            return (Criteria) this;
        }

        public Criteria andFDiscountNotEqualTo(Double value) {
            addCriterion("f_discount <>", value, "fDiscount");
            return (Criteria) this;
        }

        public Criteria andFDiscountGreaterThan(Double value) {
            addCriterion("f_discount >", value, "fDiscount");
            return (Criteria) this;
        }

        public Criteria andFDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("f_discount >=", value, "fDiscount");
            return (Criteria) this;
        }

        public Criteria andFDiscountLessThan(Double value) {
            addCriterion("f_discount <", value, "fDiscount");
            return (Criteria) this;
        }

        public Criteria andFDiscountLessThanOrEqualTo(Double value) {
            addCriterion("f_discount <=", value, "fDiscount");
            return (Criteria) this;
        }

        public Criteria andFDiscountIn(List<Double> values) {
            addCriterion("f_discount in", values, "fDiscount");
            return (Criteria) this;
        }

        public Criteria andFDiscountNotIn(List<Double> values) {
            addCriterion("f_discount not in", values, "fDiscount");
            return (Criteria) this;
        }

        public Criteria andFDiscountBetween(Double value1, Double value2) {
            addCriterion("f_discount between", value1, value2, "fDiscount");
            return (Criteria) this;
        }

        public Criteria andFDiscountNotBetween(Double value1, Double value2) {
            addCriterion("f_discount not between", value1, value2, "fDiscount");
            return (Criteria) this;
        }

        public Criteria andFPictureIsNull() {
            addCriterion("f_picture is null");
            return (Criteria) this;
        }

        public Criteria andFPictureIsNotNull() {
            addCriterion("f_picture is not null");
            return (Criteria) this;
        }

        public Criteria andFPictureEqualTo(String value) {
            addCriterion("f_picture =", value, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureNotEqualTo(String value) {
            addCriterion("f_picture <>", value, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureGreaterThan(String value) {
            addCriterion("f_picture >", value, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureGreaterThanOrEqualTo(String value) {
            addCriterion("f_picture >=", value, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureLessThan(String value) {
            addCriterion("f_picture <", value, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureLessThanOrEqualTo(String value) {
            addCriterion("f_picture <=", value, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureLike(String value) {
            addCriterion("f_picture like", value, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureNotLike(String value) {
            addCriterion("f_picture not like", value, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureIn(List<String> values) {
            addCriterion("f_picture in", values, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureNotIn(List<String> values) {
            addCriterion("f_picture not in", values, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureBetween(String value1, String value2) {
            addCriterion("f_picture between", value1, value2, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFPictureNotBetween(String value1, String value2) {
            addCriterion("f_picture not between", value1, value2, "fPicture");
            return (Criteria) this;
        }

        public Criteria andFDescribeIsNull() {
            addCriterion("f_describe is null");
            return (Criteria) this;
        }

        public Criteria andFDescribeIsNotNull() {
            addCriterion("f_describe is not null");
            return (Criteria) this;
        }

        public Criteria andFDescribeEqualTo(String value) {
            addCriterion("f_describe =", value, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeNotEqualTo(String value) {
            addCriterion("f_describe <>", value, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeGreaterThan(String value) {
            addCriterion("f_describe >", value, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("f_describe >=", value, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeLessThan(String value) {
            addCriterion("f_describe <", value, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeLessThanOrEqualTo(String value) {
            addCriterion("f_describe <=", value, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeLike(String value) {
            addCriterion("f_describe like", value, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeNotLike(String value) {
            addCriterion("f_describe not like", value, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeIn(List<String> values) {
            addCriterion("f_describe in", values, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeNotIn(List<String> values) {
            addCriterion("f_describe not in", values, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeBetween(String value1, String value2) {
            addCriterion("f_describe between", value1, value2, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFDescribeNotBetween(String value1, String value2) {
            addCriterion("f_describe not between", value1, value2, "fDescribe");
            return (Criteria) this;
        }

        public Criteria andFQuantityIsNull() {
            addCriterion("f_quantity is null");
            return (Criteria) this;
        }

        public Criteria andFQuantityIsNotNull() {
            addCriterion("f_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andFQuantityEqualTo(Integer value) {
            addCriterion("f_quantity =", value, "fQuantity");
            return (Criteria) this;
        }

        public Criteria andFQuantityNotEqualTo(Integer value) {
            addCriterion("f_quantity <>", value, "fQuantity");
            return (Criteria) this;
        }

        public Criteria andFQuantityGreaterThan(Integer value) {
            addCriterion("f_quantity >", value, "fQuantity");
            return (Criteria) this;
        }

        public Criteria andFQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_quantity >=", value, "fQuantity");
            return (Criteria) this;
        }

        public Criteria andFQuantityLessThan(Integer value) {
            addCriterion("f_quantity <", value, "fQuantity");
            return (Criteria) this;
        }

        public Criteria andFQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("f_quantity <=", value, "fQuantity");
            return (Criteria) this;
        }

        public Criteria andFQuantityIn(List<Integer> values) {
            addCriterion("f_quantity in", values, "fQuantity");
            return (Criteria) this;
        }

        public Criteria andFQuantityNotIn(List<Integer> values) {
            addCriterion("f_quantity not in", values, "fQuantity");
            return (Criteria) this;
        }

        public Criteria andFQuantityBetween(Integer value1, Integer value2) {
            addCriterion("f_quantity between", value1, value2, "fQuantity");
            return (Criteria) this;
        }

        public Criteria andFQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("f_quantity not between", value1, value2, "fQuantity");
            return (Criteria) this;
        }

        public Criteria andFRecommendIsNull() {
            addCriterion("f_recommend is null");
            return (Criteria) this;
        }

        public Criteria andFRecommendIsNotNull() {
            addCriterion("f_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andFRecommendEqualTo(String value) {
            addCriterion("f_recommend =", value, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendNotEqualTo(String value) {
            addCriterion("f_recommend <>", value, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendGreaterThan(String value) {
            addCriterion("f_recommend >", value, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("f_recommend >=", value, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendLessThan(String value) {
            addCriterion("f_recommend <", value, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendLessThanOrEqualTo(String value) {
            addCriterion("f_recommend <=", value, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendLike(String value) {
            addCriterion("f_recommend like", value, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendNotLike(String value) {
            addCriterion("f_recommend not like", value, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendIn(List<String> values) {
            addCriterion("f_recommend in", values, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendNotIn(List<String> values) {
            addCriterion("f_recommend not in", values, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendBetween(String value1, String value2) {
            addCriterion("f_recommend between", value1, value2, "fRecommend");
            return (Criteria) this;
        }

        public Criteria andFRecommendNotBetween(String value1, String value2) {
            addCriterion("f_recommend not between", value1, value2, "fRecommend");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}