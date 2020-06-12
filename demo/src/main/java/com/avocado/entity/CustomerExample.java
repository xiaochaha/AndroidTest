package com.avocado.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCUsernameIsNull() {
            addCriterion("c_username is null");
            return (Criteria) this;
        }

        public Criteria andCUsernameIsNotNull() {
            addCriterion("c_username is not null");
            return (Criteria) this;
        }

        public Criteria andCUsernameEqualTo(String value) {
            addCriterion("c_username =", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotEqualTo(String value) {
            addCriterion("c_username <>", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThan(String value) {
            addCriterion("c_username >", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("c_username >=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThan(String value) {
            addCriterion("c_username <", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThanOrEqualTo(String value) {
            addCriterion("c_username <=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLike(String value) {
            addCriterion("c_username like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotLike(String value) {
            addCriterion("c_username not like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameIn(List<String> values) {
            addCriterion("c_username in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotIn(List<String> values) {
            addCriterion("c_username not in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameBetween(String value1, String value2) {
            addCriterion("c_username between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotBetween(String value1, String value2) {
            addCriterion("c_username not between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNull() {
            addCriterion("c_password is null");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNotNull() {
            addCriterion("c_password is not null");
            return (Criteria) this;
        }

        public Criteria andCPasswordEqualTo(String value) {
            addCriterion("c_password =", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotEqualTo(String value) {
            addCriterion("c_password <>", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThan(String value) {
            addCriterion("c_password >", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_password >=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThan(String value) {
            addCriterion("c_password <", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThanOrEqualTo(String value) {
            addCriterion("c_password <=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLike(String value) {
            addCriterion("c_password like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotLike(String value) {
            addCriterion("c_password not like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordIn(List<String> values) {
            addCriterion("c_password in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotIn(List<String> values) {
            addCriterion("c_password not in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordBetween(String value1, String value2) {
            addCriterion("c_password between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotBetween(String value1, String value2) {
            addCriterion("c_password not between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNull() {
            addCriterion("c_phone is null");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNotNull() {
            addCriterion("c_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCPhoneEqualTo(String value) {
            addCriterion("c_phone =", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotEqualTo(String value) {
            addCriterion("c_phone <>", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThan(String value) {
            addCriterion("c_phone >", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_phone >=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThan(String value) {
            addCriterion("c_phone <", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThanOrEqualTo(String value) {
            addCriterion("c_phone <=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLike(String value) {
            addCriterion("c_phone like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotLike(String value) {
            addCriterion("c_phone not like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneIn(List<String> values) {
            addCriterion("c_phone in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotIn(List<String> values) {
            addCriterion("c_phone not in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneBetween(String value1, String value2) {
            addCriterion("c_phone between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotBetween(String value1, String value2) {
            addCriterion("c_phone not between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCTableIsNull() {
            addCriterion("c_table is null");
            return (Criteria) this;
        }

        public Criteria andCTableIsNotNull() {
            addCriterion("c_table is not null");
            return (Criteria) this;
        }

        public Criteria andCTableEqualTo(String value) {
            addCriterion("c_table =", value, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableNotEqualTo(String value) {
            addCriterion("c_table <>", value, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableGreaterThan(String value) {
            addCriterion("c_table >", value, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableGreaterThanOrEqualTo(String value) {
            addCriterion("c_table >=", value, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableLessThan(String value) {
            addCriterion("c_table <", value, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableLessThanOrEqualTo(String value) {
            addCriterion("c_table <=", value, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableLike(String value) {
            addCriterion("c_table like", value, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableNotLike(String value) {
            addCriterion("c_table not like", value, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableIn(List<String> values) {
            addCriterion("c_table in", values, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableNotIn(List<String> values) {
            addCriterion("c_table not in", values, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableBetween(String value1, String value2) {
            addCriterion("c_table between", value1, value2, "cTable");
            return (Criteria) this;
        }

        public Criteria andCTableNotBetween(String value1, String value2) {
            addCriterion("c_table not between", value1, value2, "cTable");
            return (Criteria) this;
        }

        public Criteria andCRegtimeIsNull() {
            addCriterion("c_regtime is null");
            return (Criteria) this;
        }

        public Criteria andCRegtimeIsNotNull() {
            addCriterion("c_regtime is not null");
            return (Criteria) this;
        }

        public Criteria andCRegtimeEqualTo(Date value) {
            addCriterion("c_regtime =", value, "cRegtime");
            return (Criteria) this;
        }

        public Criteria andCRegtimeNotEqualTo(Date value) {
            addCriterion("c_regtime <>", value, "cRegtime");
            return (Criteria) this;
        }

        public Criteria andCRegtimeGreaterThan(Date value) {
            addCriterion("c_regtime >", value, "cRegtime");
            return (Criteria) this;
        }

        public Criteria andCRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_regtime >=", value, "cRegtime");
            return (Criteria) this;
        }

        public Criteria andCRegtimeLessThan(Date value) {
            addCriterion("c_regtime <", value, "cRegtime");
            return (Criteria) this;
        }

        public Criteria andCRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("c_regtime <=", value, "cRegtime");
            return (Criteria) this;
        }

        public Criteria andCRegtimeIn(List<Date> values) {
            addCriterion("c_regtime in", values, "cRegtime");
            return (Criteria) this;
        }

        public Criteria andCRegtimeNotIn(List<Date> values) {
            addCriterion("c_regtime not in", values, "cRegtime");
            return (Criteria) this;
        }

        public Criteria andCRegtimeBetween(Date value1, Date value2) {
            addCriterion("c_regtime between", value1, value2, "cRegtime");
            return (Criteria) this;
        }

        public Criteria andCRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("c_regtime not between", value1, value2, "cRegtime");
            return (Criteria) this;
        }

        public Criteria andCFrequencyIsNull() {
            addCriterion("c_frequency is null");
            return (Criteria) this;
        }

        public Criteria andCFrequencyIsNotNull() {
            addCriterion("c_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andCFrequencyEqualTo(Integer value) {
            addCriterion("c_frequency =", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyNotEqualTo(Integer value) {
            addCriterion("c_frequency <>", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyGreaterThan(Integer value) {
            addCriterion("c_frequency >", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_frequency >=", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyLessThan(Integer value) {
            addCriterion("c_frequency <", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("c_frequency <=", value, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyIn(List<Integer> values) {
            addCriterion("c_frequency in", values, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyNotIn(List<Integer> values) {
            addCriterion("c_frequency not in", values, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("c_frequency between", value1, value2, "cFrequency");
            return (Criteria) this;
        }

        public Criteria andCFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("c_frequency not between", value1, value2, "cFrequency");
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