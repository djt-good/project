package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$schema_table_statistics_with_buffer")
public class XSchemaTableStatisticsWithBuffer {
    @Column(name = "table_schema")
    private String tableSchema;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "rows_fetched")
    private Long rowsFetched;

    @Column(name = "fetch_latency")
    private Long fetchLatency;

    @Column(name = "rows_inserted")
    private Long rowsInserted;

    @Column(name = "insert_latency")
    private Long insertLatency;

    @Column(name = "rows_updated")
    private Long rowsUpdated;

    @Column(name = "update_latency")
    private Long updateLatency;

    @Column(name = "rows_deleted")
    private Long rowsDeleted;

    @Column(name = "delete_latency")
    private Long deleteLatency;

    @Column(name = "io_read_requests")
    private BigDecimal ioReadRequests;

    @Column(name = "io_read")
    private BigDecimal ioRead;

    @Column(name = "io_read_latency")
    private BigDecimal ioReadLatency;

    @Column(name = "io_write_requests")
    private BigDecimal ioWriteRequests;

    @Column(name = "io_write")
    private BigDecimal ioWrite;

    @Column(name = "io_write_latency")
    private BigDecimal ioWriteLatency;

    @Column(name = "io_misc_requests")
    private BigDecimal ioMiscRequests;

    @Column(name = "io_misc_latency")
    private BigDecimal ioMiscLatency;

    @Column(name = "innodb_buffer_allocated")
    private BigDecimal innodbBufferAllocated;

    @Column(name = "innodb_buffer_data")
    private BigDecimal innodbBufferData;

    @Column(name = "innodb_buffer_free")
    private BigDecimal innodbBufferFree;

    @Column(name = "innodb_buffer_pages")
    private Long innodbBufferPages;

    @Column(name = "innodb_buffer_pages_hashed")
    private Long innodbBufferPagesHashed;

    @Column(name = "innodb_buffer_pages_old")
    private Long innodbBufferPagesOld;

    @Column(name = "innodb_buffer_rows_cached")
    private BigDecimal innodbBufferRowsCached;

    /**
     * @return table_schema
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * @param tableSchema
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * @return table_name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return rows_fetched
     */
    public Long getRowsFetched() {
        return rowsFetched;
    }

    /**
     * @param rowsFetched
     */
    public void setRowsFetched(Long rowsFetched) {
        this.rowsFetched = rowsFetched;
    }

    /**
     * @return fetch_latency
     */
    public Long getFetchLatency() {
        return fetchLatency;
    }

    /**
     * @param fetchLatency
     */
    public void setFetchLatency(Long fetchLatency) {
        this.fetchLatency = fetchLatency;
    }

    /**
     * @return rows_inserted
     */
    public Long getRowsInserted() {
        return rowsInserted;
    }

    /**
     * @param rowsInserted
     */
    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    /**
     * @return insert_latency
     */
    public Long getInsertLatency() {
        return insertLatency;
    }

    /**
     * @param insertLatency
     */
    public void setInsertLatency(Long insertLatency) {
        this.insertLatency = insertLatency;
    }

    /**
     * @return rows_updated
     */
    public Long getRowsUpdated() {
        return rowsUpdated;
    }

    /**
     * @param rowsUpdated
     */
    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    /**
     * @return update_latency
     */
    public Long getUpdateLatency() {
        return updateLatency;
    }

    /**
     * @param updateLatency
     */
    public void setUpdateLatency(Long updateLatency) {
        this.updateLatency = updateLatency;
    }

    /**
     * @return rows_deleted
     */
    public Long getRowsDeleted() {
        return rowsDeleted;
    }

    /**
     * @param rowsDeleted
     */
    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    /**
     * @return delete_latency
     */
    public Long getDeleteLatency() {
        return deleteLatency;
    }

    /**
     * @param deleteLatency
     */
    public void setDeleteLatency(Long deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    /**
     * @return io_read_requests
     */
    public BigDecimal getIoReadRequests() {
        return ioReadRequests;
    }

    /**
     * @param ioReadRequests
     */
    public void setIoReadRequests(BigDecimal ioReadRequests) {
        this.ioReadRequests = ioReadRequests;
    }

    /**
     * @return io_read
     */
    public BigDecimal getIoRead() {
        return ioRead;
    }

    /**
     * @param ioRead
     */
    public void setIoRead(BigDecimal ioRead) {
        this.ioRead = ioRead;
    }

    /**
     * @return io_read_latency
     */
    public BigDecimal getIoReadLatency() {
        return ioReadLatency;
    }

    /**
     * @param ioReadLatency
     */
    public void setIoReadLatency(BigDecimal ioReadLatency) {
        this.ioReadLatency = ioReadLatency;
    }

    /**
     * @return io_write_requests
     */
    public BigDecimal getIoWriteRequests() {
        return ioWriteRequests;
    }

    /**
     * @param ioWriteRequests
     */
    public void setIoWriteRequests(BigDecimal ioWriteRequests) {
        this.ioWriteRequests = ioWriteRequests;
    }

    /**
     * @return io_write
     */
    public BigDecimal getIoWrite() {
        return ioWrite;
    }

    /**
     * @param ioWrite
     */
    public void setIoWrite(BigDecimal ioWrite) {
        this.ioWrite = ioWrite;
    }

    /**
     * @return io_write_latency
     */
    public BigDecimal getIoWriteLatency() {
        return ioWriteLatency;
    }

    /**
     * @param ioWriteLatency
     */
    public void setIoWriteLatency(BigDecimal ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency;
    }

    /**
     * @return io_misc_requests
     */
    public BigDecimal getIoMiscRequests() {
        return ioMiscRequests;
    }

    /**
     * @param ioMiscRequests
     */
    public void setIoMiscRequests(BigDecimal ioMiscRequests) {
        this.ioMiscRequests = ioMiscRequests;
    }

    /**
     * @return io_misc_latency
     */
    public BigDecimal getIoMiscLatency() {
        return ioMiscLatency;
    }

    /**
     * @param ioMiscLatency
     */
    public void setIoMiscLatency(BigDecimal ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency;
    }

    /**
     * @return innodb_buffer_allocated
     */
    public BigDecimal getInnodbBufferAllocated() {
        return innodbBufferAllocated;
    }

    /**
     * @param innodbBufferAllocated
     */
    public void setInnodbBufferAllocated(BigDecimal innodbBufferAllocated) {
        this.innodbBufferAllocated = innodbBufferAllocated;
    }

    /**
     * @return innodb_buffer_data
     */
    public BigDecimal getInnodbBufferData() {
        return innodbBufferData;
    }

    /**
     * @param innodbBufferData
     */
    public void setInnodbBufferData(BigDecimal innodbBufferData) {
        this.innodbBufferData = innodbBufferData;
    }

    /**
     * @return innodb_buffer_free
     */
    public BigDecimal getInnodbBufferFree() {
        return innodbBufferFree;
    }

    /**
     * @param innodbBufferFree
     */
    public void setInnodbBufferFree(BigDecimal innodbBufferFree) {
        this.innodbBufferFree = innodbBufferFree;
    }

    /**
     * @return innodb_buffer_pages
     */
    public Long getInnodbBufferPages() {
        return innodbBufferPages;
    }

    /**
     * @param innodbBufferPages
     */
    public void setInnodbBufferPages(Long innodbBufferPages) {
        this.innodbBufferPages = innodbBufferPages;
    }

    /**
     * @return innodb_buffer_pages_hashed
     */
    public Long getInnodbBufferPagesHashed() {
        return innodbBufferPagesHashed;
    }

    /**
     * @param innodbBufferPagesHashed
     */
    public void setInnodbBufferPagesHashed(Long innodbBufferPagesHashed) {
        this.innodbBufferPagesHashed = innodbBufferPagesHashed;
    }

    /**
     * @return innodb_buffer_pages_old
     */
    public Long getInnodbBufferPagesOld() {
        return innodbBufferPagesOld;
    }

    /**
     * @param innodbBufferPagesOld
     */
    public void setInnodbBufferPagesOld(Long innodbBufferPagesOld) {
        this.innodbBufferPagesOld = innodbBufferPagesOld;
    }

    /**
     * @return innodb_buffer_rows_cached
     */
    public BigDecimal getInnodbBufferRowsCached() {
        return innodbBufferRowsCached;
    }

    /**
     * @param innodbBufferRowsCached
     */
    public void setInnodbBufferRowsCached(BigDecimal innodbBufferRowsCached) {
        this.innodbBufferRowsCached = innodbBufferRowsCached;
    }
}