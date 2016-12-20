package com.myweb.pojo;

import java.util.ArrayList;
import java.util.List;

public class FuwuExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    public FuwuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
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
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
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

        public Criteria andLaorennameIsNull() {
            addCriterion("laorenname is null");
            return (Criteria) this;
        }

        public Criteria andLaorennameIsNotNull() {
            addCriterion("laorenname is not null");
            return (Criteria) this;
        }

        public Criteria andLaorennameEqualTo(String value) {
            addCriterion("laorenname =", value, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameNotEqualTo(String value) {
            addCriterion("laorenname <>", value, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameGreaterThan(String value) {
            addCriterion("laorenname >", value, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameGreaterThanOrEqualTo(String value) {
            addCriterion("laorenname >=", value, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameLessThan(String value) {
            addCriterion("laorenname <", value, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameLessThanOrEqualTo(String value) {
            addCriterion("laorenname <=", value, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameLike(String value) {
            addCriterion("laorenname like", value, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameNotLike(String value) {
            addCriterion("laorenname not like", value, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameIn(List<String> values) {
            addCriterion("laorenname in", values, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameNotIn(List<String> values) {
            addCriterion("laorenname not in", values, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameBetween(String value1, String value2) {
            addCriterion("laorenname between", value1, value2, "laorenname");
            return (Criteria) this;
        }

        public Criteria andLaorennameNotBetween(String value1, String value2) {
            addCriterion("laorenname not between", value1, value2, "laorenname");
            return (Criteria) this;
        }

        public Criteria andXiangmuIsNull() {
            addCriterion("xiangmu is null");
            return (Criteria) this;
        }

        public Criteria andXiangmuIsNotNull() {
            addCriterion("xiangmu is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmuEqualTo(String value) {
            addCriterion("xiangmu =", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotEqualTo(String value) {
            addCriterion("xiangmu <>", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuGreaterThan(String value) {
            addCriterion("xiangmu >", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuGreaterThanOrEqualTo(String value) {
            addCriterion("xiangmu >=", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuLessThan(String value) {
            addCriterion("xiangmu <", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuLessThanOrEqualTo(String value) {
            addCriterion("xiangmu <=", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuLike(String value) {
            addCriterion("xiangmu like", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotLike(String value) {
            addCriterion("xiangmu not like", value, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuIn(List<String> values) {
            addCriterion("xiangmu in", values, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotIn(List<String> values) {
            addCriterion("xiangmu not in", values, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuBetween(String value1, String value2) {
            addCriterion("xiangmu between", value1, value2, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andXiangmuNotBetween(String value1, String value2) {
            addCriterion("xiangmu not between", value1, value2, "xiangmu");
            return (Criteria) this;
        }

        public Criteria andShuomingIsNull() {
            addCriterion("shuoming is null");
            return (Criteria) this;
        }

        public Criteria andShuomingIsNotNull() {
            addCriterion("shuoming is not null");
            return (Criteria) this;
        }

        public Criteria andShuomingEqualTo(String value) {
            addCriterion("shuoming =", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingNotEqualTo(String value) {
            addCriterion("shuoming <>", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingGreaterThan(String value) {
            addCriterion("shuoming >", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingGreaterThanOrEqualTo(String value) {
            addCriterion("shuoming >=", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingLessThan(String value) {
            addCriterion("shuoming <", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingLessThanOrEqualTo(String value) {
            addCriterion("shuoming <=", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingLike(String value) {
            addCriterion("shuoming like", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingNotLike(String value) {
            addCriterion("shuoming not like", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingIn(List<String> values) {
            addCriterion("shuoming in", values, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingNotIn(List<String> values) {
            addCriterion("shuoming not in", values, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingBetween(String value1, String value2) {
            addCriterion("shuoming between", value1, value2, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingNotBetween(String value1, String value2) {
            addCriterion("shuoming not between", value1, value2, "shuoming");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andFuwutypeIsNull() {
            addCriterion("fuwutype is null");
            return (Criteria) this;
        }

        public Criteria andFuwutypeIsNotNull() {
            addCriterion("fuwutype is not null");
            return (Criteria) this;
        }

        public Criteria andFuwutypeEqualTo(String value) {
            addCriterion("fuwutype =", value, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeNotEqualTo(String value) {
            addCriterion("fuwutype <>", value, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeGreaterThan(String value) {
            addCriterion("fuwutype >", value, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeGreaterThanOrEqualTo(String value) {
            addCriterion("fuwutype >=", value, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeLessThan(String value) {
            addCriterion("fuwutype <", value, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeLessThanOrEqualTo(String value) {
            addCriterion("fuwutype <=", value, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeLike(String value) {
            addCriterion("fuwutype like", value, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeNotLike(String value) {
            addCriterion("fuwutype not like", value, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeIn(List<String> values) {
            addCriterion("fuwutype in", values, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeNotIn(List<String> values) {
            addCriterion("fuwutype not in", values, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeBetween(String value1, String value2) {
            addCriterion("fuwutype between", value1, value2, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andFuwutypeNotBetween(String value1, String value2) {
            addCriterion("fuwutype not between", value1, value2, "fuwutype");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("createuser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createuser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(Integer value) {
            addCriterion("createuser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(Integer value) {
            addCriterion("createuser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(Integer value) {
            addCriterion("createuser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("createuser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(Integer value) {
            addCriterion("createuser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(Integer value) {
            addCriterion("createuser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<Integer> values) {
            addCriterion("createuser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<Integer> values) {
            addCriterion("createuser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(Integer value1, Integer value2) {
            addCriterion("createuser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(Integer value1, Integer value2) {
            addCriterion("createuser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNull() {
            addCriterion("createusername is null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNotNull() {
            addCriterion("createusername is not null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameEqualTo(String value) {
            addCriterion("createusername =", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotEqualTo(String value) {
            addCriterion("createusername <>", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThan(String value) {
            addCriterion("createusername >", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("createusername >=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThan(String value) {
            addCriterion("createusername <", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThanOrEqualTo(String value) {
            addCriterion("createusername <=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLike(String value) {
            addCriterion("createusername like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotLike(String value) {
            addCriterion("createusername not like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIn(List<String> values) {
            addCriterion("createusername in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotIn(List<String> values) {
            addCriterion("createusername not in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameBetween(String value1, String value2) {
            addCriterion("createusername between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotBetween(String value1, String value2) {
            addCriterion("createusername not between", value1, value2, "createusername");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fuwu
     *
     * @mbg.generated do_not_delete_during_merge Tue Dec 20 10:04:21 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fuwu
     *
     * @mbg.generated Tue Dec 20 10:04:21 CST 2016
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