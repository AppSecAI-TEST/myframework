package com.myweb.vo.mybatis;

import java.util.ArrayList;
import java.util.List;

public class Ry2sxExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    public Ry2sxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLaorenidIsNull() {
            addCriterion("laorenid is null");
            return (Criteria) this;
        }

        public Criteria andLaorenidIsNotNull() {
            addCriterion("laorenid is not null");
            return (Criteria) this;
        }

        public Criteria andLaorenidEqualTo(Integer value) {
            addCriterion("laorenid =", value, "laorenid");
            return (Criteria) this;
        }

        public Criteria andLaorenidNotEqualTo(Integer value) {
            addCriterion("laorenid <>", value, "laorenid");
            return (Criteria) this;
        }

        public Criteria andLaorenidGreaterThan(Integer value) {
            addCriterion("laorenid >", value, "laorenid");
            return (Criteria) this;
        }

        public Criteria andLaorenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("laorenid >=", value, "laorenid");
            return (Criteria) this;
        }

        public Criteria andLaorenidLessThan(Integer value) {
            addCriterion("laorenid <", value, "laorenid");
            return (Criteria) this;
        }

        public Criteria andLaorenidLessThanOrEqualTo(Integer value) {
            addCriterion("laorenid <=", value, "laorenid");
            return (Criteria) this;
        }

        public Criteria andLaorenidIn(List<Integer> values) {
            addCriterion("laorenid in", values, "laorenid");
            return (Criteria) this;
        }

        public Criteria andLaorenidNotIn(List<Integer> values) {
            addCriterion("laorenid not in", values, "laorenid");
            return (Criteria) this;
        }

        public Criteria andLaorenidBetween(Integer value1, Integer value2) {
            addCriterion("laorenid between", value1, value2, "laorenid");
            return (Criteria) this;
        }

        public Criteria andLaorenidNotBetween(Integer value1, Integer value2) {
            addCriterion("laorenid not between", value1, value2, "laorenid");
            return (Criteria) this;
        }

        public Criteria andBingshiidIsNull() {
            addCriterion("bingshiid is null");
            return (Criteria) this;
        }

        public Criteria andBingshiidIsNotNull() {
            addCriterion("bingshiid is not null");
            return (Criteria) this;
        }

        public Criteria andBingshiidEqualTo(Integer value) {
            addCriterion("bingshiid =", value, "bingshiid");
            return (Criteria) this;
        }

        public Criteria andBingshiidNotEqualTo(Integer value) {
            addCriterion("bingshiid <>", value, "bingshiid");
            return (Criteria) this;
        }

        public Criteria andBingshiidGreaterThan(Integer value) {
            addCriterion("bingshiid >", value, "bingshiid");
            return (Criteria) this;
        }

        public Criteria andBingshiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bingshiid >=", value, "bingshiid");
            return (Criteria) this;
        }

        public Criteria andBingshiidLessThan(Integer value) {
            addCriterion("bingshiid <", value, "bingshiid");
            return (Criteria) this;
        }

        public Criteria andBingshiidLessThanOrEqualTo(Integer value) {
            addCriterion("bingshiid <=", value, "bingshiid");
            return (Criteria) this;
        }

        public Criteria andBingshiidIn(List<Integer> values) {
            addCriterion("bingshiid in", values, "bingshiid");
            return (Criteria) this;
        }

        public Criteria andBingshiidNotIn(List<Integer> values) {
            addCriterion("bingshiid not in", values, "bingshiid");
            return (Criteria) this;
        }

        public Criteria andBingshiidBetween(Integer value1, Integer value2) {
            addCriterion("bingshiid between", value1, value2, "bingshiid");
            return (Criteria) this;
        }

        public Criteria andBingshiidNotBetween(Integer value1, Integer value2) {
            addCriterion("bingshiid not between", value1, value2, "bingshiid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ry2sx
     *
     * @mbggenerated do_not_delete_during_merge Tue May 03 01:16:45 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
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