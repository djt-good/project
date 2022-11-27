package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "events_statements_summary_by_digest")
public class EventsStatementsSummaryByDigest {
    @Column(name = "SCHEMA_NAME")
    private String schemaName;

    @Column(name = "DIGEST")
    private String digest;

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

    @Column(name = "FIRST_SEEN")
    private Date firstSeen;

    @Column(name = "LAST_SEEN")
    private Date lastSeen;

    @Column(name = "QUANTILE_95")
    private Long quantile95;

    @Column(name = "QUANTILE_99")
    private Long quantile99;

    @Column(name = "QUANTILE_999")
    private Long quantile999;

    @Column(name = "QUERY_SAMPLE_SEEN")
    private Date querySampleSeen;

    @Column(name = "QUERY_SAMPLE_TIMER_WAIT")
    private Long querySampleTimerWait;

    @Column(name = "DIGEST_TEXT")
    private String digestText;

    @Column(name = "QUERY_SAMPLE_TEXT")
    private String querySampleText;

    /**
     * @return SCHEMA_NAME
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * @param schemaName
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
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

    /**
     * @return FIRST_SEEN
     */
    public Date getFirstSeen() {
        return firstSeen;
    }

    /**
     * @param firstSeen
     */
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * @return LAST_SEEN
     */
    public Date getLastSeen() {
        return lastSeen;
    }

    /**
     * @param lastSeen
     */
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * @return QUANTILE_95
     */
    public Long getQuantile95() {
        return quantile95;
    }

    /**
     * @param quantile95
     */
    public void setQuantile95(Long quantile95) {
        this.quantile95 = quantile95;
    }

    /**
     * @return QUANTILE_99
     */
    public Long getQuantile99() {
        return quantile99;
    }

    /**
     * @param quantile99
     */
    public void setQuantile99(Long quantile99) {
        this.quantile99 = quantile99;
    }

    /**
     * @return QUANTILE_999
     */
    public Long getQuantile999() {
        return quantile999;
    }

    /**
     * @param quantile999
     */
    public void setQuantile999(Long quantile999) {
        this.quantile999 = quantile999;
    }

    /**
     * @return QUERY_SAMPLE_SEEN
     */
    public Date getQuerySampleSeen() {
        return querySampleSeen;
    }

    /**
     * @param querySampleSeen
     */
    public void setQuerySampleSeen(Date querySampleSeen) {
        this.querySampleSeen = querySampleSeen;
    }

    /**
     * @return QUERY_SAMPLE_TIMER_WAIT
     */
    public Long getQuerySampleTimerWait() {
        return querySampleTimerWait;
    }

    /**
     * @param querySampleTimerWait
     */
    public void setQuerySampleTimerWait(Long querySampleTimerWait) {
        this.querySampleTimerWait = querySampleTimerWait;
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

    /**
     * @return QUERY_SAMPLE_TEXT
     */
    public String getQuerySampleText() {
        return querySampleText;
    }

    /**
     * @param querySampleText
     */
    public void setQuerySampleText(String querySampleText) {
        this.querySampleText = querySampleText;
    }
}