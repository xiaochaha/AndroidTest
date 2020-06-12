package com.avocado.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(String value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(String value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(String value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(String value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(String value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(String value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLike(String value) {
            addCriterion("o_id like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotLike(String value) {
            addCriterion("o_id not like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<String> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<String> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(String value1, String value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(String value1, String value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOQuantityIsNull() {
            addCriterion("o_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOQuantityIsNotNull() {
            addCriterion("o_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOQuantityEqualTo(Integer value) {
            addCriterion("o_quantity =", value, "oQuantity");
            return (Criteria) this;
        }

        public Criteria andOQuantityNotEqualTo(Integer value) {
            addCriterion("o_quantity <>", value, "oQuantity");
            return (Criteria) this;
        }

        public Criteria andOQuantityGreaterThan(Integer value) {
            addCriterion("o_quantity >", value, "oQuantity");
            return (Criteria) this;
        }

        public Criteria andOQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_quantity >=", value, "oQuantity");
            return (Criteria) this;
        }

        public Criteria andOQuantityLessThan(Integer value) {
            addCriterion("o_quantity <", value, "oQuantity");
            return (Criteria) this;
        }

        public Criteria andOQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("o_quantity <=", value, "oQuantity");
            return (Criteria) this;
        }

        public Criteria andOQuantityIn(List<Integer> values) {
            addCriterion("o_quantity in", values, "oQuantity");
            return (Criteria) this;
        }

        public Criteria andOQuantityNotIn(List<Integer> values) {
            addCriterion("o_quantity not in", values, "oQuantity");
            return (Criteria) this;
        }

        public Criteria andOQuantityBetween(Integer value1, Integer value2) {
            addCriterion("o_quantity between", value1, value2, "oQuantity");
            return (Criteria) this;
        }

        public Criteria andOQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("o_quantity not between", value1, value2, "oQuantity");
            return (Criteria) this;
        }

        public Criteria andOTotalIsNull() {
            addCriterion("o_total is null");
            return (Criteria) this;
        }

        public Criteria andOTotalIsNotNull() {
            addCriterion("o_total is not null");
            return (Criteria) this;
        }

        public Criteria andOTotalEqualTo(Double value) {
            addCriterion("o_total =", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalNotEqualTo(Double value) {
            addCriterion("o_total <>", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalGreaterThan(Double value) {
            addCriterion("o_total >", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("o_total >=", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalLessThan(Double value) {
            addCriterion("o_total <", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalLessThanOrEqualTo(Double value) {
            addCriterion("o_total <=", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalIn(List<Double> values) {
            addCriterion("o_total in", values, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalNotIn(List<Double> values) {
            addCriterion("o_total not in", values, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalBetween(Double value1, Double value2) {
            addCriterion("o_total between", value1, value2, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalNotBetween(Double value1, Double value2) {
            addCriterion("o_total not between", value1, value2, "oTotal");
            return (Criteria) this;
        }

        public Criteria andORemarksIsNull() {
            addCriterion("o_remarks is null");
            return (Criteria) this;
        }

        public Criteria andORemarksIsNotNull() {
            addCriterion("o_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andORemarksEqualTo(String value) {
            addCriterion("o_remarks =", value, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksNotEqualTo(String value) {
            addCriterion("o_remarks <>", value, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksGreaterThan(String value) {
            addCriterion("o_remarks >", value, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksGreaterThanOrEqualTo(String value) {
            addCriterion("o_remarks >=", value, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksLessThan(String value) {
            addCriterion("o_remarks <", value, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksLessThanOrEqualTo(String value) {
            addCriterion("o_remarks <=", value, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksLike(String value) {
            addCriterion("o_remarks like", value, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksNotLike(String value) {
            addCriterion("o_remarks not like", value, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksIn(List<String> values) {
            addCriterion("o_remarks in", values, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksNotIn(List<String> values) {
            addCriterion("o_remarks not in", values, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksBetween(String value1, String value2) {
            addCriterion("o_remarks between", value1, value2, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORemarksNotBetween(String value1, String value2) {
            addCriterion("o_remarks not between", value1, value2, "oRemarks");
            return (Criteria) this;
        }

        public Criteria andORegtimeIsNull() {
            addCriterion("o_regtime is null");
            return (Criteria) this;
        }

        public Criteria andORegtimeIsNotNull() {
            addCriterion("o_regtime is not null");
            return (Criteria) this;
        }

        public Criteria andORegtimeEqualTo(Date value) {
            addCriterion("o_regtime =", value, "oRegtime");
            return (Criteria) this;
        }

        public Criteria andORegtimeNotEqualTo(Date value) {
            addCriterion("o_regtime <>", value, "oRegtime");
            return (Criteria) this;
        }

        public Criteria andORegtimeGreaterThan(Date value) {
            addCriterion("o_regtime >", value, "oRegtime");
            return (Criteria) this;
        }

        public Criteria andORegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_regtime >=", value, "oRegtime");
            return (Criteria) this;
        }

        public Criteria andORegtimeLessThan(Date value) {
            addCriterion("o_regtime <", value, "oRegtime");
            return (Criteria) this;
        }

        public Criteria andORegtimeLessThanOrEqualTo(Date value) {
            addCriterion("o_regtime <=", value, "oRegtime");
            return (Criteria) this;
        }

        public Criteria andORegtimeIn(List<Date> values) {
            addCriterion("o_regtime in", values, "oRegtime");
            return (Criteria) this;
        }

        public Criteria andORegtimeNotIn(List<Date> values) {
            addCriterion("o_regtime not in", values, "oRegtime");
            return (Criteria) this;
        }

        public Criteria andORegtimeBetween(Date value1, Date value2) {
            addCriterion("o_regtime between", value1, value2, "oRegtime");
            return (Criteria) this;
        }

        public Criteria andORegtimeNotBetween(Date value1, Date value2) {
            addCriterion("o_regtime not between", value1, value2, "oRegtime");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeIsNull() {
            addCriterion("o_canceltime is null");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeIsNotNull() {
            addCriterion("o_canceltime is not null");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeEqualTo(Date value) {
            addCriterion("o_canceltime =", value, "oCanceltime");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeNotEqualTo(Date value) {
            addCriterion("o_canceltime <>", value, "oCanceltime");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeGreaterThan(Date value) {
            addCriterion("o_canceltime >", value, "oCanceltime");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_canceltime >=", value, "oCanceltime");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeLessThan(Date value) {
            addCriterion("o_canceltime <", value, "oCanceltime");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeLessThanOrEqualTo(Date value) {
            addCriterion("o_canceltime <=", value, "oCanceltime");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeIn(List<Date> values) {
            addCriterion("o_canceltime in", values, "oCanceltime");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeNotIn(List<Date> values) {
            addCriterion("o_canceltime not in", values, "oCanceltime");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeBetween(Date value1, Date value2) {
            addCriterion("o_canceltime between", value1, value2, "oCanceltime");
            return (Criteria) this;
        }

        public Criteria andOCanceltimeNotBetween(Date value1, Date value2) {
            addCriterion("o_canceltime not between", value1, value2, "oCanceltime");
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