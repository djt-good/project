package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "schema_table_statistics_with_buffer")
public class SchemaTableStatisticsWithBuffer {
    @Column(name = "table_schema")
    private String tableSchema;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "rows_fetched")
    private Long rowsFetched;

    @Column(name = "rows_inserted")
    private Long rowsInserted;

    @Column(name = "rows_updated")
    private Long rowsUpdated;

    @Column(name = "rows_deleted")
    private Long rowsDeleted;

    @Column(name = "io_read_requests")
    private BigDecimal ioReadRequests;

    @Column(name = "io_write_requests")
    private BigDecimal ioWriteRequests;

    @Column(name = "io_misc_requests")
    private BigDecimal ioMiscRequests;

    @Column(name = "innodb_buffer_pages")
    private Long innodbBufferPages;

    @Column(name = "innodb_buffer_pages_hashed")
    private Long innodbBufferPagesHashed;

    @Column(name = "innodb_buffer_pages_old")
    private Long innodbBufferPagesOld;

    @Column(name = "innodb_buffer_rows_cached")
    private BigDecimal innodbBufferRowsCached;

    @Column(name = "fetch_latency")
    private String fetchLatency;

    @Column(name = "insert_latency")
    private String insertLatency;

    @Column(name = "update_latency")
    private String updateLatency;

    @Column(name = "delete_latency")
    private String deleteLatency;

    @Column(name = "io_read")
    private String ioRead;

    @Column(name = "io_read_latency")
    private String ioReadLatency;

    @Column(name = "io_write")
    private String ioWrite;

    @Column(name = "io_write_latency")
    private String ioWriteLatency;

    @Column(name = "io_misc_latency")
    private String ioMiscLatency;

    @Column(name = "innodb_buffer_allocated")
    private String innodbBufferAllocated;

    @Column(name = "innodb_buffer_data")
    private String innodbBufferData;

    @Column(name = "innodb_buffer_free")
    private String innodbBufferFree;

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

    /**
     * @return fetch_latency
     */
    public String getFetchLatency() {
        return fetchLatency;
    }

    /**
     * @param fetchLatency
     */
    public void setFetchLatency(String fetchLatency) {
        this.fetchLatency = fetchLatency;
    }

    /**
     * @return insert_latency
     */
    public String getInsertLatency() {
        return insertLatency;
    }

    /**
     * @param insertLatency
     */
    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency;
    }

    /**
     * @return update_latency
     */
    public String getUpdateLatency() {
        return updateLatency;
    }

    /**
     * @param updateLatency
     */
    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency;
    }

    /**
     * @return delete_latency
     */
    public String getDeleteLatency() {
        return deleteLatency;
    }

    /**
     * @param deleteLatency
     */
    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    /**
     * @return io_read
     */
    public String getIoRead() {
        return ioRead;
    }

    /**
     * @param ioRead
     */
    public void setIoRead(String ioRead) {
        this.ioRead = ioRead;
    }

    /**
     * @return io_read_latency
     */
    public String getIoReadLatency() {
        return ioReadLatency;
    }

    /**
     * @param ioReadLatency
     */
    public void setIoReadLatency(String ioReadLatency) {
        this.ioReadLatency = ioReadLatency;
    }

    /**
     * @return io_write
     */
    public String getIoWrite() {
        return ioWrite;
    }

    /**
     * @param ioWrite
     */
    public void setIoWrite(String ioWrite) {
        this.ioWrite = ioWrite;
    }

    /**
     * @return io_write_latency
     */
    public String getIoWriteLatency() {
        return ioWriteLatency;
    }

    /**
     * @param ioWriteLatency
     */
    public void setIoWriteLatency(String ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency;
    }

    /**
     * @return io_misc_latency
     */
    public String getIoMiscLatency() {
        return ioMiscLatency;
    }

    /**
     * @param ioMiscLatency
     */
    public void setIoMiscLatency(String ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency;
    }

    /**
     * @return innodb_buffer_allocated
     */
    public String getInnodbBufferAllocated() {
        return innodbBufferAllocated;
    }

    /**
     * @param innodbBufferAllocated
     */
    public void setInnodbBufferAllocated(String innodbBufferAllocated) {
        this.innodbBufferAllocated = innodbBufferAllocated;
    }

    /**
     * @return innodb_buffer_data
     */
    public String getInnodbBufferData() {
        return innodbBufferData;
    }

    /**
     * @param innodbBufferData
     */
    public void setInnodbBufferData(String innodbBufferData) {
        this.innodbBufferData = innodbBufferData;
    }

    /**
     * @return innodb_buffer_free
     */
    public String getInnodbBufferFree() {
        return innodbBufferFree;
    }

    /**
     * @param innodbBufferFree
     */
    public void setInnodbBufferFree(String innodbBufferFree) {
        this.innodbBufferFree = innodbBufferFree;
    }
}