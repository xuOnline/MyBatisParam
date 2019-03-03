package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CuxTodoItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CuxTodoItemsExample() {
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

        public Criteria andTodoItemIdIsNull() {
            addCriterion("todo_item_id is null");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdIsNotNull() {
            addCriterion("todo_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdEqualTo(Integer value) {
            addCriterion("todo_item_id =", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdNotEqualTo(Integer value) {
            addCriterion("todo_item_id <>", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdGreaterThan(Integer value) {
            addCriterion("todo_item_id >", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("todo_item_id >=", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdLessThan(Integer value) {
            addCriterion("todo_item_id <", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("todo_item_id <=", value, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdIn(List<Integer> values) {
            addCriterion("todo_item_id in", values, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdNotIn(List<Integer> values) {
            addCriterion("todo_item_id not in", values, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdBetween(Integer value1, Integer value2) {
            addCriterion("todo_item_id between", value1, value2, "todoItemId");
            return (Criteria) this;
        }

        public Criteria andTodoItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("todo_item_id not between", value1, value2, "todoItemId");
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

        public Criteria andTodoItemTitleIsNull() {
            addCriterion("todo_item_title is null");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleIsNotNull() {
            addCriterion("todo_item_title is not null");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleEqualTo(String value) {
            addCriterion("todo_item_title =", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleNotEqualTo(String value) {
            addCriterion("todo_item_title <>", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleGreaterThan(String value) {
            addCriterion("todo_item_title >", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleGreaterThanOrEqualTo(String value) {
            addCriterion("todo_item_title >=", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleLessThan(String value) {
            addCriterion("todo_item_title <", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleLessThanOrEqualTo(String value) {
            addCriterion("todo_item_title <=", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleLike(String value) {
            addCriterion("todo_item_title like", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleNotLike(String value) {
            addCriterion("todo_item_title not like", value, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleIn(List<String> values) {
            addCriterion("todo_item_title in", values, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleNotIn(List<String> values) {
            addCriterion("todo_item_title not in", values, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleBetween(String value1, String value2) {
            addCriterion("todo_item_title between", value1, value2, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemTitleNotBetween(String value1, String value2) {
            addCriterion("todo_item_title not between", value1, value2, "todoItemTitle");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentIsNull() {
            addCriterion("todo_item_content is null");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentIsNotNull() {
            addCriterion("todo_item_content is not null");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentEqualTo(String value) {
            addCriterion("todo_item_content =", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentNotEqualTo(String value) {
            addCriterion("todo_item_content <>", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentGreaterThan(String value) {
            addCriterion("todo_item_content >", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentGreaterThanOrEqualTo(String value) {
            addCriterion("todo_item_content >=", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentLessThan(String value) {
            addCriterion("todo_item_content <", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentLessThanOrEqualTo(String value) {
            addCriterion("todo_item_content <=", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentLike(String value) {
            addCriterion("todo_item_content like", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentNotLike(String value) {
            addCriterion("todo_item_content not like", value, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentIn(List<String> values) {
            addCriterion("todo_item_content in", values, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentNotIn(List<String> values) {
            addCriterion("todo_item_content not in", values, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentBetween(String value1, String value2) {
            addCriterion("todo_item_content between", value1, value2, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andTodoItemContentNotBetween(String value1, String value2) {
            addCriterion("todo_item_content not between", value1, value2, "todoItemContent");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("priority like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("priority not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creation_date is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("creation_date =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("creation_date <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("creation_date >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_date >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("creation_date <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("creation_date <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("creation_date in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("creation_date not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("creation_date between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("creation_date not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("last_update_date =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("last_update_date <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("last_update_date >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_date >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("last_update_date <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("last_update_date <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("last_update_date in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("last_update_date not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("last_update_date between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("last_update_date not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
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