package com.wz.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "x$statements_with_runtimes_in_95th_percentile")
public class XStatementsWithRuntimesIn95thPercentile {
    private String db;

    @Column(name = "full_scan")
    private String fullScan;

    @Column(name = "exec_count")
    private Long execCount;

    @Column(name = "err_count")
    private Long errCount;

    @Column(name = "warn_count")
    private Long warnCount;

    @Column(name = "total_latency")
    private Long totalLatency;

    @Column(name = "max_latency")
    private Long maxLatency;

    @Column(name = "avg_latency")
    private Long avgLatency;

    @Column(name = "rows_sent")
    private Long rowsSent;

    @Column(name = "rows_sent_avg")
    private BigDecimal rowsSentAvg;

    @Column(name = "rows_examined")
    private Long rowsExamined;

    @Column(name = "rows_examined_avg")
    private BigDecimal rowsExaminedAvg;

    @Column(name = "first_seen")
    private Date firstSeen;

    @Column(name = "last_seen")
    private Date lastSeen;

    private String digest;

    private String query;

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
     * @return total_latency
     */
    public Long getTotalLatency() {
        return totalLatency;
    }

    /**
     * @param totalLatency
     */
    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * @return max_latency
     */
    public Long getMaxLatency() {
        return maxLatency;
    }

    /**
     * @param maxLatency
     */
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }

    /**
     * @return avg_latency
     */
    public Long getAvgLatency() {
        return avgLatency;
    }

    /**
     * @param avgLatency
     */
    public void setAvgLatency(Long avgLatency) {
        this.avgLatency = avgLatency;
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
}