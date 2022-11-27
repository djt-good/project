package com.wz.domain;

import javax.persistence.*;

@Table(name = "slave_relay_log_info")
public class SlaveRelayLogInfo {
    /**
     * The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    @Id
    @Column(name = "Channel_name")
    private String channelName;

    /**
     * Number of lines in the file or rows in the table. Used to version table definitions.
     */
    @Column(name = "Number_of_lines")
    private Integer numberOfLines;

    /**
     * The relay log position of the last executed event.
     */
    @Column(name = "Relay_log_pos")
    private Long relayLogPos;

    /**
     * The master log position of the last executed event.
     */
    @Column(name = "Master_log_pos")
    private Long masterLogPos;

    /**
     * The number of seconds that the slave must lag behind the master.
     */
    @Column(name = "Sql_delay")
    private Integer sqlDelay;

    @Column(name = "Number_of_workers")
    private Integer numberOfWorkers;

    /**
     * Internal Id that uniquely identifies this record.
     */
    @Column(name = "Id")
    private Integer id;

    /**
     * The name of the current relay log file.
     */
    @Column(name = "Relay_log_name")
    private String relayLogName;

    /**
     * The name of the master binary log file from which the events in the relay log file were read.
     */
    @Column(name = "Master_log_name")
    private String masterLogName;

    /**
     * 获取The channel on which the slave is connected to a source. Used in Multisource Replication
     *
     * @return Channel_name - The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * 设置The channel on which the slave is connected to a source. Used in Multisource Replication
     *
     * @param channelName The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * 获取Number of lines in the file or rows in the table. Used to version table definitions.
     *
     * @return Number_of_lines - Number of lines in the file or rows in the table. Used to version table definitions.
     */
    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    /**
     * 设置Number of lines in the file or rows in the table. Used to version table definitions.
     *
     * @param numberOfLines Number of lines in the file or rows in the table. Used to version table definitions.
     */
    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    /**
     * 获取The relay log position of the last executed event.
     *
     * @return Relay_log_pos - The relay log position of the last executed event.
     */
    public Long getRelayLogPos() {
        return relayLogPos;
    }

    /**
     * 设置The relay log position of the last executed event.
     *
     * @param relayLogPos The relay log position of the last executed event.
     */
    public void setRelayLogPos(Long relayLogPos) {
        this.relayLogPos = relayLogPos;
    }

    /**
     * 获取The master log position of the last executed event.
     *
     * @return Master_log_pos - The master log position of the last executed event.
     */
    public Long getMasterLogPos() {
        return masterLogPos;
    }

    /**
     * 设置The master log position of the last executed event.
     *
     * @param masterLogPos The master log position of the last executed event.
     */
    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    /**
     * 获取The number of seconds that the slave must lag behind the master.
     *
     * @return Sql_delay - The number of seconds that the slave must lag behind the master.
     */
    public Integer getSqlDelay() {
        return sqlDelay;
    }

    /**
     * 设置The number of seconds that the slave must lag behind the master.
     *
     * @param sqlDelay The number of seconds that the slave must lag behind the master.
     */
    public void setSqlDelay(Integer sqlDelay) {
        this.sqlDelay = sqlDelay;
    }

    /**
     * @return Number_of_workers
     */
    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    /**
     * @param numberOfWorkers
     */
    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * 获取Internal Id that uniquely identifies this record.
     *
     * @return Id - Internal Id that uniquely identifies this record.
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置Internal Id that uniquely identifies this record.
     *
     * @param id Internal Id that uniquely identifies this record.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取The name of the current relay log file.
     *
     * @return Relay_log_name - The name of the current relay log file.
     */
    public String getRelayLogName() {
        return relayLogName;
    }

    /**
     * 设置The name of the current relay log file.
     *
     * @param relayLogName The name of the current relay log file.
     */
    public void setRelayLogName(String relayLogName) {
        this.relayLogName = relayLogName;
    }

    /**
     * 获取The name of the master binary log file from which the events in the relay log file were read.
     *
     * @return Master_log_name - The name of the master binary log file from which the events in the relay log file were read.
     */
    public String getMasterLogName() {
        return masterLogName;
    }

    /**
     * 设置The name of the master binary log file from which the events in the relay log file were read.
     *
     * @param masterLogName The name of the master binary log file from which the events in the relay log file were read.
     */
    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }
}