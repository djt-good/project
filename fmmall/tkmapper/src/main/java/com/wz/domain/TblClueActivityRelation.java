package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_clue_activity_relation")
public class TblClueActivityRelation {
    @Id
    private String id;

    @Column(name = "clue_id")
    private String clueId;

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
     * @return clue_id
     */
    public String getClueId() {
        return clueId;
    }

    /**
     * @param clueId
     */
    public void setClueId(String clueId) {
        this.clueId = clueId;
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