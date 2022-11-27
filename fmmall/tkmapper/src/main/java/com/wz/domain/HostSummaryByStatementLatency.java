package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "host_summary_by_statement_latency")
public class HostSummaryByStatementLatency {
    private String host;

    private BigDecimal total;

    @Column(name = "rows_sent")
    private BigDecimal rowsSent;

    @Column(name = "rows_examined")
    private BigDecimal rowsExamined;

    @Column(name = "rows_affected")
    private BigDecimal rowsAffected;

    @Column(name = "full_scans")
    private BigDecimal fullScans;

    @Column(name = "total_latency")
    private String totalLatency;

    @Column(name = "max_latency")
    private String maxLatency;

    @Column(name = "lock_latency")
    private String lockLatency;

    /**
     * @return host
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
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * @return rows_sent
     */
    public BigDecimal getRowsSent() {
        return rowsSent;
    }

    /**
     * @param rowsSent
     */
    public void setRowsSent(BigDecimal rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * @return rows_examined
     */
    public BigDecimal getRowsExamined() {
        return rowsExamined;
    }

    /**
     * @param rowsExamined
     */
    public void setRowsExamined(BigDecimal rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * @return rows_affected
     */
    public BigDecimal getRowsAffected() {
        return rowsAffected;
    }

    /**
     * @param rowsAffected
     */
    public void setRowsAffected(BigDecimal rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    /**
     * @return full_scans
     */
    public BigDecimal getFullScans() {
        return fullScans;
    }

    /**
     * @param fullScans
     */
    public void setFullScans(BigDecimal fullScans) {
        this.fullScans = fullScans;
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