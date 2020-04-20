package com.ORM.model.projectModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TblProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblProjectExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProjIdIsNull() {
            addCriterion("proj_id is null");
            return (Criteria) this;
        }

        public Criteria andProjIdIsNotNull() {
            addCriterion("proj_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjIdEqualTo(Integer value) {
            addCriterion("proj_id =", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdNotEqualTo(Integer value) {
            addCriterion("proj_id <>", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdGreaterThan(Integer value) {
            addCriterion("proj_id >", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proj_id >=", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdLessThan(Integer value) {
            addCriterion("proj_id <", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdLessThanOrEqualTo(Integer value) {
            addCriterion("proj_id <=", value, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdIn(List<Integer> values) {
            addCriterion("proj_id in", values, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdNotIn(List<Integer> values) {
            addCriterion("proj_id not in", values, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdBetween(Integer value1, Integer value2) {
            addCriterion("proj_id between", value1, value2, "projId");
            return (Criteria) this;
        }

        public Criteria andProjIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proj_id not between", value1, value2, "projId");
            return (Criteria) this;
        }

        public Criteria andProjNameIsNull() {
            addCriterion("proj_name is null");
            return (Criteria) this;
        }

        public Criteria andProjNameIsNotNull() {
            addCriterion("proj_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjNameEqualTo(String value) {
            addCriterion("proj_name =", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameNotEqualTo(String value) {
            addCriterion("proj_name <>", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameGreaterThan(String value) {
            addCriterion("proj_name >", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameGreaterThanOrEqualTo(String value) {
            addCriterion("proj_name >=", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameLessThan(String value) {
            addCriterion("proj_name <", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameLessThanOrEqualTo(String value) {
            addCriterion("proj_name <=", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameLike(String value) {
            addCriterion("proj_name like", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameNotLike(String value) {
            addCriterion("proj_name not like", value, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameIn(List<String> values) {
            addCriterion("proj_name in", values, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameNotIn(List<String> values) {
            addCriterion("proj_name not in", values, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameBetween(String value1, String value2) {
            addCriterion("proj_name between", value1, value2, "projName");
            return (Criteria) this;
        }

        public Criteria andProjNameNotBetween(String value1, String value2) {
            addCriterion("proj_name not between", value1, value2, "projName");
            return (Criteria) this;
        }

        public Criteria andProjCostIsNull() {
            addCriterion("proj_cost is null");
            return (Criteria) this;
        }

        public Criteria andProjCostIsNotNull() {
            addCriterion("proj_cost is not null");
            return (Criteria) this;
        }

        public Criteria andProjCostEqualTo(Integer value) {
            addCriterion("proj_cost =", value, "projCost");
            return (Criteria) this;
        }

        public Criteria andProjCostNotEqualTo(Integer value) {
            addCriterion("proj_cost <>", value, "projCost");
            return (Criteria) this;
        }

        public Criteria andProjCostGreaterThan(Integer value) {
            addCriterion("proj_cost >", value, "projCost");
            return (Criteria) this;
        }

        public Criteria andProjCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("proj_cost >=", value, "projCost");
            return (Criteria) this;
        }

        public Criteria andProjCostLessThan(Integer value) {
            addCriterion("proj_cost <", value, "projCost");
            return (Criteria) this;
        }

        public Criteria andProjCostLessThanOrEqualTo(Integer value) {
            addCriterion("proj_cost <=", value, "projCost");
            return (Criteria) this;
        }

        public Criteria andProjCostIn(List<Integer> values) {
            addCriterion("proj_cost in", values, "projCost");
            return (Criteria) this;
        }

        public Criteria andProjCostNotIn(List<Integer> values) {
            addCriterion("proj_cost not in", values, "projCost");
            return (Criteria) this;
        }

        public Criteria andProjCostBetween(Integer value1, Integer value2) {
            addCriterion("proj_cost between", value1, value2, "projCost");
            return (Criteria) this;
        }

        public Criteria andProjCostNotBetween(Integer value1, Integer value2) {
            addCriterion("proj_cost not between", value1, value2, "projCost");
            return (Criteria) this;
        }

        public Criteria andProjDateIsNull() {
            addCriterion("proj_date is null");
            return (Criteria) this;
        }

        public Criteria andProjDateIsNotNull() {
            addCriterion("proj_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjDateEqualTo(Date value) {
            addCriterionForJDBCDate("proj_date =", value, "projDate");
            return (Criteria) this;
        }

        public Criteria andProjDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("proj_date <>", value, "projDate");
            return (Criteria) this;
        }

        public Criteria andProjDateGreaterThan(Date value) {
            addCriterionForJDBCDate("proj_date >", value, "projDate");
            return (Criteria) this;
        }

        public Criteria andProjDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("proj_date >=", value, "projDate");
            return (Criteria) this;
        }

        public Criteria andProjDateLessThan(Date value) {
            addCriterionForJDBCDate("proj_date <", value, "projDate");
            return (Criteria) this;
        }

        public Criteria andProjDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("proj_date <=", value, "projDate");
            return (Criteria) this;
        }

        public Criteria andProjDateIn(List<Date> values) {
            addCriterionForJDBCDate("proj_date in", values, "projDate");
            return (Criteria) this;
        }

        public Criteria andProjDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("proj_date not in", values, "projDate");
            return (Criteria) this;
        }

        public Criteria andProjDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("proj_date between", value1, value2, "projDate");
            return (Criteria) this;
        }

        public Criteria andProjDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("proj_date not between", value1, value2, "projDate");
            return (Criteria) this;
        }

        public Criteria andProjStateIsNull() {
            addCriterion("proj_state is null");
            return (Criteria) this;
        }

        public Criteria andProjStateIsNotNull() {
            addCriterion("proj_state is not null");
            return (Criteria) this;
        }

        public Criteria andProjStateEqualTo(Integer value) {
            addCriterion("proj_state =", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateNotEqualTo(Integer value) {
            addCriterion("proj_state <>", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateGreaterThan(Integer value) {
            addCriterion("proj_state >", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("proj_state >=", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateLessThan(Integer value) {
            addCriterion("proj_state <", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateLessThanOrEqualTo(Integer value) {
            addCriterion("proj_state <=", value, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateIn(List<Integer> values) {
            addCriterion("proj_state in", values, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateNotIn(List<Integer> values) {
            addCriterion("proj_state not in", values, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateBetween(Integer value1, Integer value2) {
            addCriterion("proj_state between", value1, value2, "projState");
            return (Criteria) this;
        }

        public Criteria andProjStateNotBetween(Integer value1, Integer value2) {
            addCriterion("proj_state not between", value1, value2, "projState");
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