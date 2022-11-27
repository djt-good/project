package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_customer")
public class TblCustomer {
    @Id
    private String id;

    private String owner;

    private String name;

    private String website;

    private String phone;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "edit_by")
    private String editBy;

    @Column(name = "edit_time")
    private String editTime;

    @Column(name = "contact_summary")
    private String contactSummary;

    @Column(name = "next_contact_time")
    private String nextContactTime;

    private String description;

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