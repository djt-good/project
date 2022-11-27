package com.wz.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "x$statements_with_temp_tables")
public class XStatementsWithTempTables {
    private String db;

    @Column(name = "exec_count")
    private Long execCount;

    @Column(name = "total_latency")
    private Long totalLatency;

    @Column(name = "memory_tmp_tables")
    private Long memoryTmpTables;

    @Column(name = "disk_tmp_tables")
    private Long diskTmpTables;

    @Column(name = "avg_tmp_tables_per_query")
    private BigDecimal avgTmpTablesPerQuery;

    @Column(name = "tmp_tables_to_disk_pct")
    private BigDecimal tmpTablesToDiskPct;

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
     * @return memory_tmp_tables
     */
    public Long getMemoryTmpTables() {
        return memoryTmpTables;
    }

    /**
     * @param memoryTmpTables
     */
    public void setMemoryTmpTables(Long memoryTmpTables) {
        this.memoryTmpTables = memoryTmpTables;
    }

    /**
     * @return disk_tmp_tables
     */
    public Long getDiskTmpTables() {
        return diskTmpTables;
    }

    /**
     * @param diskTmpTables
     */
    public void setDiskTmpTables(Long diskTmpTables) {
        this.diskTmpTables = diskTmpTables;
    }

    /**
     * @return avg_tmp_tables_per_query
     */
    public BigDecimal getAvgTmpTablesPerQuery() {
        return avgTmpTablesPerQuery;
    }

    /**
     * @param avgTmpTablesPerQuery
     */
    public void setAvgTmpTablesPerQuery(BigDecimal avgTmpTablesPerQuery) {
        this.avgTmpTablesPerQuery = avgTmpTablesPerQuery;
    }

    /**
     * @return tmp_tables_to_disk_pct
     */
    public BigDecimal getTmpTablesToDiskPct() {
        return tmpTablesToDiskPct;
    }

    /**
     * @param tmpTablesToDiskPct
     */
    public void setTmpTablesToDiskPct(BigDecimal tmpTablesToDiskPct) {
        this.tmpTablesToDiskPct = tmpTablesToDiskPct;
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