package com.mivim.data.model;

import java.util.Date;

public class Orderitem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.Id
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.orderId
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.itemId
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    private String itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.orderDate
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    private String orderDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.totalPrice
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    private String totalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.quantity
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    private String quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.updatedDate
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    private Date updatedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.status
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.Id
     *
     * @return the value of orderitem.Id
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.Id
     *
     * @param id the value for orderitem.Id
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.orderId
     *
     * @return the value of orderitem.orderId
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.orderId
     *
     * @param orderId the value for orderitem.orderId
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.itemId
     *
     * @return the value of orderitem.itemId
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.itemId
     *
     * @param itemId the value for orderitem.itemId
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.orderDate
     *
     * @return the value of orderitem.orderDate
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.orderDate
     *
     * @param orderDate the value for orderitem.orderDate
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate == null ? null : orderDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.totalPrice
     *
     * @return the value of orderitem.totalPrice
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.totalPrice
     *
     * @param totalPrice the value for orderitem.totalPrice
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.quantity
     *
     * @return the value of orderitem.quantity
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.quantity
     *
     * @param quantity the value for orderitem.quantity
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.updatedDate
     *
     * @return the value of orderitem.updatedDate
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.updatedDate
     *
     * @param updatedDate the value for orderitem.updatedDate
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.status
     *
     * @return the value of orderitem.status
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.status
     *
     * @param status the value for orderitem.status
     *
     * @mbg.generated Wed Jul 19 11:59:46 IST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}