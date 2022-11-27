package com.wz.domain;

import javax.persistence.*;

@Table(name = "x$schema_index_statistics")
public class XSchemaIndexStatistics {
    @Column(name = "table_schema")
    private String tableSchema;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "index_name")
    private String indexName;

    @Column(name = "rows_selected")
    private Long rowsSelected;

    @Column(name = "select_latency")
    private Long selectLatency;

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
     * @return index_name
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * @param indexName
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * @return rows_selected
     */
    public Long getRowsSelected() {
        return rowsSelected;
    }

    /**
     * @param rowsSelected
     */
    public void setRowsSelected(Long rowsSelected) {
        this.rowsSelected = rowsSelected;
    }

    /**
     * @return select_latency
     */
    public Long getSelectLatency() {
        return selectLatency;
    }

    /**
     * @param selectLatency
     */
    public void setSelectLatency(Long selectLatency) {
        this.selectLatency = selectLatency;
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
}