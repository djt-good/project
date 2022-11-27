package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "schema_auto_increment_columns")
public class SchemaAutoIncrementColumns {
    @Column(name = "table_schema")
    private String tableSchema;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "column_name")
    private String columnName;

    @Column(name = "is_signed")
    private Integer isSigned;

    @Column(name = "is_unsigned")
    private Integer isUnsigned;

    @Column(name = "max_value")
    private Long maxValue;

    @Column(name = "auto_increment")
    private Long autoIncrement;

    @Column(name = "auto_increment_ratio")
    private BigDecimal autoIncrementRatio;

    @Column(name = "data_type")
    private String dataType;

    @Column(name = "column_type")
    private String columnType;

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
     * @return column_name
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * @return is_signed
     */
    public Integer getIsSigned() {
        return isSigned;
    }

    /**
     * @param isSigned
     */
    public void setIsSigned(Integer isSigned) {
        this.isSigned = isSigned;
    }

    /**
     * @return is_unsigned
     */
    public Integer getIsUnsigned() {
        return isUnsigned;
    }

    /**
     * @param isUnsigned
     */
    public void setIsUnsigned(Integer isUnsigned) {
        this.isUnsigned = isUnsigned;
    }

    /**
     * @return max_value
     */
    public Long getMaxValue() {
        return maxValue;
    }

    /**
     * @param maxValue
     */
    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * @return auto_increment
     */
    public Long getAutoIncrement() {
        return autoIncrement;
    }

    /**
     * @param autoIncrement
     */
    public void setAutoIncrement(Long autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    /**
     * @return auto_increment_ratio
     */
    public BigDecimal getAutoIncrementRatio() {
        return autoIncrementRatio;
    }

    /**
     * @param autoIncrementRatio
     */
    public void setAutoIncrementRatio(BigDecimal autoIncrementRatio) {
        this.autoIncrementRatio = autoIncrementRatio;
    }

    /**
     * @return data_type
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * @param dataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * @return column_type
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * @param columnType
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }
}