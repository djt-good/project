package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "host_summary")
public class HostSummary {
    private String host;

    private BigDecimal statements;

    @Column(name = "table_scans")
    private BigDecimal tableScans;

    @Column(name = "file_ios")
    private BigDecimal fileIos;

    @Column(name = "current_connections")
    private BigDecimal currentConnections;

    @Column(name = "total_connections")
    private BigDecimal totalConnections;

    @Column(name = "unique_users")
    private Long uniqueUsers;

    @Column(name = "statement_latency")
    private String statementLatency;

    @Column(name = "statement_avg_latency")
    private String statementAvgLatency;

    @Column(name = "file_io_latency")
    private String fileIoLatency;

    @Column(name = "current_memory")
    private String currentMemory;

    @Column(name = "total_memory_allocated")
    private String totalMemoryAllocated;

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
     * @return unique_users
     */
    public Long getUniqueUsers() {
        return uniqueUsers;
    }

    /**
     * @param uniqueUsers
     */
    public void setUniqueUsers(Long uniqueUsers) {
        this.uniqueUsers = uniqueUsers;
    }

    /**
     * @return statement_latency
     */
    public String getStatementLatency() {
        return statementLatency;
    }

    /**
     * @param statementLatency
     */
    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency;
    }

    /**
     * @return statement_avg_latency
     */
    public String getStatementAvgLatency() {
        return statementAvgLatency;
    }

    /**
     * @param statementAvgLatency
     */
    public void setStatementAvgLatency(String statementAvgLatency) {
        this.statementAvgLatency = statementAvgLatency;
    }

    /**
     * @return file_io_latency
     */
    public String getFileIoLatency() {
        return fileIoLatency;
    }

    /**
     * @param fileIoLatency
     */
    public void setFileIoLatency(String fileIoLatency) {
        this.fileIoLatency = fileIoLatency;
    }

    /**
     * @return current_memory
     */
    public String getCurrentMemory() {
        return currentMemory;
    }

    /**
     * @param currentMemory
     */
    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory;
    }

    /**
     * @return total_memory_allocated
     */
    public String getTotalMemoryAllocated() {
        return totalMemoryAllocated;
    }

    /**
     * @param totalMemoryAllocated
     */
    public void setTotalMemoryAllocated(String totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }
}