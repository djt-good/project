package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_clue")
public class TblClue {
    @Id
    private String id;

    private String fullname;

    private String appellation;

    private String owner;

    private String company;

    private String job;

    private String email;

    private String phone;

    private String website;

    private String mphone;

    private String state;

    private String source;

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
     * @return company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
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
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website
     */
    public void setWebsite(String website) {
        this.website = website;
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
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
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