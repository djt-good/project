package com.wz.domain;

import javax.persistence.*;

public class Db {
    @Id
    @Column(name = "Host")
    private String host;

    @Id
    @Column(name = "Db")
    private String db;

    @Id
    @Column(name = "User")
    private String user;

    @Column(name = "Select_priv")
    private String selectPriv;

    @Column(name = "Insert_priv")
    private String insertPriv;

    @Column(name = "Update_priv")
    private String updatePriv;

    @Column(name = "Delete_priv")
    private String deletePriv;

    @Column(name = "Create_priv")
    private String createPriv;

    @Column(name = "Drop_priv")
    private String dropPriv;

    @Column(name = "Grant_priv")
    private String grantPriv;

    @Column(name = "References_priv")
    private String referencesPriv;

    @Column(name = "Index_priv")
    private String indexPriv;

    @Column(name = "Alter_priv")
    private String alterPriv;

    @Column(name = "Create_tmp_table_priv")
    private String createTmpTablePriv;

    @Column(name = "Lock_tables_priv")
    private String lockTablesPriv;

    @Column(name = "Create_view_priv")
    private String createViewPriv;

    @Column(name = "Show_view_priv")
    private String showViewPriv;

    @Column(name = "Create_routine_priv")
    private String createRoutinePriv;

    @Column(name = "Alter_routine_priv")
    private String alterRoutinePriv;

    @Column(name = "Execute_priv")
    private String executePriv;

    @Column(name = "Event_priv")
    private String eventPriv;

    @Column(name = "Trigger_priv")
    private String triggerPriv;

    /**
     * @return Host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return Db
     */
    public String getDb() {
        return db;
    }

    /**
     * @param db
     */
    public void setDb(String db) {
        this.db = db;
    }

    /**
     * @return User
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return Select_priv
     */
    public String getSelectPriv() {
        return selectPriv;
    }

    /**
     * @param selectPriv
     */
    public void setSelectPriv(String selectPriv) {
        this.selectPriv = selectPriv;
    }

    /**
     * @return Insert_priv
     */
    public String getInsertPriv() {
        return insertPriv;
    }

    /**
     * @param insertPriv
     */
    public void setInsertPriv(String insertPriv) {
        this.insertPriv = insertPriv;
    }

    /**
     * @return Update_priv
     */
    public String getUpdatePriv() {
        return updatePriv;
    }

    /**
     * @param updatePriv
     */
    public void setUpdatePriv(String updatePriv) {
        this.updatePriv = updatePriv;
    }

    /**
     * @return Delete_priv
     */
    public String getDeletePriv() {
        return deletePriv;
    }

    /**
     * @param deletePriv
     */
    public void setDeletePriv(String deletePriv) {
        this.deletePriv = deletePriv;
    }

    /**
     * @return Create_priv
     */
    public String getCreatePriv() {
        return createPriv;
    }

    /**
     * @param createPriv
     */
    public void setCreatePriv(String createPriv) {
        this.createPriv = createPriv;
    }

    /**
     * @return Drop_priv
     */
    public String getDropPriv() {
        return dropPriv;
    }

    /**
     * @param dropPriv
     */
    public void setDropPriv(String dropPriv) {
        this.dropPriv = dropPriv;
    }

    /**
     * @return Grant_priv
     */
    public String getGrantPriv() {
        return grantPriv;
    }

    /**
     * @param grantPriv
     */
    public void setGrantPriv(String grantPriv) {
        this.grantPriv = grantPriv;
    }

    /**
     * @return References_priv
     */
    public String getReferencesPriv() {
        return referencesPriv;
    }

    /**
     * @param referencesPriv
     */
    public void setReferencesPriv(String referencesPriv) {
        this.referencesPriv = referencesPriv;
    }

    /**
     * @return Index_priv
     */
    public String getIndexPriv() {
        return indexPriv;
    }

    /**
     * @param indexPriv
     */
    public void setIndexPriv(String indexPriv) {
        this.indexPriv = indexPriv;
    }

    /**
     * @return Alter_priv
     */
    public String getAlterPriv() {
        return alterPriv;
    }

    /**
     * @param alterPriv
     */
    public void setAlterPriv(String alterPriv) {
        this.alterPriv = alterPriv;
    }

    /**
     * @return Create_tmp_table_priv
     */
    public String getCreateTmpTablePriv() {
        return createTmpTablePriv;
    }

    /**
     * @param createTmpTablePriv
     */
    public void setCreateTmpTablePriv(String createTmpTablePriv) {
        this.createTmpTablePriv = createTmpTablePriv;
    }

    /**
     * @return Lock_tables_priv
     */
    public String getLockTablesPriv() {
        return lockTablesPriv;
    }

    /**
     * @param lockTablesPriv
     */
    public void setLockTablesPriv(String lockTablesPriv) {
        this.lockTablesPriv = lockTablesPriv;
    }

    /**
     * @return Create_view_priv
     */
    public String getCreateViewPriv() {
        return createViewPriv;
    }

    /**
     * @param createViewPriv
     */
    public void setCreateViewPriv(String createViewPriv) {
        this.createViewPriv = createViewPriv;
    }

    /**
     * @return Show_view_priv
     */
    public String getShowViewPriv() {
        return showViewPriv;
    }

    /**
     * @param showViewPriv
     */
    public void setShowViewPriv(String showViewPriv) {
        this.showViewPriv = showViewPriv;
    }

    /**
     * @return Create_routine_priv
     */
    public String getCreateRoutinePriv() {
        return createRoutinePriv;
    }

    /**
     * @param createRoutinePriv
     */
    public void setCreateRoutinePriv(String createRoutinePriv) {
        this.createRoutinePriv = createRoutinePriv;
    }

    /**
     * @return Alter_routine_priv
     */
    public String getAlterRoutinePriv() {
        return alterRoutinePriv;
    }

    /**
     * @param alterRoutinePriv
     */
    public void setAlterRoutinePriv(String alterRoutinePriv) {
        this.alterRoutinePriv = alterRoutinePriv;
    }

    /**
     * @return Execute_priv
     */
    public String getExecutePriv() {
        return executePriv;
    }

    /**
     * @param executePriv
     */
    public void setExecutePriv(String executePriv) {
        this.executePriv = executePriv;
    }

    /**
     * @return Event_priv
     */
    public String getEventPriv() {
        return eventPriv;
    }

    /**
     * @param eventPriv
     */
    public void setEventPriv(String eventPriv) {
        this.eventPriv = eventPriv;
    }

    /**
     * @return Trigger_priv
     */
    public String getTriggerPriv() {
        return triggerPriv;
    }

    /**
     * @param triggerPriv
     */
    public void setTriggerPriv(String triggerPriv) {
        this.triggerPriv = triggerPriv;
    }
}