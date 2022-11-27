package com.wz.domain;

import javax.persistence.*;

@Table(name = "events_statements_summary_by_thread_by_event_name")
public class EventsStatementsSummaryByThreadByEventName {
    @Id
    @Column(name = "THREAD_ID")
    private Long threadId;

    @Id
    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "COUNT_STAR")
    private Long countStar;

    @Column(name = "SUM_TIMER_WAIT")
    private Long sumTimerWait;

    @Column(name = "MIN_TIMER_WAIT")
    private Long minTimerWait;

    @Column(name = "AVG_TIMER_WAIT")
    private Long avgTimerWait;

    @Column(name = "MAX_TIMER_WAIT")
    private Long maxTimerWait;

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
     * @return COUNT_STAR
     */
    public Long getCountStar() {
        return countStar;
    }

    /**
     * @param countStar
     */
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    /**
     * @return SUM_TIMER_WAIT
     */
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    /**
     * @param sumTimerWait
     */
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    /**
     * @return MIN_TIMER_WAIT
     */
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    /**
     * @param minTimerWait
     */
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    /**
     * @return AVG_TIMER_WAIT
     */
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    /**
     * @param avgTimerWait
     */
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    /**
     * @return MAX_TIMER_WAIT
     */
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    /**
     * @param maxTimerWait
     */
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
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
}