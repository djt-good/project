package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_contacts_activity_relation")
public class TblContactsActivityRelation {
    @Id
    private String id;

    @Column(name = "contacts_id")
    private String contactsId;

    @Column(name = "activity_id")
    private String activityId;

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
}