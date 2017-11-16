package com.zhao.service.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(String value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(String value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(String value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(String value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLike(String value) {
            addCriterion("shopid like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotLike(String value) {
            addCriterion("shopid not like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<String> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<String> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(String value1, String value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(String value1, String value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("shopname is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopname is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopname =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopname <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopname >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopname >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopname <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopname <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopname like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopname not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopname in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopname not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopname between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopname not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShoppriceIsNull() {
            addCriterion("shopprice is null");
            return (Criteria) this;
        }

        public Criteria andShoppriceIsNotNull() {
            addCriterion("shopprice is not null");
            return (Criteria) this;
        }

        public Criteria andShoppriceEqualTo(BigDecimal value) {
            addCriterion("shopprice =", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceNotEqualTo(BigDecimal value) {
            addCriterion("shopprice <>", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceGreaterThan(BigDecimal value) {
            addCriterion("shopprice >", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shopprice >=", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceLessThan(BigDecimal value) {
            addCriterion("shopprice <", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shopprice <=", value, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceIn(List<BigDecimal> values) {
            addCriterion("shopprice in", values, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceNotIn(List<BigDecimal> values) {
            addCriterion("shopprice not in", values, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shopprice between", value1, value2, "shopprice");
            return (Criteria) this;
        }

        public Criteria andShoppriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shopprice not between", value1, value2, "shopprice");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeIsNull() {
            addCriterion("updtime is null");
            return (Criteria) this;
        }

        public Criteria andUpdtimeIsNotNull() {
            addCriterion("updtime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtimeEqualTo(String value) {
            addCriterion("updtime =", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeNotEqualTo(String value) {
            addCriterion("updtime <>", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeGreaterThan(String value) {
            addCriterion("updtime >", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeGreaterThanOrEqualTo(String value) {
            addCriterion("updtime >=", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeLessThan(String value) {
            addCriterion("updtime <", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeLessThanOrEqualTo(String value) {
            addCriterion("updtime <=", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeLike(String value) {
            addCriterion("updtime like", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeNotLike(String value) {
            addCriterion("updtime not like", value, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeIn(List<String> values) {
            addCriterion("updtime in", values, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeNotIn(List<String> values) {
            addCriterion("updtime not in", values, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeBetween(String value1, String value2) {
            addCriterion("updtime between", value1, value2, "updtime");
            return (Criteria) this;
        }

        public Criteria andUpdtimeNotBetween(String value1, String value2) {
            addCriterion("updtime not between", value1, value2, "updtime");
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