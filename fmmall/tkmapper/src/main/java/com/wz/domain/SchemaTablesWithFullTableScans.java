package com.wz.domain;

import javax.persistence.*;

@Table(name = "schema_tables_with_full_table_scans")
public class SchemaTablesWithFullTableScans {
    @Column(name = "object_schema")
    private String objectSchema;

    @Column(name = "object_name")
    private String objectName;

    @Column(name = "rows_full_scanned")
    private Long rowsFullScanned;

    private String latency;

    /**
     * @return object_schema
     */
    public String getObjectSchema() {
        return objectSchema;
    }

    /**
     * @param objectSchema
     */
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    /**
     * @return object_name
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * @return rows_full_scanned
     */
    public Long getRowsFullScanned() {
        return rowsFullScanned;
    }

    /**
     * @param rowsFullScanned
     */
    public void setRowsFullScanned(Long rowsFullScanned) {
        this.rowsFullScanned = rowsFullScanned;
    }

    /**
     * @return latency
     */
    public String getLatency() {
        return latency;
    }

    /**
     * @param latency
     */
    public void setLatency(String latency) {
        this.latency = latency;
    }
}