package org.jackey.hilog.crmlistener.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmlistenerCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    public CrmlistenerCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
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
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
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

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andHsIsNull() {
            addCriterion("hs is null");
            return (Criteria) this;
        }

        public Criteria andHsIsNotNull() {
            addCriterion("hs is not null");
            return (Criteria) this;
        }

        public Criteria andHsEqualTo(String value) {
            addCriterion("hs =", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsNotEqualTo(String value) {
            addCriterion("hs <>", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsGreaterThan(String value) {
            addCriterion("hs >", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsGreaterThanOrEqualTo(String value) {
            addCriterion("hs >=", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsLessThan(String value) {
            addCriterion("hs <", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsLessThanOrEqualTo(String value) {
            addCriterion("hs <=", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsLike(String value) {
            addCriterion("hs like", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsNotLike(String value) {
            addCriterion("hs not like", value, "hs");
            return (Criteria) this;
        }

        public Criteria andHsIn(List<String> values) {
            addCriterion("hs in", values, "hs");
            return (Criteria) this;
        }

        public Criteria andHsNotIn(List<String> values) {
            addCriterion("hs not in", values, "hs");
            return (Criteria) this;
        }

        public Criteria andHsBetween(String value1, String value2) {
            addCriterion("hs between", value1, value2, "hs");
            return (Criteria) this;
        }

        public Criteria andHsNotBetween(String value1, String value2) {
            addCriterion("hs not between", value1, value2, "hs");
            return (Criteria) this;
        }

        public Criteria andIncomingIsNull() {
            addCriterion("incoming is null");
            return (Criteria) this;
        }

        public Criteria andIncomingIsNotNull() {
            addCriterion("incoming is not null");
            return (Criteria) this;
        }

        public Criteria andIncomingEqualTo(Integer value) {
            addCriterion("incoming =", value, "incoming");
            return (Criteria) this;
        }

        public Criteria andIncomingNotEqualTo(Integer value) {
            addCriterion("incoming <>", value, "incoming");
            return (Criteria) this;
        }

        public Criteria andIncomingGreaterThan(Integer value) {
            addCriterion("incoming >", value, "incoming");
            return (Criteria) this;
        }

        public Criteria andIncomingGreaterThanOrEqualTo(Integer value) {
            addCriterion("incoming >=", value, "incoming");
            return (Criteria) this;
        }

        public Criteria andIncomingLessThan(Integer value) {
            addCriterion("incoming <", value, "incoming");
            return (Criteria) this;
        }

        public Criteria andIncomingLessThanOrEqualTo(Integer value) {
            addCriterion("incoming <=", value, "incoming");
            return (Criteria) this;
        }

        public Criteria andIncomingIn(List<Integer> values) {
            addCriterion("incoming in", values, "incoming");
            return (Criteria) this;
        }

        public Criteria andIncomingNotIn(List<Integer> values) {
            addCriterion("incoming not in", values, "incoming");
            return (Criteria) this;
        }

        public Criteria andIncomingBetween(Integer value1, Integer value2) {
            addCriterion("incoming between", value1, value2, "incoming");
            return (Criteria) this;
        }

        public Criteria andIncomingNotBetween(Integer value1, Integer value2) {
            addCriterion("incoming not between", value1, value2, "incoming");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andErrorIsNull() {
            addCriterion("error is null");
            return (Criteria) this;
        }

        public Criteria andErrorIsNotNull() {
            addCriterion("error is not null");
            return (Criteria) this;
        }

        public Criteria andErrorEqualTo(Integer value) {
            addCriterion("error =", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotEqualTo(Integer value) {
            addCriterion("error <>", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorGreaterThan(Integer value) {
            addCriterion("error >", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorGreaterThanOrEqualTo(Integer value) {
            addCriterion("error >=", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLessThan(Integer value) {
            addCriterion("error <", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLessThanOrEqualTo(Integer value) {
            addCriterion("error <=", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorIn(List<Integer> values) {
            addCriterion("error in", values, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotIn(List<Integer> values) {
            addCriterion("error not in", values, "error");
            return (Criteria) this;
        }

        public Criteria andErrorBetween(Integer value1, Integer value2) {
            addCriterion("error between", value1, value2, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotBetween(Integer value1, Integer value2) {
            addCriterion("error not between", value1, value2, "error");
            return (Criteria) this;
        }

        public Criteria andQsizeIsNull() {
            addCriterion("qSize is null");
            return (Criteria) this;
        }

        public Criteria andQsizeIsNotNull() {
            addCriterion("qSize is not null");
            return (Criteria) this;
        }

        public Criteria andQsizeEqualTo(Integer value) {
            addCriterion("qSize =", value, "qsize");
            return (Criteria) this;
        }

        public Criteria andQsizeNotEqualTo(Integer value) {
            addCriterion("qSize <>", value, "qsize");
            return (Criteria) this;
        }

        public Criteria andQsizeGreaterThan(Integer value) {
            addCriterion("qSize >", value, "qsize");
            return (Criteria) this;
        }

        public Criteria andQsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("qSize >=", value, "qsize");
            return (Criteria) this;
        }

        public Criteria andQsizeLessThan(Integer value) {
            addCriterion("qSize <", value, "qsize");
            return (Criteria) this;
        }

        public Criteria andQsizeLessThanOrEqualTo(Integer value) {
            addCriterion("qSize <=", value, "qsize");
            return (Criteria) this;
        }

        public Criteria andQsizeIn(List<Integer> values) {
            addCriterion("qSize in", values, "qsize");
            return (Criteria) this;
        }

        public Criteria andQsizeNotIn(List<Integer> values) {
            addCriterion("qSize not in", values, "qsize");
            return (Criteria) this;
        }

        public Criteria andQsizeBetween(Integer value1, Integer value2) {
            addCriterion("qSize between", value1, value2, "qsize");
            return (Criteria) this;
        }

        public Criteria andQsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("qSize not between", value1, value2, "qsize");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_crmlistener
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 27 00:38:48 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_crmlistener
     *
     * @mbggenerated Wed Aug 27 00:38:48 CST 2014
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}