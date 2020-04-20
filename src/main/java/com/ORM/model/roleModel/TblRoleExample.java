package com.ORM.model.roleModel;

import java.util.ArrayList;
import java.util.List;

public class TblRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRoleExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIsNull() {
            addCriterion("auth_user is null");
            return (Criteria) this;
        }

        public Criteria andAuthUserIsNotNull() {
            addCriterion("auth_user is not null");
            return (Criteria) this;
        }

        public Criteria andAuthUserEqualTo(Integer value) {
            addCriterion("auth_user =", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserNotEqualTo(Integer value) {
            addCriterion("auth_user <>", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserGreaterThan(Integer value) {
            addCriterion("auth_user >", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_user >=", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserLessThan(Integer value) {
            addCriterion("auth_user <", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserLessThanOrEqualTo(Integer value) {
            addCriterion("auth_user <=", value, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserIn(List<Integer> values) {
            addCriterion("auth_user in", values, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserNotIn(List<Integer> values) {
            addCriterion("auth_user not in", values, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserBetween(Integer value1, Integer value2) {
            addCriterion("auth_user between", value1, value2, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthUserNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_user not between", value1, value2, "authUser");
            return (Criteria) this;
        }

        public Criteria andAuthProjectIsNull() {
            addCriterion("auth_project is null");
            return (Criteria) this;
        }

        public Criteria andAuthProjectIsNotNull() {
            addCriterion("auth_project is not null");
            return (Criteria) this;
        }

        public Criteria andAuthProjectEqualTo(Integer value) {
            addCriterion("auth_project =", value, "authProject");
            return (Criteria) this;
        }

        public Criteria andAuthProjectNotEqualTo(Integer value) {
            addCriterion("auth_project <>", value, "authProject");
            return (Criteria) this;
        }

        public Criteria andAuthProjectGreaterThan(Integer value) {
            addCriterion("auth_project >", value, "authProject");
            return (Criteria) this;
        }

        public Criteria andAuthProjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_project >=", value, "authProject");
            return (Criteria) this;
        }

        public Criteria andAuthProjectLessThan(Integer value) {
            addCriterion("auth_project <", value, "authProject");
            return (Criteria) this;
        }

        public Criteria andAuthProjectLessThanOrEqualTo(Integer value) {
            addCriterion("auth_project <=", value, "authProject");
            return (Criteria) this;
        }

        public Criteria andAuthProjectIn(List<Integer> values) {
            addCriterion("auth_project in", values, "authProject");
            return (Criteria) this;
        }

        public Criteria andAuthProjectNotIn(List<Integer> values) {
            addCriterion("auth_project not in", values, "authProject");
            return (Criteria) this;
        }

        public Criteria andAuthProjectBetween(Integer value1, Integer value2) {
            addCriterion("auth_project between", value1, value2, "authProject");
            return (Criteria) this;
        }

        public Criteria andAuthProjectNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_project not between", value1, value2, "authProject");
            return (Criteria) this;
        }

        public Criteria andAuthResultIsNull() {
            addCriterion("auth_result is null");
            return (Criteria) this;
        }

        public Criteria andAuthResultIsNotNull() {
            addCriterion("auth_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuthResultEqualTo(Integer value) {
            addCriterion("auth_result =", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotEqualTo(Integer value) {
            addCriterion("auth_result <>", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultGreaterThan(Integer value) {
            addCriterion("auth_result >", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_result >=", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultLessThan(Integer value) {
            addCriterion("auth_result <", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultLessThanOrEqualTo(Integer value) {
            addCriterion("auth_result <=", value, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultIn(List<Integer> values) {
            addCriterion("auth_result in", values, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotIn(List<Integer> values) {
            addCriterion("auth_result not in", values, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultBetween(Integer value1, Integer value2) {
            addCriterion("auth_result between", value1, value2, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthResultNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_result not between", value1, value2, "authResult");
            return (Criteria) this;
        }

        public Criteria andAuthControlIsNull() {
            addCriterion("auth_control is null");
            return (Criteria) this;
        }

        public Criteria andAuthControlIsNotNull() {
            addCriterion("auth_control is not null");
            return (Criteria) this;
        }

        public Criteria andAuthControlEqualTo(Integer value) {
            addCriterion("auth_control =", value, "authControl");
            return (Criteria) this;
        }

        public Criteria andAuthControlNotEqualTo(Integer value) {
            addCriterion("auth_control <>", value, "authControl");
            return (Criteria) this;
        }

        public Criteria andAuthControlGreaterThan(Integer value) {
            addCriterion("auth_control >", value, "authControl");
            return (Criteria) this;
        }

        public Criteria andAuthControlGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_control >=", value, "authControl");
            return (Criteria) this;
        }

        public Criteria andAuthControlLessThan(Integer value) {
            addCriterion("auth_control <", value, "authControl");
            return (Criteria) this;
        }

        public Criteria andAuthControlLessThanOrEqualTo(Integer value) {
            addCriterion("auth_control <=", value, "authControl");
            return (Criteria) this;
        }

        public Criteria andAuthControlIn(List<Integer> values) {
            addCriterion("auth_control in", values, "authControl");
            return (Criteria) this;
        }

        public Criteria andAuthControlNotIn(List<Integer> values) {
            addCriterion("auth_control not in", values, "authControl");
            return (Criteria) this;
        }

        public Criteria andAuthControlBetween(Integer value1, Integer value2) {
            addCriterion("auth_control between", value1, value2, "authControl");
            return (Criteria) this;
        }

        public Criteria andAuthControlNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_control not between", value1, value2, "authControl");
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