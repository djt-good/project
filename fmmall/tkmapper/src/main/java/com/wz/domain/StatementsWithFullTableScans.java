package com.wz.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "statements_with_full_table_scans")
public class StatementsWithFullTableScans {
    private String db;

    @Column(name = "exec_count")
    private Long execCount;

    @Column(name = "no_index_used_count")
    private Long noIndexUsedCount;

    @Column(name = "no_good_index_used_count")
    private Long noGoodIndexUsedCount;

    @Column(name = "no_index_used_pct")
    private BigDecimal noIndexUsedPct;

    @Column(name = "rows_sent")
    private Long rowsSent;

    @Column(name = "rows_examined")
    private Long rowsExamined;

    @Column(name = "rows_sent_avg")
    private BigDecimal rowsSentAvg;

    @Column(name = "rows_examined_avg")
    private BigDecimal rowsExaminedAvg;

    @Column(name = "first_seen")
    private Date firstSeen;

    @Column(name = "last_seen")
    private Date lastSeen;

    private String digest;

    private String query;

    @Column(name = "total_latency")
    private String totalLatency;

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
     * @return no_index_used_count
     */
    public Long getNoIndexUsedCount() {
        return noIndexUsedCount;
    }

    /**
     * @param noIndexUsedCount
     */
    public void setNoIndexUsedCount(Long noIndexUsedCount) {
        this.noIndexUsedCount = noIndexUsedCount;
    }

    /**
     * @return no_good_index_used_count
     */
    public Long getNoGoodIndexUsedCount() {
        return noGoodIndexUsedCount;
    }

    /**
     * @param noGoodIndexUsedCount
     */
    public void setNoGoodIndexUsedCount(Long noGoodIndexUsedCount) {
        this.noGoodIndexUsedCount = noGoodIndexUsedCount;
    }

    /**
     * @return no_index_used_pct
     */
    public BigDecimal getNoIndexUsedPct() {
        return noIndexUsedPct;
    }

    /**
     * @param noIndexUsedPct
     */
    public void setNoIndexUsedPct(BigDecimal noIndexUsedPct) {
        this.noIndexUsedPct = noIndexUsedPct;
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
}