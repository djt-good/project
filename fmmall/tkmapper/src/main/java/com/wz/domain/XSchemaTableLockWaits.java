package com.wz.domain;

import javax.persistence.*;

@Table(name = "x$schema_table_lock_waits")
public class XSchemaTableLockWaits {
    @Column(name = "object_schema")
    private String objectSchema;

    @Column(name = "object_name")
    private String objectName;

    @Column(name = "waiting_thread_id")
    private Long waitingThreadId;

    @Column(name = "waiting_pid")
    private Long waitingPid;

    @Column(name = "waiting_lock_type")
    private String waitingLockType;

    @Column(name = "waiting_lock_duration")
    private String waitingLockDuration;

    @Column(name = "waiting_query_secs")
    private Long waitingQuerySecs;

    @Column(name = "waiting_query_rows_affected")
    private Long waitingQueryRowsAffected;

    @Column(name = "waiting_query_rows_examined")
    private Long waitingQueryRowsExamined;

    @Column(name = "blocking_thread_id")
    private Long blockingThreadId;

    @Column(name = "blocking_pid")
    private Long blockingPid;

    @Column(name = "blocking_lock_type")
    private String blockingLockType;

    @Column(name = "blocking_lock_duration")
    private String blockingLockDuration;

    @Column(name = "sql_kill_blocking_query")
    private String sqlKillBlockingQuery;

    @Column(name = "sql_kill_blocking_connection")
    private String sqlKillBlockingConnection;

    @Column(name = "waiting_account")
    private String waitingAccount;

    @Column(name = "waiting_query")
    private String waitingQuery;

    @Column(name = "blocking_account")
    private String blockingAccount;

    /**
     * @return object_schema
     */
    public String getObjectSchema() {
        return objectSchema;
    }

    /**
     * @param objectSchema
     */
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    /**
     * @return object_name
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * @return waiting_thread_id
     */
    public Long getWaitingThreadId() {
        return waitingThreadId;
    }

    /**
     * @param waitingThreadId
     */
    public void setWaitingThreadId(Long waitingThreadId) {
        this.waitingThreadId = waitingThreadId;
    }

    /**
     * @return waiting_pid
     */
    public Long getWaitingPid() {
        return waitingPid;
    }

    /**
     * @param waitingPid
     */
    public void setWaitingPid(Long waitingPid) {
        this.waitingPid = waitingPid;
    }

    /**
     * @return waiting_lock_type
     */
    public String getWaitingLockType() {
        return waitingLockType;
    }

    /**
     * @param waitingLockType
     */
    public void setWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType;
    }

    /**
     * @return waiting_lock_duration
     */
    public String getWaitingLockDuration() {
        return waitingLockDuration;
    }

    /**
     * @param waitingLockDuration
     */
    public void setWaitingLockDuration(String waitingLockDuration) {
        this.waitingLockDuration = waitingLockDuration;
    }

    /**
     * @return waiting_query_secs
     */
    public Long getWaitingQuerySecs() {
        return waitingQuerySecs;
    }

    /**
     * @param waitingQuerySecs
     */
    public void setWaitingQuerySecs(Long waitingQuerySecs) {
        this.waitingQuerySecs = waitingQuerySecs;
    }

    /**
     * @return waiting_query_rows_affected
     */
    public Long getWaitingQueryRowsAffected() {
        return waitingQueryRowsAffected;
    }

    /**
     * @param waitingQueryRowsAffected
     */
    public void setWaitingQueryRowsAffected(Long waitingQueryRowsAffected) {
        this.waitingQueryRowsAffected = waitingQueryRowsAffected;
    }

    /**
     * @return waiting_query_rows_examined
     */
    public Long getWaitingQueryRowsExamined() {
        return waitingQueryRowsExamined;
    }

    /**
     * @param waitingQueryRowsExamined
     */
    public void setWaitingQueryRowsExamined(Long waitingQueryRowsExamined) {
        this.waitingQueryRowsExamined = waitingQueryRowsExamined;
    }

    /**
     * @return blocking_thread_id
     */
    public Long getBlockingThreadId() {
        return blockingThreadId;
    }

    /**
     * @param blockingThreadId
     */
    public void setBlockingThreadId(Long blockingThreadId) {
        this.blockingThreadId = blockingThreadId;
    }

    /**
     * @return blocking_pid
     */
    public Long getBlockingPid() {
        return blockingPid;
    }

    /**
     * @param blockingPid
     */
    public void setBlockingPid(Long blockingPid) {
        this.blockingPid = blockingPid;
    }

    /**
     * @return blocking_lock_type
     */
    public String getBlockingLockType() {
        return blockingLockType;
    }

    /**
     * @param blockingLockType
     */
    public void setBlockingLockType(String blockingLockType) {
        this.blockingLockType = blockingLockType;
    }

    /**
     * @return blocking_lock_duration
     */
    public String getBlockingLockDuration() {
        return blockingLockDuration;
    }

    /**
     * @param blockingLockDuration
     */
    public void setBlockingLockDuration(String blockingLockDuration) {
        this.blockingLockDuration = blockingLockDuration;
    }

    /**
     * @return sql_kill_blocking_query
     */
    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    /**
     * @param sqlKillBlockingQuery
     */
    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery;
    }

    /**
     * @return sql_kill_blocking_connection
     */
    public String getSqlKillBlockingConnection() {
        return sqlKillBlockingConnection;
    }

    /**
     * @param sqlKillBlockingConnection
     */
    public void setSqlKillBlockingConnection(String sqlKillBlockingConnection) {
        this.sqlKillBlockingConnection = sqlKillBlockingConnection;
    }

    /**
     * @return waiting_account
     */
    public String getWaitingAccount() {
        return waitingAccount;
    }

    /**
     * @param waitingAccount
     */
    public void setWaitingAccount(String waitingAccount) {
        this.waitingAccount = waitingAccount;
    }

    /**
     * @return waiting_query
     */
    public String getWaitingQuery() {
        return waitingQuery;
    }

    /**
     * @param waitingQuery
     */
    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery;
    }

    /**
     * @return blocking_account
     */
    public String getBlockingAccount() {
        return blockingAccount;
    }

    /**
     * @param blockingAccount
     */
    public void setBlockingAccount(String blockingAccount) {
        this.blockingAccount = blockingAccount;
    }
}