package com.wz.domain;

import javax.persistence.*;

@Table(name = "schema_redundant_indexes")
public class SchemaRedundantIndexes {
    @Column(name = "table_schema")
    private String tableSchema;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "redundant_index_name")
    private String redundantIndexName;

    @Column(name = "redundant_index_non_unique")
    private Integer redundantIndexNonUnique;

    @Column(name = "dominant_index_name")
    private String dominantIndexName;

    @Column(name = "dominant_index_non_unique")
    private Integer dominantIndexNonUnique;

    @Column(name = "subpart_exists")
    private Integer subpartExists;

    @Column(name = "sql_drop_index")
    private String sqlDropIndex;

    @Column(name = "redundant_index_columns")
    private String redundantIndexColumns;

    @Column(name = "dominant_index_columns")
    private String dominantIndexColumns;

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
     * @return redundant_index_name
     */
    public String getRedundantIndexName() {
        return redundantIndexName;
    }

    /**
     * @param redundantIndexName
     */
    public void setRedundantIndexName(String redundantIndexName) {
        this.redundantIndexName = redundantIndexName;
    }

    /**
     * @return redundant_index_non_unique
     */
    public Integer getRedundantIndexNonUnique() {
        return redundantIndexNonUnique;
    }

    /**
     * @param redundantIndexNonUnique
     */
    public void setRedundantIndexNonUnique(Integer redundantIndexNonUnique) {
        this.redundantIndexNonUnique = redundantIndexNonUnique;
    }

    /**
     * @return dominant_index_name
     */
    public String getDominantIndexName() {
        return dominantIndexName;
    }

    /**
     * @param dominantIndexName
     */
    public void setDominantIndexName(String dominantIndexName) {
        this.dominantIndexName = dominantIndexName;
    }

    /**
     * @return dominant_index_non_unique
     */
    public Integer getDominantIndexNonUnique() {
        return dominantIndexNonUnique;
    }

    /**
     * @param dominantIndexNonUnique
     */
    public void setDominantIndexNonUnique(Integer dominantIndexNonUnique) {
        this.dominantIndexNonUnique = dominantIndexNonUnique;
    }

    /**
     * @return subpart_exists
     */
    public Integer getSubpartExists() {
        return subpartExists;
    }

    /**
     * @param subpartExists
     */
    public void setSubpartExists(Integer subpartExists) {
        this.subpartExists = subpartExists;
    }

    /**
     * @return sql_drop_index
     */
    public String getSqlDropIndex() {
        return sqlDropIndex;
    }

    /**
     * @param sqlDropIndex
     */
    public void setSqlDropIndex(String sqlDropIndex) {
        this.sqlDropIndex = sqlDropIndex;
    }

    /**
     * @return redundant_index_columns
     */
    public String getRedundantIndexColumns() {
        return redundantIndexColumns;
    }

    /**
     * @param redundantIndexColumns
     */
    public void setRedundantIndexColumns(String redundantIndexColumns) {
        this.redundantIndexColumns = redundantIndexColumns;
    }

    /**
     * @return dominant_index_columns
     */
    public String getDominantIndexColumns() {
        return dominantIndexColumns;
    }

    /**
     * @param dominantIndexColumns
     */
    public void setDominantIndexColumns(String dominantIndexColumns) {
        this.dominantIndexColumns = dominantIndexColumns;
    }
}