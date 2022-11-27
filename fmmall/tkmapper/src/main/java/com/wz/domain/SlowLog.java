package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "slow_log")
public class SlowLog {
    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "query_time")
    private Date queryTime;

    @Column(name = "lock_time")
    private Date lockTime;

    @Column(name = "rows_sent")
    private Integer rowsSent;

    @Column(name = "rows_examined")
    private Integer rowsExamined;

    private String db;

    @Column(name = "last_insert_id")
    private Integer lastInsertId;

    @Column(name = "insert_id")
    private Integer insertId;

    @Column(name = "server_id")
    private Integer serverId;

    @Column(name = "thread_id")
    private Long threadId;

    @Column(name = "user_host")
    private String userHost;

    @Column(name = "sql_text")
    private byte[] sqlText;

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return query_time
     */
    public Date getQueryTime() {
        return queryTime;
    }

    /**
     * @param queryTime
     */
    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }

    /**
     * @return lock_time
     */
    public Date getLockTime() {
        return lockTime;
    }

    /**
     * @param lockTime
     */
    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * @return rows_sent
     */
    public Integer getRowsSent() {
        return rowsSent;
    }

    /**
     * @param rowsSent
     */
    public void setRowsSent(Integer rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * @return rows_examined
     */
    public Integer getRowsExamined() {
        return rowsExamined;
    }

    /**
     * @param rowsExamined
     */
    public void setRowsExamined(Integer rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * @return db
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
     * @return last_insert_id
     */
    public Integer getLastInsertId() {
        return lastInsertId;
    }

    /**
     * @param lastInsertId
     */
    public void setLastInsertId(Integer lastInsertId) {
        this.lastInsertId = lastInsertId;
    }

    /**
     * @return insert_id
     */
    public Integer getInsertId() {
        return insertId;
    }

    /**
     * @param insertId
     */
    public void setInsertId(Integer insertId) {
        this.insertId = insertId;
    }

    /**
     * @return server_id
     */
    public Integer getServerId() {
        return serverId;
    }

    /**
     * @param serverId
     */
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    /**
     * @return thread_id
     */
    public Long getThreadId() {
        return threadId;
    }

    /**
     * @param threadId
     */
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /**
     * @return user_host
     */
    public String getUserHost() {
        return userHost;
    }

    /**
     * @param userHost
     */
    public void setUserHost(String userHost) {
        this.userHost = userHost;
    }

    /**
     * @return sql_text
     */
    public byte[] getSqlText() {
        return sqlText;
    }

    /**
     * @param sqlText
     */
    public void setSqlText(byte[] sqlText) {
        this.sqlText = sqlText;
    }
}