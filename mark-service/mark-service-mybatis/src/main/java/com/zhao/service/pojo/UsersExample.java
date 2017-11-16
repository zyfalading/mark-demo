package com.zhao.service.pojo;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUageIsNull() {
            addCriterion("uage is null");
            return (Criteria) this;
        }

        public Criteria andUageIsNotNull() {
            addCriterion("uage is not null");
            return (Criteria) this;
        }

        public Criteria andUageEqualTo(Integer value) {
            addCriterion("uage =", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotEqualTo(Integer value) {
            addCriterion("uage <>", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageGreaterThan(Integer value) {
            addCriterion("uage >", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageGreaterThanOrEqualTo(Integer value) {
            addCriterion("uage >=", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageLessThan(Integer value) {
            addCriterion("uage <", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageLessThanOrEqualTo(Integer value) {
            addCriterion("uage <=", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageIn(List<Integer> values) {
            addCriterion("uage in", values, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotIn(List<Integer> values) {
            addCriterion("uage not in", values, "uage");
            return (Criteria) this;
        }

        public Criteria andUageBetween(Integer value1, Integer value2) {
            addCriterion("uage between", value1, value2, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotBetween(Integer value1, Integer value2) {
            addCriterion("uage not between", value1, value2, "uage");
            return (Criteria) this;
        }

        public Criteria andUsexIsNull() {
            addCriterion("usex is null");
            return (Criteria) this;
        }

        public Criteria andUsexIsNotNull() {
            addCriterion("usex is not null");
            return (Criteria) this;
        }

        public Criteria andUsexEqualTo(String value) {
            addCriterion("usex =", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotEqualTo(String value) {
            addCriterion("usex <>", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThan(String value) {
            addCriterion("usex >", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThanOrEqualTo(String value) {
            addCriterion("usex >=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThan(String value) {
            addCriterion("usex <", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThanOrEqualTo(String value) {
            addCriterion("usex <=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLike(String value) {
            addCriterion("usex like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotLike(String value) {
            addCriterion("usex not like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexIn(List<String> values) {
            addCriterion("usex in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotIn(List<String> values) {
            addCriterion("usex not in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexBetween(String value1, String value2) {
            addCriterion("usex between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotBetween(String value1, String value2) {
            addCriterion("usex not between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeIsNull() {
            addCriterion("ucreatetime is null");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeIsNotNull() {
            addCriterion("ucreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeEqualTo(String value) {
            addCriterion("ucreatetime =", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeNotEqualTo(String value) {
            addCriterion("ucreatetime <>", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeGreaterThan(String value) {
            addCriterion("ucreatetime >", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ucreatetime >=", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeLessThan(String value) {
            addCriterion("ucreatetime <", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeLessThanOrEqualTo(String value) {
            addCriterion("ucreatetime <=", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeLike(String value) {
            addCriterion("ucreatetime like", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeNotLike(String value) {
            addCriterion("ucreatetime not like", value, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeIn(List<String> values) {
            addCriterion("ucreatetime in", values, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeNotIn(List<String> values) {
            addCriterion("ucreatetime not in", values, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeBetween(String value1, String value2) {
            addCriterion("ucreatetime between", value1, value2, "ucreatetime");
            return (Criteria) this;
        }

        public Criteria andUcreatetimeNotBetween(String value1, String value2) {
            addCriterion("ucreatetime not between", value1, value2, "ucreatetime");
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