package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "schema_table_statistics")
public class SchemaTableStatistics {
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

    @Column(name = "total_latency")
    private String totalLatency;

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
}