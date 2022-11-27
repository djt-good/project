package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_activity_remark")
public class TblActivityRemark {
    @Id
    private String id;

    @Column(name = "note_content")
    private String noteContent;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "edit_time")
    private String editTime;

    @Column(name = "edit_by")
    private String editBy;

    /**
     * 0ҭʾδўلì1ҭʾӑўل
     */
    @Column(name = "edit_flag")
    private String editFlag;

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
     * @return note_content
     */
    public String getNoteContent() {
        return noteContent;
    }

    /**
     * @param noteContent
     */
    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
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
     * 获取0ҭʾδўلì1ҭʾӑўل
     *
     * @return edit_flag - 0ҭʾδўلì1ҭʾӑўل
     */
    public String getEditFlag() {
        return editFlag;
    }

    /**
     * 设置0ҭʾδўلì1ҭʾӑўل
     *
     * @param editFlag 0ҭʾδўلì1ҭʾӑўل
     */
    public void setEditFlag(String editFlag) {
        this.editFlag = editFlag;
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