package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_tran")
public class TblTran {
    @Id
    private String id;

    private String owner;

    private String money;

    private String name;

    @Column(name = "expected_date")
    private String expectedDate;

    @Column(name = "customer_id")
    private String customerId;

    private String stage;

    private String type;

    private String source;

    @Column(name = "activity_id")
    private String activityId;

    @Column(name = "contacts_id")
    private String contactsId;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "edit_by")
    private String editBy;

    @Column(name = "edit_time")
    private String editTime;

    private String description;

    @Column(name = "contact_summary")
    private String contactSummary;

    @Column(name = "next_contact_time")
    private String nextContactTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return money
     */
    public String getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(String money) {
        this.money = money;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return expected_date
     */
    public String getExpectedDate() {
        return expectedDate;
    }

    /**
     * @param expectedDate
     */
    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    /**
     * @return customer_id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * @param stage
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return activity_id
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * @param activityId
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * @return contacts_id
     */
    public String getContactsId() {
        return contactsId;
    }

    /**
     * @param contactsId
     */
    public void setContactsId(String contactsId) {
        this.contactsId = contactsId;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return edit_by
     */
    public String getEditBy() {
        return editBy;
    }

    /**
     * @param editBy
     */
    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

    /**
     * @return edit_time
     */
    public String getEditTime() {
        return editTime;
    }

    /**
     * @param editTime
     */
    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return contact_summary
     */
    public String getContactSummary() {
        return contactSummary;
    }

    /**
     * @param contactSummary
     */
    public void setContactSummary(String contactSummary) {
        this.contactSummary = contactSummary;
    }

    /**
     * @return next_contact_time
     */
    public String getNextContactTime() {
        return nextContactTime;
    }

    /**
     * @param nextContactTime
     */
    public void setNextContactTime(String nextContactTime) {
        this.nextContactTime = nextContactTime;
    }
}