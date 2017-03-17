package com.ym.er.model;

import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_id
     *
     * @mbggenerated
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.school_id
     *
     * @mbggenerated
     */
    private Integer schoolId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.type
     *
     * @mbggenerated
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbggenerated
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.origin_price
     *
     * @mbggenerated
     */
    private Double originPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.up_time
     *
     * @mbggenerated
     */
    private Date upTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.watch_times
     *
     * @mbggenerated
     */
    private Integer watchTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.favor_times
     *
     * @mbggenerated
     */
    private Integer favorTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.category
     *
     * @mbggenerated
     */
    private Integer category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.contact_1
     *
     * @mbggenerated
     */
    private String contact1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.contact_2
     *
     * @mbggenerated
     */
    private String contact2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.header
     *
     * @mbggenerated
     */
    private String header;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.save_1
     *
     * @mbggenerated
     */
    private String save1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.save_2
     *
     * @mbggenerated
     */
    private String save2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_id
     *
     * @return the value of product.product_id
     *
     * @mbggenerated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_id
     *
     * @param productId the value for product.product_id
     *
     * @mbggenerated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.user_id
     *
     * @return the value of product.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.user_id
     *
     * @param userId the value for product.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.school_id
     *
     * @return the value of product.school_id
     *
     * @mbggenerated
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.school_id
     *
     * @param schoolId the value for product.school_id
     *
     * @mbggenerated
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.type
     *
     * @return the value of product.type
     *
     * @mbggenerated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.type
     *
     * @param type the value for product.type
     *
     * @mbggenerated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbggenerated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbggenerated
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.origin_price
     *
     * @return the value of product.origin_price
     *
     * @mbggenerated
     */
    public Double getOriginPrice() {
        return originPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.origin_price
     *
     * @param originPrice the value for product.origin_price
     *
     * @mbggenerated
     */
    public void setOriginPrice(Double originPrice) {
        this.originPrice = originPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.description
     *
     * @return the value of product.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.description
     *
     * @param description the value for product.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.up_time
     *
     * @return the value of product.up_time
     *
     * @mbggenerated
     */
    public Date getUpTime() {
        return upTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.up_time
     *
     * @param upTime the value for product.up_time
     *
     * @mbggenerated
     */
    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.watch_times
     *
     * @return the value of product.watch_times
     *
     * @mbggenerated
     */
    public Integer getWatchTimes() {
        return watchTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.watch_times
     *
     * @param watchTimes the value for product.watch_times
     *
     * @mbggenerated
     */
    public void setWatchTimes(Integer watchTimes) {
        this.watchTimes = watchTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.favor_times
     *
     * @return the value of product.favor_times
     *
     * @mbggenerated
     */
    public Integer getFavorTimes() {
        return favorTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.favor_times
     *
     * @param favorTimes the value for product.favor_times
     *
     * @mbggenerated
     */
    public void setFavorTimes(Integer favorTimes) {
        this.favorTimes = favorTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.category
     *
     * @return the value of product.category
     *
     * @mbggenerated
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.category
     *
     * @param category the value for product.category
     *
     * @mbggenerated
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.contact_1
     *
     * @return the value of product.contact_1
     *
     * @mbggenerated
     */
    public String getContact1() {
        return contact1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.contact_1
     *
     * @param contact1 the value for product.contact_1
     *
     * @mbggenerated
     */
    public void setContact1(String contact1) {
        this.contact1 = contact1 == null ? null : contact1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.contact_2
     *
     * @return the value of product.contact_2
     *
     * @mbggenerated
     */
    public String getContact2() {
        return contact2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.contact_2
     *
     * @param contact2 the value for product.contact_2
     *
     * @mbggenerated
     */
    public void setContact2(String contact2) {
        this.contact2 = contact2 == null ? null : contact2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.status
     *
     * @return the value of product.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.status
     *
     * @param status the value for product.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.header
     *
     * @return the value of product.header
     *
     * @mbggenerated
     */
    public String getHeader() {
        return header;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.header
     *
     * @param header the value for product.header
     *
     * @mbggenerated
     */
    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.save_1
     *
     * @return the value of product.save_1
     *
     * @mbggenerated
     */
    public String getSave1() {
        return save1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.save_1
     *
     * @param save1 the value for product.save_1
     *
     * @mbggenerated
     */
    public void setSave1(String save1) {
        this.save1 = save1 == null ? null : save1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.save_2
     *
     * @return the value of product.save_2
     *
     * @mbggenerated
     */
    public String getSave2() {
        return save2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.save_2
     *
     * @param save2 the value for product.save_2
     *
     * @mbggenerated
     */
    public void setSave2(String save2) {
        this.save2 = save2 == null ? null : save2.trim();
    }
}