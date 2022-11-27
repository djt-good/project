package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_contacts")
public class TblContacts {
    @Id
    private String id;

    private String owner;

    private String source;

    @Column(name = "customer_id")
    private String customerId;

    private String fullname;

    private String appellation;

    private String email;

    private String mphone;

    private String job;

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

    private String address;

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
     * @return fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * @param fullname
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * @return appellation
     */
    public String getAppellation() {
        return appellation;
    }

    /**
     * @param appellation
     */
    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return mphone
     */
    public String getMphone() {
        return mphone;
    }

    /**
     * @param mphone
     */
    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    /**
     * @return job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
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

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}