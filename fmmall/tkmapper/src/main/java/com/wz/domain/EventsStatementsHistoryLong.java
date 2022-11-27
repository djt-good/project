package com.wz.domain;

import javax.persistence.*;

@Table(name = "events_statements_history_long")
public class EventsStatementsHistoryLong {
    @Column(name = "THREAD_ID")
    private Long threadId;

    @Column(name = "EVENT_ID")
    private Long eventId;

    @Column(name = "END_EVENT_ID")
    private Long endEventId;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "TIMER_START")
    private Long timerStart;

    @Column(name = "TIMER_END")
    private Long timerEnd;

    @Column(name = "TIMER_WAIT")
    private Long timerWait;

    @Column(name = "LOCK_TIME")
    private Long lockTime;

    @Column(name = "DIGEST")
    private String digest;

    @Column(name = "CURRENT_SCHEMA")
    private String currentSchema;

    @Column(name = "OBJECT_TYPE")
    private String objectType;

    @Column(name = "OBJECT_SCHEMA")
    private String objectSchema;

    @Column(name = "OBJECT_NAME")
    private String objectName;

    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "MYSQL_ERRNO")
    private Integer mysqlErrno;

    @Column(name = "RETURNED_SQLSTATE")
    private String returnedSqlstate;

    @Column(name = "MESSAGE_TEXT")
    private String messageText;

    @Column(name = "ERRORS")
    private Long errors;

    @Column(name = "WARNINGS")
    private Long warnings;

    @Column(name = "ROWS_AFFECTED")
    private Long rowsAffected;

    @Column(name = "ROWS_SENT")
    private Long rowsSent;

    @Column(name = "ROWS_EXAMINED")
    private Long rowsExamined;

    @Column(name = "CREATED_TMP_DISK_TABLES")
    private Long createdTmpDiskTables;

    @Column(name = "CREATED_TMP_TABLES")
    private Long createdTmpTables;

    @Column(name = "SELECT_FULL_JOIN")
    private Long selectFullJoin;

    @Column(name = "SELECT_FULL_RANGE_JOIN")
    private Long selectFullRangeJoin;

    @Column(name = "SELECT_RANGE")
    private Long selectRange;

    @Column(name = "SELECT_RANGE_CHECK")
    private Long selectRangeCheck;

    @Column(name = "SELECT_SCAN")
    private Long selectScan;

    @Column(name = "SORT_MERGE_PASSES")
    private Long sortMergePasses;

    @Column(name = "SORT_RANGE")
    private Long sortRange;

    @Column(name = "SORT_ROWS")
    private Long sortRows;

    @Column(name = "SORT_SCAN")
    private Long sortScan;

    @Column(name = "NO_INDEX_USED")
    private Long noIndexUsed;

    @Column(name = "NO_GOOD_INDEX_USED")
    private Long noGoodIndexUsed;

    @Column(name = "NESTING_EVENT_ID")
    private Long nestingEventId;

    @Column(name = "NESTING_EVENT_TYPE")
    private String nestingEventType;

    @Column(name = "NESTING_EVENT_LEVEL")
    private Integer nestingEventLevel;

    @Column(name = "SQL_TEXT")
    private String sqlText;

    @Column(name = "DIGEST_TEXT")
    private String digestText;

    /**
     * @return THREAD_ID
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
     * @return EVENT_ID
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * @param eventId
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * @return END_EVENT_ID
     */
    public Long getEndEventId() {
        return endEventId;
    }

    /**
     * @param endEventId
     */
    public void setEndEventId(Long endEventId) {
        this.endEventId = endEventId;
    }

    /**
     * @return EVENT_NAME
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @return SOURCE
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
     * @return TIMER_START
     */
    public Long getTimerStart() {
        return timerStart;
    }

    /**
     * @param timerStart
     */
    public void setTimerStart(Long timerStart) {
        this.timerStart = timerStart;
    }

    /**
     * @return TIMER_END
     */
    public Long getTimerEnd() {
        return timerEnd;
    }

    /**
     * @param timerEnd
     */
    public void setTimerEnd(Long timerEnd) {
        this.timerEnd = timerEnd;
    }

    /**
     * @return TIMER_WAIT
     */
    public Long getTimerWait() {
        return timerWait;
    }

    /**
     * @param timerWait
     */
    public void setTimerWait(Long timerWait) {
        this.timerWait = timerWait;
    }

    /**
     * @return LOCK_TIME
     */
    public Long getLockTime() {
        return lockTime;
    }

    /**
     * @param lockTime
     */
    public void setLockTime(Long lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * @return DIGEST
     */
    public String getDigest() {
        return digest;
    }

    /**
     * @param digest
     */
    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * @return CURRENT_SCHEMA
     */
    public String getCurrentSchema() {
        return currentSchema;
    }

    /**
     * @param currentSchema
     */
    public void setCurrentSchema(String currentSchema) {
        this.currentSchema = currentSchema;
    }

    /**
     * @return OBJECT_TYPE
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * @param objectType
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * @return OBJECT_SCHEMA
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
     * @return OBJECT_NAME
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
     * @return OBJECT_INSTANCE_BEGIN
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * @param objectInstanceBegin
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * @return MYSQL_ERRNO
     */
    public Integer getMysqlErrno() {
        return mysqlErrno;
    }

    /**
     * @param mysqlErrno
     */
    public void setMysqlErrno(Integer mysqlErrno) {
        this.mysqlErrno = mysqlErrno;
    }

    /**
     * @return RETURNED_SQLSTATE
     */
    public String getReturnedSqlstate() {
        return returnedSqlstate;
    }

    /**
     * @param returnedSqlstate
     */
    public void setReturnedSqlstate(String returnedSqlstate) {
        this.returnedSqlstate = returnedSqlstate;
    }

    /**
     * @return MESSAGE_TEXT
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * @param messageText
     */
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    /**
     * @return ERRORS
     */
    public Long getErrors() {
        return errors;
    }

    /**
     * @param errors
     */
    public void setErrors(Long errors) {
        this.errors = errors;
    }

    /**
     * @return WARNINGS
     */
    public Long getWarnings() {
        return warnings;
    }

    /**
     * @param warnings
     */
    public void setWarnings(Long warnings) {
        this.warnings = warnings;
    }

    /**
     * @return ROWS_AFFECTED
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    /**
     * @param rowsAffected
     */
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    /**
     * @return ROWS_SENT
     */
    public Long getRowsSent() {
        return rowsSent;
    }

    /**
     * @param rowsSent
     */
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * @return ROWS_EXAMINED
     */
    public Long getRowsExamined() {
        return rowsExamined;
    }

    /**
     * @param rowsExamined
     */
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * @return CREATED_TMP_DISK_TABLES
     */
    public Long getCreatedTmpDiskTables() {
        return createdTmpDiskTables;
    }

    /**
     * @param createdTmpDiskTables
     */
    public void setCreatedTmpDiskTables(Long createdTmpDiskTables) {
        this.createdTmpDiskTables = createdTmpDiskTables;
    }

    /**
     * @return CREATED_TMP_TABLES
     */
    public Long getCreatedTmpTables() {
        return createdTmpTables;
    }

    /**
     * @param createdTmpTables
     */
    public void setCreatedTmpTables(Long createdTmpTables) {
        this.createdTmpTables = createdTmpTables;
    }

    /**
     * @return SELECT_FULL_JOIN
     */
    public Long getSelectFullJoin() {
        return selectFullJoin;
    }

    /**
     * @param selectFullJoin
     */
    public void setSelectFullJoin(Long selectFullJoin) {
        this.selectFullJoin = selectFullJoin;
    }

    /**
     * @return SELECT_FULL_RANGE_JOIN
     */
    public Long getSelectFullRangeJoin() {
        return selectFullRangeJoin;
    }

    /**
     * @param selectFullRangeJoin
     */
    public void setSelectFullRangeJoin(Long selectFullRangeJoin) {
        this.selectFullRangeJoin = selectFullRangeJoin;
    }

    /**
     * @return SELECT_RANGE
     */
    public Long getSelectRange() {
        return selectRange;
    }

    /**
     * @param selectRange
     */
    public void setSelectRange(Long selectRange) {
        this.selectRange = selectRange;
    }

    /**
     * @return SELECT_RANGE_CHECK
     */
    public Long getSelectRangeCheck() {
        return selectRangeCheck;
    }

    /**
     * @param selectRangeCheck
     */
    public void setSelectRangeCheck(Long selectRangeCheck) {
        this.selectRangeCheck = selectRangeCheck;
    }

    /**
     * @return SELECT_SCAN
     */
    public Long getSelectScan() {
        return selectScan;
    }

    /**
     * @param selectScan
     */
    public void setSelectScan(Long selectScan) {
        this.selectScan = selectScan;
    }

    /**
     * @return SORT_MERGE_PASSES
     */
    public Long getSortMergePasses() {
        return sortMergePasses;
    }

    /**
     * @param sortMergePasses
     */
    public void setSortMergePasses(Long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    /**
     * @return SORT_RANGE
     */
    public Long getSortRange() {
        return sortRange;
    }

    /**
     * @param sortRange
     */
    public void setSortRange(Long sortRange) {
        this.sortRange = sortRange;
    }

    /**
     * @return SORT_ROWS
     */
    public Long getSortRows() {
        return sortRows;
    }

    /**
     * @param sortRows
     */
    public void setSortRows(Long sortRows) {
        this.sortRows = sortRows;
    }

    /**
     * @return SORT_SCAN
     */
    public Long getSortScan() {
        return sortScan;
    }

    /**
     * @param sortScan
     */
    public void setSortScan(Long sortScan) {
        this.sortScan = sortScan;
    }

    /**
     * @return NO_INDEX_USED
     */
    public Long getNoIndexUsed() {
        return noIndexUsed;
    }

    /**
     * @param noIndexUsed
     */
    public void setNoIndexUsed(Long noIndexUsed) {
        this.noIndexUsed = noIndexUsed;
    }

    /**
     * @return NO_GOOD_INDEX_USED
     */
    public Long getNoGoodIndexUsed() {
        return noGoodIndexUsed;
    }

    /**
     * @param noGoodIndexUsed
     */
    public void setNoGoodIndexUsed(Long noGoodIndexUsed) {
        this.noGoodIndexUsed = noGoodIndexUsed;
    }

    /**
     * @return NESTING_EVENT_ID
     */
    public Long getNestingEventId() {
        return nestingEventId;
    }

    /**
     * @param nestingEventId
     */
    public void setNestingEventId(Long nestingEventId) {
        this.nestingEventId = nestingEventId;
    }

    /**
     * @return NESTING_EVENT_TYPE
     */
    public String getNestingEventType() {
        return nestingEventType;
    }

    /**
     * @param nestingEventType
     */
    public void setNestingEventType(String nestingEventType) {
        this.nestingEventType = nestingEventType;
    }

    /**
     * @return NESTING_EVENT_LEVEL
     */
    public Integer getNestingEventLevel() {
        return nestingEventLevel;
    }

    /**
     * @param nestingEventLevel
     */
    public void setNestingEventLevel(Integer nestingEventLevel) {
        this.nestingEventLevel = nestingEventLevel;
    }

    /**
     * @return SQL_TEXT
     */
    public String getSqlText() {
        return sqlText;
    }

    /**
     * @param sqlText
     */
    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    /**
     * @return DIGEST_TEXT
     */
    public String getDigestText() {
        return digestText;
    }

    /**
     * @param digestText
     */
    public void setDigestText(String digestText) {
        this.digestText = digestText;
    }
}