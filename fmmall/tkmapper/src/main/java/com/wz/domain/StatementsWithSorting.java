package com.wz.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "statements_with_sorting")
public class StatementsWithSorting {
    private String db;

    @Column(name = "exec_count")
    private Long execCount;

    @Column(name = "sort_merge_passes")
    private Long sortMergePasses;

    @Column(name = "avg_sort_merges")
    private BigDecimal avgSortMerges;

    @Column(name = "sorts_using_scans")
    private Long sortsUsingScans;

    @Column(name = "sort_using_range")
    private Long sortUsingRange;

    @Column(name = "rows_sorted")
    private Long rowsSorted;

    @Column(name = "avg_rows_sorted")
    private BigDecimal avgRowsSorted;

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
     * @return avg_sort_merges
     */
    public BigDecimal getAvgSortMerges() {
        return avgSortMerges;
    }

    /**
     * @param avgSortMerges
     */
    public void setAvgSortMerges(BigDecimal avgSortMerges) {
        this.avgSortMerges = avgSortMerges;
    }

    /**
     * @return sorts_using_scans
     */
    public Long getSortsUsingScans() {
        return sortsUsingScans;
    }

    /**
     * @param sortsUsingScans
     */
    public void setSortsUsingScans(Long sortsUsingScans) {
        this.sortsUsingScans = sortsUsingScans;
    }

    /**
     * @return sort_using_range
     */
    public Long getSortUsingRange() {
        return sortUsingRange;
    }

    /**
     * @param sortUsingRange
     */
    public void setSortUsingRange(Long sortUsingRange) {
        this.sortUsingRange = sortUsingRange;
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
     * @return avg_rows_sorted
     */
    public BigDecimal getAvgRowsSorted() {
        return avgRowsSorted;
    }

    /**
     * @param avgRowsSorted
     */
    public void setAvgRowsSorted(BigDecimal avgRowsSorted) {
        this.avgRowsSorted = avgRowsSorted;
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