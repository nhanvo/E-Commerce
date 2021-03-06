package com.mivim.data.model;

import java.util.ArrayList;
import java.util.List;

public class CityStateListExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public CityStateListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
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
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
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

        public Criteria andCity_idIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCity_idIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCity_idEqualTo(String value) {
            addCriterion("city_id =", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotEqualTo(String value) {
            addCriterion("city_id <>", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idGreaterThan(String value) {
            addCriterion("city_id >", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idLessThan(String value) {
            addCriterion("city_id <", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idLike(String value) {
            addCriterion("city_id like", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotLike(String value) {
            addCriterion("city_id not like", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idIn(List<String> values) {
            addCriterion("city_id in", values, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotIn(List<String> values) {
            addCriterion("city_id not in", values, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_nameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCity_nameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCity_nameEqualTo(String value) {
            addCriterion("city_name =", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameGreaterThan(String value) {
            addCriterion("city_name >", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameLessThan(String value) {
            addCriterion("city_name <", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameLike(String value) {
            addCriterion("city_name like", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotLike(String value) {
            addCriterion("city_name not like", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameIn(List<String> values) {
            addCriterion("city_name in", values, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_par_idIsNull() {
            addCriterion("city_par_id is null");
            return (Criteria) this;
        }

        public Criteria andCity_par_idIsNotNull() {
            addCriterion("city_par_id is not null");
            return (Criteria) this;
        }

        public Criteria andCity_par_idEqualTo(String value) {
            addCriterion("city_par_id =", value, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idNotEqualTo(String value) {
            addCriterion("city_par_id <>", value, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idGreaterThan(String value) {
            addCriterion("city_par_id >", value, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idGreaterThanOrEqualTo(String value) {
            addCriterion("city_par_id >=", value, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idLessThan(String value) {
            addCriterion("city_par_id <", value, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idLessThanOrEqualTo(String value) {
            addCriterion("city_par_id <=", value, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idLike(String value) {
            addCriterion("city_par_id like", value, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idNotLike(String value) {
            addCriterion("city_par_id not like", value, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idIn(List<String> values) {
            addCriterion("city_par_id in", values, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idNotIn(List<String> values) {
            addCriterion("city_par_id not in", values, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idBetween(String value1, String value2) {
            addCriterion("city_par_id between", value1, value2, "city_par_id");
            return (Criteria) this;
        }

        public Criteria andCity_par_idNotBetween(String value1, String value2) {
            addCriterion("city_par_id not between", value1, value2, "city_par_id");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table city_state_list
     *
     * @mbg.generated do_not_delete_during_merge Wed Jul 19 11:59:46 IST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table city_state_list
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
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