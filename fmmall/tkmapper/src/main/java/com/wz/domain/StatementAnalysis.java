package com.wz.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "statement_analysis")
public class StatementAnalysis {
    private String db;

    @Column(name = "full_scan")
    private String fullScan;

    @Column(name = "exec_count")
    private Long execCount;

    @Column(name = "err_count")
    private Long errCount;

    @Column(name = "warn_count")
    private Long warnCount;

    @Column(name = "rows_sent")
    private Long rowsSent;

    @Column(name = "rows_sent_avg")
    private BigDecimal rowsSentAvg;

    @Column(name = "rows_examined")
    private Long rowsExamined;

    @Column(name = "rows_examined_avg")
    private BigDecimal rowsExaminedAvg;

    @Column(name = "rows_affected")
    private Long rowsAffected;

    @Column(name = "rows_affected_avg")
    private BigDecimal rowsAffectedAvg;

    @Column(name = "tmp_tables")
    private Long tmpTables;

    @Column(name = "tmp_disk_tables")
    private Long tmpDiskTables;

    @Column(name = "rows_sorted")
    private Long rowsSorted;

    @Column(name = "sort_merge_passes")
    private Long sortMergePasses;

    private String digest;

    @Column(name = "first_seen")
    private Date firstSeen;

    @Column(name = "last_seen")
    private Date lastSeen;

    private String query;

    @Column(name = "total_latency")
    private String totalLatency;

    @Column(name = "max_latency")
    private String maxLatency;

    @Column(name = "avg_latency")
    private String avgLatency;

    @Column(name = "lock_latency")
    private String lockLatency;

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
     * @return full_scan
     */
    public String getFullScan() {
        return fullScan;
    }

    /**
     * @param fullScan
     */
    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    /**
     * @return exec_count
     */
    public Long getExecCount() {
        return execCount;
    }

    /**
     * @param execCount
     */
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    /**
     * @return err_count
     */
    public Long getErrCount() {
        return errCount;
    }

    /**
     * @param errCount
     */
    public void setErrCount(Long errCount) {
        this.errCount = errCount;
    }

    /**
     * @return warn_count
     */
    public Long getWarnCount() {
        return warnCount;
    }

    /**
     * @param warnCount
     */
    public void setWarnCount(Long warnCount) {
        this.warnCount = warnCount;
    }

    /**
     * @return rows_sent
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
     * @return rows_sent_avg
     */
    public BigDecimal getRowsSentAvg() {
        return rowsSentAvg;
    }

    /**
     * @param rowsSentAvg
     */
    public void setRowsSentAvg(BigDecimal rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }

    /**
     * @return rows_examined
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
     * @return rows_examined_avg
     */
    public BigDecimal getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    /**
     * @param rowsExaminedAvg
     */
    public void setRowsExaminedAvg(BigDecimal rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
    }

    /**
     * @return rows_affected
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
     * @return rows_affected_avg
     */
    public BigDecimal getRowsAffectedAvg() {
        return rowsAffectedAvg;
    }

    /**
     * @param rowsAffectedAvg
     */
    public void setRowsAffectedAvg(BigDecimal rowsAffectedAvg) {
        this.rowsAffectedAvg = rowsAffectedAvg;
    }

    /**
     * @return tmp_tables
     */
    public Long getTmpTables() {
        return tmpTables;
    }

    /**
     * @param tmpTables
     */
    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }

    /**
     * @return tmp_disk_tables
     */
    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    /**
     * @param tmpDiskTables
     */
    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    /**
     * @return rows_sorted
     */
    public Long getRowsSorted() {
        return rowsSorted;
    }

    /**
     * @param rowsSorted
     */
    public void setRowsSorted(Long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }

    /**
     * @return sort_merge_passes
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
     * @return digest
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
     * @return first_seen
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
     * @return last_seen
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
     * @return query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return total_latency
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * @param totalLatency
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * @return max_latency
     */
    public String getMaxLatency() {
        return maxLatency;
    }

    /**
     * @param maxLatency
     */
    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    /**
     * @return avg_latency
     */
    public String getAvgLatency() {
        return avgLatency;
    }

    /**
     * @param avgLatency
     */
    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
    }

    /**
     * @return lock_latency
     */
    public String getLockLatency() {
        return lockLatency;
    }

    /**
     * @param lockLatency
     */
    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency;
    }
}