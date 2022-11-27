package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "innodb_index_stats")
public class InnodbIndexStats {
    @Id
    @Column(name = "database_name")
    private String databaseName;

    @Id
    @Column(name = "table_name")
    private String tableName;

    @Id
    @Column(name = "index_name")
    private String indexName;

    @Id
    @Column(name = "stat_name")
    private String statName;

    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "stat_value")
    private Long statValue;

    @Column(name = "sample_size")
    private Long sampleSize;

    @Column(name = "stat_description")
    private String statDescription;

    /**
     * @return database_name
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * @param databaseName
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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
     * @return stat_name
     */
    public String getStatName() {
        return statName;
    }

    /**
     * @param statName
     */
    public void setStatName(String statName) {
        this.statName = statName;
    }

    /**
     * @return last_update
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * @param lastUpdate
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * @return stat_value
     */
    public Long getStatValue() {
        return statValue;
    }

    /**
     * @param statValue
     */
    public void setStatValue(Long statValue) {
        this.statValue = statValue;
    }

    /**
     * @return sample_size
     */
    public Long getSampleSize() {
        return sampleSize;
    }

    /**
     * @param sampleSize
     */
    public void setSampleSize(Long sampleSize) {
        this.sampleSize = sampleSize;
    }

    /**
     * @return stat_description
     */
    public String getStatDescription() {
        return statDescription;
    }

    /**
     * @param statDescription
     */
    public void setStatDescription(String statDescription) {
        this.statDescription = statDescription;
    }
}