package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$schema_table_statistics")
public class XSchemaTableStatistics {
    @Column(name = "table_schema")
    private String tableSchema;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "total_latency")
    private Long totalLatency;

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
}