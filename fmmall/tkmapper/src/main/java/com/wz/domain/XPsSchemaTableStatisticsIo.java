package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$ps_schema_table_statistics_io")
public class XPsSchemaTableStatisticsIo {
    @Column(name = "table_schema")
    private String tableSchema;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "count_read")
    private BigDecimal countRead;

    @Column(name = "sum_number_of_bytes_read")
    private BigDecimal sumNumberOfBytesRead;

    @Column(name = "sum_timer_read")
    private BigDecimal sumTimerRead;

    @Column(name = "count_write")
    private BigDecimal countWrite;

    @Column(name = "sum_number_of_bytes_write")
    private BigDecimal sumNumberOfBytesWrite;

    @Column(name = "sum_timer_write")
    private BigDecimal sumTimerWrite;

    @Column(name = "count_misc")
    private BigDecimal countMisc;

    @Column(name = "sum_timer_misc")
    private BigDecimal sumTimerMisc;

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
     * @return count_read
     */
    public BigDecimal getCountRead() {
        return countRead;
    }

    /**
     * @param countRead
     */
    public void setCountRead(BigDecimal countRead) {
        this.countRead = countRead;
    }

    /**
     * @return sum_number_of_bytes_read
     */
    public BigDecimal getSumNumberOfBytesRead() {
        return sumNumberOfBytesRead;
    }

    /**
     * @param sumNumberOfBytesRead
     */
    public void setSumNumberOfBytesRead(BigDecimal sumNumberOfBytesRead) {
        this.sumNumberOfBytesRead = sumNumberOfBytesRead;
    }

    /**
     * @return sum_timer_read
     */
    public BigDecimal getSumTimerRead() {
        return sumTimerRead;
    }

    /**
     * @param sumTimerRead
     */
    public void setSumTimerRead(BigDecimal sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }

    /**
     * @return count_write
     */
    public BigDecimal getCountWrite() {
        return countWrite;
    }

    /**
     * @param countWrite
     */
    public void setCountWrite(BigDecimal countWrite) {
        this.countWrite = countWrite;
    }

    /**
     * @return sum_number_of_bytes_write
     */
    public BigDecimal getSumNumberOfBytesWrite() {
        return sumNumberOfBytesWrite;
    }

    /**
     * @param sumNumberOfBytesWrite
     */
    public void setSumNumberOfBytesWrite(BigDecimal sumNumberOfBytesWrite) {
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
    }

    /**
     * @return sum_timer_write
     */
    public BigDecimal getSumTimerWrite() {
        return sumTimerWrite;
    }

    /**
     * @param sumTimerWrite
     */
    public void setSumTimerWrite(BigDecimal sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }

    /**
     * @return count_misc
     */
    public BigDecimal getCountMisc() {
        return countMisc;
    }

    /**
     * @param countMisc
     */
    public void setCountMisc(BigDecimal countMisc) {
        this.countMisc = countMisc;
    }

    /**
     * @return sum_timer_misc
     */
    public BigDecimal getSumTimerMisc() {
        return sumTimerMisc;
    }

    /**
     * @param sumTimerMisc
     */
    public void setSumTimerMisc(BigDecimal sumTimerMisc) {
        this.sumTimerMisc = sumTimerMisc;
    }
}