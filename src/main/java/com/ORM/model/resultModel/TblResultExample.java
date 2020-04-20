package com.ORM.model.resultModel;

import java.util.ArrayList;
import java.util.List;

public class TblResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblResultExample() {
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

        public Criteria andResultIdIsNull() {
            addCriterion("result_id is null");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("result_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultIdEqualTo(Integer value) {
            addCriterion("result_id =", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotEqualTo(Integer value) {
            addCriterion("result_id <>", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThan(Integer value) {
            addCriterion("result_id >", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_id >=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThan(Integer value) {
            addCriterion("result_id <", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThanOrEqualTo(Integer value) {
            addCriterion("result_id <=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdIn(List<Integer> values) {
            addCriterion("result_id in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotIn(List<Integer> values) {
            addCriterion("result_id not in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdBetween(Integer value1, Integer value2) {
            addCriterion("result_id between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("result_id not between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultNameIsNull() {
            addCriterion("result_name is null");
            return (Criteria) this;
        }

        public Criteria andResultNameIsNotNull() {
            addCriterion("result_name is not null");
            return (Criteria) this;
        }

        public Criteria andResultNameEqualTo(String value) {
            addCriterion("result_name =", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotEqualTo(String value) {
            addCriterion("result_name <>", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameGreaterThan(String value) {
            addCriterion("result_name >", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameGreaterThanOrEqualTo(String value) {
            addCriterion("result_name >=", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameLessThan(String value) {
            addCriterion("result_name <", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameLessThanOrEqualTo(String value) {
            addCriterion("result_name <=", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameLike(String value) {
            addCriterion("result_name like", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotLike(String value) {
            addCriterion("result_name not like", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameIn(List<String> values) {
            addCriterion("result_name in", values, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotIn(List<String> values) {
            addCriterion("result_name not in", values, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameBetween(String value1, String value2) {
            addCriterion("result_name between", value1, value2, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotBetween(String value1, String value2) {
            addCriterion("result_name not between", value1, value2, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultCostIsNull() {
            addCriterion("result_cost is null");
            return (Criteria) this;
        }

        public Criteria andResultCostIsNotNull() {
            addCriterion("result_cost is not null");
            return (Criteria) this;
        }

        public Criteria andResultCostEqualTo(Integer value) {
            addCriterion("result_cost =", value, "resultCost");
            return (Criteria) this;
        }

        public Criteria andResultCostNotEqualTo(Integer value) {
            addCriterion("result_cost <>", value, "resultCost");
            return (Criteria) this;
        }

        public Criteria andResultCostGreaterThan(Integer value) {
            addCriterion("result_cost >", value, "resultCost");
            return (Criteria) this;
        }

        public Criteria andResultCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_cost >=", value, "resultCost");
            return (Criteria) this;
        }

        public Criteria andResultCostLessThan(Integer value) {
            addCriterion("result_cost <", value, "resultCost");
            return (Criteria) this;
        }

        public Criteria andResultCostLessThanOrEqualTo(Integer value) {
            addCriterion("result_cost <=", value, "resultCost");
            return (Criteria) this;
        }

        public Criteria andResultCostIn(List<Integer> values) {
            addCriterion("result_cost in", values, "resultCost");
            return (Criteria) this;
        }

        public Criteria andResultCostNotIn(List<Integer> values) {
            addCriterion("result_cost not in", values, "resultCost");
            return (Criteria) this;
        }

        public Criteria andResultCostBetween(Integer value1, Integer value2) {
            addCriterion("result_cost between", value1, value2, "resultCost");
            return (Criteria) this;
        }

        public Criteria andResultCostNotBetween(Integer value1, Integer value2) {
            addCriterion("result_cost not between", value1, value2, "resultCost");
            return (Criteria) this;
        }

        public Criteria andResultInvestIsNull() {
            addCriterion("result_invest is null");
            return (Criteria) this;
        }

        public Criteria andResultInvestIsNotNull() {
            addCriterion("result_invest is not null");
            return (Criteria) this;
        }

        public Criteria andResultInvestEqualTo(Integer value) {
            addCriterion("result_invest =", value, "resultInvest");
            return (Criteria) this;
        }

        public Criteria andResultInvestNotEqualTo(Integer value) {
            addCriterion("result_invest <>", value, "resultInvest");
            return (Criteria) this;
        }

        public Criteria andResultInvestGreaterThan(Integer value) {
            addCriterion("result_invest >", value, "resultInvest");
            return (Criteria) this;
        }

        public Criteria andResultInvestGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_invest >=", value, "resultInvest");
            return (Criteria) this;
        }

        public Criteria andResultInvestLessThan(Integer value) {
            addCriterion("result_invest <", value, "resultInvest");
            return (Criteria) this;
        }

        public Criteria andResultInvestLessThanOrEqualTo(Integer value) {
            addCriterion("result_invest <=", value, "resultInvest");
            return (Criteria) this;
        }

        public Criteria andResultInvestIn(List<Integer> values) {
            addCriterion("result_invest in", values, "resultInvest");
            return (Criteria) this;
        }

        public Criteria andResultInvestNotIn(List<Integer> values) {
            addCriterion("result_invest not in", values, "resultInvest");
            return (Criteria) this;
        }

        public Criteria andResultInvestBetween(Integer value1, Integer value2) {
            addCriterion("result_invest between", value1, value2, "resultInvest");
            return (Criteria) this;
        }

        public Criteria andResultInvestNotBetween(Integer value1, Integer value2) {
            addCriterion("result_invest not between", value1, value2, "resultInvest");
            return (Criteria) this;
        }

        public Criteria andResultValueIsNull() {
            addCriterion("result_value is null");
            return (Criteria) this;
        }

        public Criteria andResultValueIsNotNull() {
            addCriterion("result_value is not null");
            return (Criteria) this;
        }

        public Criteria andResultValueEqualTo(Integer value) {
            addCriterion("result_value =", value, "resultValue");
            return (Criteria) this;
        }

        public Criteria andResultValueNotEqualTo(Integer value) {
            addCriterion("result_value <>", value, "resultValue");
            return (Criteria) this;
        }

        public Criteria andResultValueGreaterThan(Integer value) {
            addCriterion("result_value >", value, "resultValue");
            return (Criteria) this;
        }

        public Criteria andResultValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_value >=", value, "resultValue");
            return (Criteria) this;
        }

        public Criteria andResultValueLessThan(Integer value) {
            addCriterion("result_value <", value, "resultValue");
            return (Criteria) this;
        }

        public Criteria andResultValueLessThanOrEqualTo(Integer value) {
            addCriterion("result_value <=", value, "resultValue");
            return (Criteria) this;
        }

        public Criteria andResultValueIn(List<Integer> values) {
            addCriterion("result_value in", values, "resultValue");
            return (Criteria) this;
        }

        public Criteria andResultValueNotIn(List<Integer> values) {
            addCriterion("result_value not in", values, "resultValue");
            return (Criteria) this;
        }

        public Criteria andResultValueBetween(Integer value1, Integer value2) {
            addCriterion("result_value between", value1, value2, "resultValue");
            return (Criteria) this;
        }

        public Criteria andResultValueNotBetween(Integer value1, Integer value2) {
            addCriterion("result_value not between", value1, value2, "resultValue");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionIsNull() {
            addCriterion("result_introduction is null");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionIsNotNull() {
            addCriterion("result_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionEqualTo(String value) {
            addCriterion("result_introduction =", value, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionNotEqualTo(String value) {
            addCriterion("result_introduction <>", value, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionGreaterThan(String value) {
            addCriterion("result_introduction >", value, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("result_introduction >=", value, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionLessThan(String value) {
            addCriterion("result_introduction <", value, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionLessThanOrEqualTo(String value) {
            addCriterion("result_introduction <=", value, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionLike(String value) {
            addCriterion("result_introduction like", value, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionNotLike(String value) {
            addCriterion("result_introduction not like", value, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionIn(List<String> values) {
            addCriterion("result_introduction in", values, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionNotIn(List<String> values) {
            addCriterion("result_introduction not in", values, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionBetween(String value1, String value2) {
            addCriterion("result_introduction between", value1, value2, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andResultIntroductionNotBetween(String value1, String value2) {
            addCriterion("result_introduction not between", value1, value2, "resultIntroduction");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdIsNull() {
            addCriterion("academy_id is null");
            return (Criteria) this;
        }

        public Criteria andAcademyIdIsNotNull() {
            addCriterion("academy_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcademyIdEqualTo(Integer value) {
            addCriterion("academy_id =", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdNotEqualTo(Integer value) {
            addCriterion("academy_id <>", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdGreaterThan(Integer value) {
            addCriterion("academy_id >", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("academy_id >=", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdLessThan(Integer value) {
            addCriterion("academy_id <", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdLessThanOrEqualTo(Integer value) {
            addCriterion("academy_id <=", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdIn(List<Integer> values) {
            addCriterion("academy_id in", values, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdNotIn(List<Integer> values) {
            addCriterion("academy_id not in", values, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdBetween(Integer value1, Integer value2) {
            addCriterion("academy_id between", value1, value2, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("academy_id not between", value1, value2, "academyId");
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