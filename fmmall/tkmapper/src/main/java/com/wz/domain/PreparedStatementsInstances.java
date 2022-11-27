package com.wz.domain;

import javax.persistence.*;

@Table(name = "prepared_statements_instances")
public class PreparedStatementsInstances {
    @Id
    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "STATEMENT_ID")
    private Long statementId;

    @Column(name = "STATEMENT_NAME")
    private String statementName;

    @Column(name = "OWNER_THREAD_ID")
    private Long ownerThreadId;

    @Column(name = "OWNER_EVENT_ID")
    private Long ownerEventId;

    @Column(name = "OWNER_OBJECT_TYPE")
    private String ownerObjectType;

    @Column(name = "OWNER_OBJECT_SCHEMA")
    private String ownerObjectSchema;

    @Column(name = "OWNER_OBJECT_NAME")
    private String ownerObjectName;

    @Column(name = "TIMER_PREPARE")
    private Long timerPrepare;

    @Column(name = "COUNT_REPREPARE")
    private Long countReprepare;

    @Column(name = "COUNT_EXECUTE")
    private Long countExecute;

    @Column(name = "SUM_TIMER_EXECUTE")
    private Long sumTimerExecute;

    @Column(name = "MIN_TIMER_EXECUTE")
    private Long minTimerExecute;

    @Column(name = "AVG_TIMER_EXECUTE")
    private Long avgTimerExecute;

    @Column(name = "MAX_TIMER_EXECUTE")
    private Long maxTimerExecute;

    @Column(name = "SUM_LOCK_TIME")
    private Long sumLockTime;

    @Column(name = "SUM_ERRORS")
    private Long sumErrors;

    @Column(name = "SUM_WARNINGS")
    private Long sumWarnings;

    @Column(name = "SUM_ROWS_AFFECTED")
    private Long sumRowsAffected;

    @Column(name = "SUM_ROWS_SENT")
    private Long sumRowsSent;

    @Column(name = "SUM_ROWS_EXAMINED")
    private Long sumRowsExamined;

    @Column(name = "SUM_CREATED_TMP_DISK_TABLES")
    private Long sumCreatedTmpDiskTables;

    @Column(name = "SUM_CREATED_TMP_TABLES")
    private Long sumCreatedTmpTables;

    @Column(name = "SUM_SELECT_FULL_JOIN")
    private Long sumSelectFullJoin;

    @Column(name = "SUM_SELECT_FULL_RANGE_JOIN")
    private Long sumSelectFullRangeJoin;

    @Column(name = "SUM_SELECT_RANGE")
    private Long sumSelectRange;

    @Column(name = "SUM_SELECT_RANGE_CHECK")
    private Long sumSelectRangeCheck;

    @Column(name = "SUM_SELECT_SCAN")
    private Long sumSelectScan;

    @Column(name = "SUM_SORT_MERGE_PASSES")
    private Long sumSortMergePasses;

    @Column(name = "SUM_SORT_RANGE")
    private Long sumSortRange;

    @Column(name = "SUM_SORT_ROWS")
    private Long sumSortRows;

    @Column(name = "SUM_SORT_SCAN")
    private Long sumSortScan;

    @Column(name = "SUM_NO_INDEX_USED")
    private Long sumNoIndexUsed;

    @Column(name = "SUM_NO_GOOD_INDEX_USED")
    private Long sumNoGoodIndexUsed;

    @Column(name = "SQL_TEXT")
    private String sqlText;

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
     * @return STATEMENT_ID
     */
    public Long getStatementId() {
        return statementId;
    }

    /**
     * @param statementId
     */
    public void setStatementId(Long statementId) {
        this.statementId = statementId;
    }

    /**
     * @return STATEMENT_NAME
     */
    public String getStatementName() {
        return statementName;
    }

    /**
     * @param statementName
     */
    public void setStatementName(String statementName) {
        this.statementName = statementName;
    }

    /**
     * @return OWNER_THREAD_ID
     */
    public Long getOwnerThreadId() {
        return ownerThreadId;
    }

    /**
     * @param ownerThreadId
     */
    public void setOwnerThreadId(Long ownerThreadId) {
        this.ownerThreadId = ownerThreadId;
    }

    /**
     * @return OWNER_EVENT_ID
     */
    public Long getOwnerEventId() {
        return ownerEventId;
    }

    /**
     * @param ownerEventId
     */
    public void setOwnerEventId(Long ownerEventId) {
        this.ownerEventId = ownerEventId;
    }

    /**
     * @return OWNER_OBJECT_TYPE
     */
    public String getOwnerObjectType() {
        return ownerObjectType;
    }

    /**
     * @param ownerObjectType
     */
    public void setOwnerObjectType(String ownerObjectType) {
        this.ownerObjectType = ownerObjectType;
    }

    /**
     * @return OWNER_OBJECT_SCHEMA
     */
    public String getOwnerObjectSchema() {
        return ownerObjectSchema;
    }

    /**
     * @param ownerObjectSchema
     */
    public void setOwnerObjectSchema(String ownerObjectSchema) {
        this.ownerObjectSchema = ownerObjectSchema;
    }

    /**
     * @return OWNER_OBJECT_NAME
     */
    public String getOwnerObjectName() {
        return ownerObjectName;
    }

    /**
     * @param ownerObjectName
     */
    public void setOwnerObjectName(String ownerObjectName) {
        this.ownerObjectName = ownerObjectName;
    }

    /**
     * @return TIMER_PREPARE
     */
    public Long getTimerPrepare() {
        return timerPrepare;
    }

    /**
     * @param timerPrepare
     */
    public void setTimerPrepare(Long timerPrepare) {
        this.timerPrepare = timerPrepare;
    }

    /**
     * @return COUNT_REPREPARE
     */
    public Long getCountReprepare() {
        return countReprepare;
    }

    /**
     * @param countReprepare
     */
    public void setCountReprepare(Long countReprepare) {
        this.countReprepare = countReprepare;
    }

    /**
     * @return COUNT_EXECUTE
     */
    public Long getCountExecute() {
        return countExecute;
    }

    /**
     * @param countExecute
     */
    public void setCountExecute(Long countExecute) {
        this.countExecute = countExecute;
    }

    /**
     * @return SUM_TIMER_EXECUTE
     */
    public Long getSumTimerExecute() {
        return sumTimerExecute;
    }

    /**
     * @param sumTimerExecute
     */
    public void setSumTimerExecute(Long sumTimerExecute) {
        this.sumTimerExecute = sumTimerExecute;
    }

    /**
     * @return MIN_TIMER_EXECUTE
     */
    public Long getMinTimerExecute() {
        return minTimerExecute;
    }

    /**
     * @param minTimerExecute
     */
    public void setMinTimerExecute(Long minTimerExecute) {
        this.minTimerExecute = minTimerExecute;
    }

    /**
     * @return AVG_TIMER_EXECUTE
     */
    public Long getAvgTimerExecute() {
        return avgTimerExecute;
    }

    /**
     * @param avgTimerExecute
     */
    public void setAvgTimerExecute(Long avgTimerExecute) {
        this.avgTimerExecute = avgTimerExecute;
    }

    /**
     * @return MAX_TIMER_EXECUTE
     */
    public Long getMaxTimerExecute() {
        return maxTimerExecute;
    }

    /**
     * @param maxTimerExecute
     */
    public void setMaxTimerExecute(Long maxTimerExecute) {
        this.maxTimerExecute = maxTimerExecute;
    }

    /**
     * @return SUM_LOCK_TIME
     */
    public Long getSumLockTime() {
        return sumLockTime;
    }

    /**
     * @param sumLockTime
     */
    public void setSumLockTime(Long sumLockTime) {
        this.sumLockTime = sumLockTime;
    }

    /**
     * @return SUM_ERRORS
     */
    public Long getSumErrors() {
        return sumErrors;
    }

    /**
     * @param sumErrors
     */
    public void setSumErrors(Long sumErrors) {
        this.sumErrors = sumErrors;
    }

    /**
     * @return SUM_WARNINGS
     */
    public Long getSumWarnings() {
        return sumWarnings;
    }

    /**
     * @param sumWarnings
     */
    public void setSumWarnings(Long sumWarnings) {
        this.sumWarnings = sumWarnings;
    }

    /**
     * @return SUM_ROWS_AFFECTED
     */
    public Long getSumRowsAffected() {
        return sumRowsAffected;
    }

    /**
     * @param sumRowsAffected
     */
    public void setSumRowsAffected(Long sumRowsAffected) {
        this.sumRowsAffected = sumRowsAffected;
    }

    /**
     * @return SUM_ROWS_SENT
     */
    public Long getSumRowsSent() {
        return sumRowsSent;
    }

    /**
     * @param sumRowsSent
     */
    public void setSumRowsSent(Long sumRowsSent) {
        this.sumRowsSent = sumRowsSent;
    }

    /**
     * @return SUM_ROWS_EXAMINED
     */
    public Long getSumRowsExamined() {
        return sumRowsExamined;
    }

    /**
     * @param sumRowsExamined
     */
    public void setSumRowsExamined(Long sumRowsExamined) {
        this.sumRowsExamined = sumRowsExamined;
    }

    /**
     * @return SUM_CREATED_TMP_DISK_TABLES
     */
    public Long getSumCreatedTmpDiskTables() {
        return sumCreatedTmpDiskTables;
    }

    /**
     * @param sumCreatedTmpDiskTables
     */
    public void setSumCreatedTmpDiskTables(Long sumCreatedTmpDiskTables) {
        this.sumCreatedTmpDiskTables = sumCreatedTmpDiskTables;
    }

    /**
     * @return SUM_CREATED_TMP_TABLES
     */
    public Long getSumCreatedTmpTables() {
        return sumCreatedTmpTables;
    }

    /**
     * @param sumCreatedTmpTables
     */
    public void setSumCreatedTmpTables(Long sumCreatedTmpTables) {
        this.sumCreatedTmpTables = sumCreatedTmpTables;
    }

    /**
     * @return SUM_SELECT_FULL_JOIN
     */
    public Long getSumSelectFullJoin() {
        return sumSelectFullJoin;
    }

    /**
     * @param sumSelectFullJoin
     */
    public void setSumSelectFullJoin(Long sumSelectFullJoin) {
        this.sumSelectFullJoin = sumSelectFullJoin;
    }

    /**
     * @return SUM_SELECT_FULL_RANGE_JOIN
     */
    public Long getSumSelectFullRangeJoin() {
        return sumSelectFullRangeJoin;
    }

    /**
     * @param sumSelectFullRangeJoin
     */
    public void setSumSelectFullRangeJoin(Long sumSelectFullRangeJoin) {
        this.sumSelectFullRangeJoin = sumSelectFullRangeJoin;
    }

    /**
     * @return SUM_SELECT_RANGE
     */
    public Long getSumSelectRange() {
        return sumSelectRange;
    }

    /**
     * @param sumSelectRange
     */
    public void setSumSelectRange(Long sumSelectRange) {
        this.sumSelectRange = sumSelectRange;
    }

    /**
     * @return SUM_SELECT_RANGE_CHECK
     */
    public Long getSumSelectRangeCheck() {
        return sumSelectRangeCheck;
    }

    /**
     * @param sumSelectRangeCheck
     */
    public void setSumSelectRangeCheck(Long sumSelectRangeCheck) {
        this.sumSelectRangeCheck = sumSelectRangeCheck;
    }

    /**
     * @return SUM_SELECT_SCAN
     */
    public Long getSumSelectScan() {
        return sumSelectScan;
    }

    /**
     * @param sumSelectScan
     */
    public void setSumSelectScan(Long sumSelectScan) {
        this.sumSelectScan = sumSelectScan;
    }

    /**
     * @return SUM_SORT_MERGE_PASSES
     */
    public Long getSumSortMergePasses() {
        return sumSortMergePasses;
    }

    /**
     * @param sumSortMergePasses
     */
    public void setSumSortMergePasses(Long sumSortMergePasses) {
        this.sumSortMergePasses = sumSortMergePasses;
    }

    /**
     * @return SUM_SORT_RANGE
     */
    public Long getSumSortRange() {
        return sumSortRange;
    }

    /**
     * @param sumSortRange
     */
    public void setSumSortRange(Long sumSortRange) {
        this.sumSortRange = sumSortRange;
    }

    /**
     * @return SUM_SORT_ROWS
     */
    public Long getSumSortRows() {
        return sumSortRows;
    }

    /**
     * @param sumSortRows
     */
    public void setSumSortRows(Long sumSortRows) {
        this.sumSortRows = sumSortRows;
    }

    /**
     * @return SUM_SORT_SCAN
     */
    public Long getSumSortScan() {
        return sumSortScan;
    }

    /**
     * @param sumSortScan
     */
    public void setSumSortScan(Long sumSortScan) {
        this.sumSortScan = sumSortScan;
    }

    /**
     * @return SUM_NO_INDEX_USED
     */
    public Long getSumNoIndexUsed() {
        return sumNoIndexUsed;
    }

    /**
     * @param sumNoIndexUsed
     */
    public void setSumNoIndexUsed(Long sumNoIndexUsed) {
        this.sumNoIndexUsed = sumNoIndexUsed;
    }

    /**
     * @return SUM_NO_GOOD_INDEX_USED
     */
    public Long getSumNoGoodIndexUsed() {
        return sumNoGoodIndexUsed;
    }

    /**
     * @param sumNoGoodIndexUsed
     */
    public void setSumNoGoodIndexUsed(Long sumNoGoodIndexUsed) {
        this.sumNoGoodIndexUsed = sumNoGoodIndexUsed;
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
}