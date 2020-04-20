package com.ORM.model.announcementModel;

import java.util.ArrayList;
import java.util.List;

public class TblAnnouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblAnnouncementExample() {
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

        public Criteria andAnnoIdIsNull() {
            addCriterion("anno_id is null");
            return (Criteria) this;
        }

        public Criteria andAnnoIdIsNotNull() {
            addCriterion("anno_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnnoIdEqualTo(Integer value) {
            addCriterion("anno_id =", value, "annoId");
            return (Criteria) this;
        }

        public Criteria andAnnoIdNotEqualTo(Integer value) {
            addCriterion("anno_id <>", value, "annoId");
            return (Criteria) this;
        }

        public Criteria andAnnoIdGreaterThan(Integer value) {
            addCriterion("anno_id >", value, "annoId");
            return (Criteria) this;
        }

        public Criteria andAnnoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("anno_id >=", value, "annoId");
            return (Criteria) this;
        }

        public Criteria andAnnoIdLessThan(Integer value) {
            addCriterion("anno_id <", value, "annoId");
            return (Criteria) this;
        }

        public Criteria andAnnoIdLessThanOrEqualTo(Integer value) {
            addCriterion("anno_id <=", value, "annoId");
            return (Criteria) this;
        }

        public Criteria andAnnoIdIn(List<Integer> values) {
            addCriterion("anno_id in", values, "annoId");
            return (Criteria) this;
        }

        public Criteria andAnnoIdNotIn(List<Integer> values) {
            addCriterion("anno_id not in", values, "annoId");
            return (Criteria) this;
        }

        public Criteria andAnnoIdBetween(Integer value1, Integer value2) {
            addCriterion("anno_id between", value1, value2, "annoId");
            return (Criteria) this;
        }

        public Criteria andAnnoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("anno_id not between", value1, value2, "annoId");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleIsNull() {
            addCriterion("anno_title is null");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleIsNotNull() {
            addCriterion("anno_title is not null");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleEqualTo(String value) {
            addCriterion("anno_title =", value, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleNotEqualTo(String value) {
            addCriterion("anno_title <>", value, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleGreaterThan(String value) {
            addCriterion("anno_title >", value, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("anno_title >=", value, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleLessThan(String value) {
            addCriterion("anno_title <", value, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleLessThanOrEqualTo(String value) {
            addCriterion("anno_title <=", value, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleLike(String value) {
            addCriterion("anno_title like", value, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleNotLike(String value) {
            addCriterion("anno_title not like", value, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleIn(List<String> values) {
            addCriterion("anno_title in", values, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleNotIn(List<String> values) {
            addCriterion("anno_title not in", values, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleBetween(String value1, String value2) {
            addCriterion("anno_title between", value1, value2, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoTitleNotBetween(String value1, String value2) {
            addCriterion("anno_title not between", value1, value2, "annoTitle");
            return (Criteria) this;
        }

        public Criteria andAnnoContentIsNull() {
            addCriterion("anno_content is null");
            return (Criteria) this;
        }

        public Criteria andAnnoContentIsNotNull() {
            addCriterion("anno_content is not null");
            return (Criteria) this;
        }

        public Criteria andAnnoContentEqualTo(String value) {
            addCriterion("anno_content =", value, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentNotEqualTo(String value) {
            addCriterion("anno_content <>", value, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentGreaterThan(String value) {
            addCriterion("anno_content >", value, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentGreaterThanOrEqualTo(String value) {
            addCriterion("anno_content >=", value, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentLessThan(String value) {
            addCriterion("anno_content <", value, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentLessThanOrEqualTo(String value) {
            addCriterion("anno_content <=", value, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentLike(String value) {
            addCriterion("anno_content like", value, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentNotLike(String value) {
            addCriterion("anno_content not like", value, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentIn(List<String> values) {
            addCriterion("anno_content in", values, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentNotIn(List<String> values) {
            addCriterion("anno_content not in", values, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentBetween(String value1, String value2) {
            addCriterion("anno_content between", value1, value2, "annoContent");
            return (Criteria) this;
        }

        public Criteria andAnnoContentNotBetween(String value1, String value2) {
            addCriterion("anno_content not between", value1, value2, "annoContent");
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