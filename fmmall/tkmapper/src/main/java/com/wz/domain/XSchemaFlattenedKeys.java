package com.wz.domain;

import javax.persistence.*;

@Table(name = "x$schema_flattened_keys")
public class XSchemaFlattenedKeys {
    @Column(name = "table_schema")
    private String tableSchema;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "index_name")
    private String indexName;

    @Column(name = "non_unique")
    private Integer nonUnique;

    @Column(name = "subpart_exists")
    private Long subpartExists;

    @Column(name = "index_columns")
    private String indexColumns;

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
     * @return non_unique
     */
    public Integer getNonUnique() {
        return nonUnique;
    }

    /**
     * @param nonUnique
     */
    public void setNonUnique(Integer nonUnique) {
        this.nonUnique = nonUnique;
    }

    /**
     * @return subpart_exists
     */
    public Long getSubpartExists() {
        return subpartExists;
    }

    /**
     * @param subpartExists
     */
    public void setSubpartExists(Long subpartExists) {
        this.subpartExists = subpartExists;
    }

    /**
     * @return index_columns
     */
    public String getIndexColumns() {
        return indexColumns;
    }

    /**
     * @param indexColumns
     */
    public void setIndexColumns(String indexColumns) {
        this.indexColumns = indexColumns;
    }
}