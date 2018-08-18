package com.adpanshi.cashloan.manage.arc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CreditExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    public CreditExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
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
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_credit
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table arc_credit
     *
     * @mbg.generated
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConsumerNoIsNull() {
            addCriterion("consumer_no is null");
            return (Criteria) this;
        }

        public Criteria andConsumerNoIsNotNull() {
            addCriterion("consumer_no is not null");
            return (Criteria) this;
        }

        public Criteria andConsumerNoEqualTo(String value) {
            addCriterion("consumer_no =", value, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoNotEqualTo(String value) {
            addCriterion("consumer_no <>", value, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoGreaterThan(String value) {
            addCriterion("consumer_no >", value, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoGreaterThanOrEqualTo(String value) {
            addCriterion("consumer_no >=", value, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoLessThan(String value) {
            addCriterion("consumer_no <", value, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoLessThanOrEqualTo(String value) {
            addCriterion("consumer_no <=", value, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoLike(String value) {
            addCriterion("consumer_no like", value, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoNotLike(String value) {
            addCriterion("consumer_no not like", value, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoIn(List<String> values) {
            addCriterion("consumer_no in", values, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoNotIn(List<String> values) {
            addCriterion("consumer_no not in", values, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoBetween(String value1, String value2) {
            addCriterion("consumer_no between", value1, value2, "consumerNo");
            return (Criteria) this;
        }

        public Criteria andConsumerNoNotBetween(String value1, String value2) {
            addCriterion("consumer_no not between", value1, value2, "consumerNo");
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

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andCreditTypeIsNull() {
            addCriterion("credit_type is null");
            return (Criteria) this;
        }

        public Criteria andCreditTypeIsNotNull() {
            addCriterion("credit_type is not null");
            return (Criteria) this;
        }

        public Criteria andCreditTypeEqualTo(Long value) {
            addCriterion("credit_type =", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeNotEqualTo(Long value) {
            addCriterion("credit_type <>", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeGreaterThan(Long value) {
            addCriterion("credit_type >", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_type >=", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeLessThan(Long value) {
            addCriterion("credit_type <", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeLessThanOrEqualTo(Long value) {
            addCriterion("credit_type <=", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeIn(List<Long> values) {
            addCriterion("credit_type in", values, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeNotIn(List<Long> values) {
            addCriterion("credit_type not in", values, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeBetween(Long value1, Long value2) {
            addCriterion("credit_type between", value1, value2, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeNotBetween(Long value1, Long value2) {
            addCriterion("credit_type not between", value1, value2, "creditType");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andUsedIsNull() {
            addCriterion("used is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("used is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(BigDecimal value) {
            addCriterion("used =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(BigDecimal value) {
            addCriterion("used <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(BigDecimal value) {
            addCriterion("used >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("used >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(BigDecimal value) {
            addCriterion("used <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("used <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<BigDecimal> values) {
            addCriterion("used in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<BigDecimal> values) {
            addCriterion("used not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used not between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUnuseIsNull() {
            addCriterion("unuse is null");
            return (Criteria) this;
        }

        public Criteria andUnuseIsNotNull() {
            addCriterion("unuse is not null");
            return (Criteria) this;
        }

        public Criteria andUnuseEqualTo(BigDecimal value) {
            addCriterion("unuse =", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseNotEqualTo(BigDecimal value) {
            addCriterion("unuse <>", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseGreaterThan(BigDecimal value) {
            addCriterion("unuse >", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unuse >=", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseLessThan(BigDecimal value) {
            addCriterion("unuse <", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unuse <=", value, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseIn(List<BigDecimal> values) {
            addCriterion("unuse in", values, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseNotIn(List<BigDecimal> values) {
            addCriterion("unuse not in", values, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unuse between", value1, value2, "unuse");
            return (Criteria) this;
        }

        public Criteria andUnuseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unuse not between", value1, value2, "unuse");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andReqExtIsNull() {
            addCriterion("req_ext is null");
            return (Criteria) this;
        }

        public Criteria andReqExtIsNotNull() {
            addCriterion("req_ext is not null");
            return (Criteria) this;
        }

        public Criteria andReqExtEqualTo(String value) {
            addCriterion("req_ext =", value, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtNotEqualTo(String value) {
            addCriterion("req_ext <>", value, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtGreaterThan(String value) {
            addCriterion("req_ext >", value, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtGreaterThanOrEqualTo(String value) {
            addCriterion("req_ext >=", value, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtLessThan(String value) {
            addCriterion("req_ext <", value, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtLessThanOrEqualTo(String value) {
            addCriterion("req_ext <=", value, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtLike(String value) {
            addCriterion("req_ext like", value, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtNotLike(String value) {
            addCriterion("req_ext not like", value, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtIn(List<String> values) {
            addCriterion("req_ext in", values, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtNotIn(List<String> values) {
            addCriterion("req_ext not in", values, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtBetween(String value1, String value2) {
            addCriterion("req_ext between", value1, value2, "reqExt");
            return (Criteria) this;
        }

        public Criteria andReqExtNotBetween(String value1, String value2) {
            addCriterion("req_ext not between", value1, value2, "reqExt");
            return (Criteria) this;
        }

        public Criteria andConsumerNoLikeInsensitive(String value) {
            addCriterion("upper(consumer_no) like", value.toUpperCase(), "consumerNo");
            return (Criteria) this;
        }

        public Criteria andGradeLikeInsensitive(String value) {
            addCriterion("upper(grade) like", value.toUpperCase(), "grade");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(state) like", value.toUpperCase(), "state");
            return (Criteria) this;
        }

        public Criteria andReqExtLikeInsensitive(String value) {
            addCriterion("upper(req_ext) like", value.toUpperCase(), "reqExt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table arc_credit
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table arc_credit
     *
     * @mbg.generated
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