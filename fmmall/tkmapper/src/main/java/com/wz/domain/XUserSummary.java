package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$user_summary")
public class XUserSummary {
    private String user;

    private BigDecimal statements;

    @Column(name = "statement_latency")
    private BigDecimal statementLatency;

    @Column(name = "statement_avg_latency")
    private BigDecimal statementAvgLatency;

    @Column(name = "table_scans")
    private BigDecimal tableScans;

    @Column(name = "file_ios")
    private BigDecimal fileIos;

    @Column(name = "file_io_latency")
    private BigDecimal fileIoLatency;

    @Column(name = "current_connections")
    private BigDecimal currentConnections;

    @Column(name = "total_connections")
    private BigDecimal totalConnections;

    @Column(name = "unique_hosts")
    private Long uniqueHosts;

    @Column(name = "current_memory")
    private BigDecimal currentMemory;

    @Column(name = "total_memory_allocated")
    private BigDecimal totalMemoryAllocated;

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
     * @return statements
     */
    public BigDecimal getStatements() {
        return statements;
    }

    /**
     * @param statements
     */
    public void setStatements(BigDecimal statements) {
        this.statements = statements;
    }

    /**
     * @return statement_latency
     */
    public BigDecimal getStatementLatency() {
        return statementLatency;
    }

    /**
     * @param statementLatency
     */
    public void setStatementLatency(BigDecimal statementLatency) {
        this.statementLatency = statementLatency;
    }

    /**
     * @return statement_avg_latency
     */
    public BigDecimal getStatementAvgLatency() {
        return statementAvgLatency;
    }

    /**
     * @param statementAvgLatency
     */
    public void setStatementAvgLatency(BigDecimal statementAvgLatency) {
        this.statementAvgLatency = statementAvgLatency;
    }

    /**
     * @return table_scans
     */
    public BigDecimal getTableScans() {
        return tableScans;
    }

    /**
     * @param tableScans
     */
    public void setTableScans(BigDecimal tableScans) {
        this.tableScans = tableScans;
    }

    /**
     * @return file_ios
     */
    public BigDecimal getFileIos() {
        return fileIos;
    }

    /**
     * @param fileIos
     */
    public void setFileIos(BigDecimal fileIos) {
        this.fileIos = fileIos;
    }

    /**
     * @return file_io_latency
     */
    public BigDecimal getFileIoLatency() {
        return fileIoLatency;
    }

    /**
     * @param fileIoLatency
     */
    public void setFileIoLatency(BigDecimal fileIoLatency) {
        this.fileIoLatency = fileIoLatency;
    }

    /**
     * @return current_connections
     */
    public BigDecimal getCurrentConnections() {
        return currentConnections;
    }

    /**
     * @param currentConnections
     */
    public void setCurrentConnections(BigDecimal currentConnections) {
        this.currentConnections = currentConnections;
    }

    /**
     * @return total_connections
     */
    public BigDecimal getTotalConnections() {
        return totalConnections;
    }

    /**
     * @param totalConnections
     */
    public void setTotalConnections(BigDecimal totalConnections) {
        this.totalConnections = totalConnections;
    }

    /**
     * @return unique_hosts
     */
    public Long getUniqueHosts() {
        return uniqueHosts;
    }

    /**
     * @param uniqueHosts
     */
    public void setUniqueHosts(Long uniqueHosts) {
        this.uniqueHosts = uniqueHosts;
    }

    /**
     * @return current_memory
     */
    public BigDecimal getCurrentMemory() {
        return currentMemory;
    }

    /**
     * @param currentMemory
     */
    public void setCurrentMemory(BigDecimal currentMemory) {
        this.currentMemory = currentMemory;
    }

    /**
     * @return total_memory_allocated
     */
    public BigDecimal getTotalMemoryAllocated() {
        return totalMemoryAllocated;
    }

    /**
     * @param totalMemoryAllocated
     */
    public void setTotalMemoryAllocated(BigDecimal totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }
}