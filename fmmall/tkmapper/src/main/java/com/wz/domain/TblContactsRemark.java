package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_contacts_remark")
public class TblContactsRemark {
    @Id
    private String id;

    @Column(name = "note_content")
    private String noteContent;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "edit_by")
    private String editBy;

    @Column(name = "edit_time")
    private String editTime;

    @Column(name = "edit_flag")
    private String editFlag;

    @Column(name = "contacts_id")
    private String contactsId;

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
     * @return edit_flag
     */
    public String getEditFlag() {
        return editFlag;
    }

    /**
     * @param editFlag
     */
    public void setEditFlag(String editFlag) {
        this.editFlag = editFlag;
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
}