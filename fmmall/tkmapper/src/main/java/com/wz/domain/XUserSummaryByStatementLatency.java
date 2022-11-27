package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$user_summary_by_statement_latency")
public class XUserSummaryByStatementLatency {
    private String user;

    private BigDecimal total;

    @Column(name = "total_latency")
    private BigDecimal totalLatency;

    @Column(name = "max_latency")
    private BigDecimal maxLatency;

    @Column(name = "lock_latency")
    private BigDecimal lockLatency;

    @Column(name = "rows_sent")
    private BigDecimal rowsSent;

    @Column(name = "rows_examined")
    private BigDecimal rowsExamined;

    @Column(name = "rows_affected")
    private BigDecimal rowsAffected;

    @Column(name = "full_scans")
    private BigDecimal fullScans;

    /**
     * @return user
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
     * @return total_latency
     */
    public BigDecimal getTotalLatency() {
        return totalLatency;
    }

    /**
     * @param totalLatency
     */
    public void setTotalLatency(BigDecimal totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * @return max_latency
     */
    public BigDecimal getMaxLatency() {
        return maxLatency;
    }

    /**
     * @param maxLatency
     */
    public void setMaxLatency(BigDecimal maxLatency) {
        this.maxLatency = maxLatency;
    }

    /**
     * @return lock_latency
     */
    public BigDecimal getLockLatency() {
        return lockLatency;
    }

    /**
     * @param lockLatency
     */
    public void setLockLatency(BigDecimal lockLatency) {
        this.lockLatency = lockLatency;
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
}