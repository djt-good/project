package com.wz.domain;

import javax.persistence.*;

@Table(name = "slave_worker_info")
public class SlaveWorkerInfo {
    /**
     * The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    @Id
    @Column(name = "Channel_name")
    private String channelName;

    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Relay_log_pos")
    private Long relayLogPos;

    @Column(name = "Master_log_pos")
    private Long masterLogPos;

    @Column(name = "Checkpoint_relay_log_pos")
    private Long checkpointRelayLogPos;

    @Column(name = "Checkpoint_master_log_pos")
    private Long checkpointMasterLogPos;

    @Column(name = "Checkpoint_seqno")
    private Integer checkpointSeqno;

    @Column(name = "Checkpoint_group_size")
    private Integer checkpointGroupSize;

    @Column(name = "Relay_log_name")
    private String relayLogName;

    @Column(name = "Master_log_name")
    private String masterLogName;

    @Column(name = "Checkpoint_relay_log_name")
    private String checkpointRelayLogName;

    @Column(name = "Checkpoint_master_log_name")
    private String checkpointMasterLogName;

    @Column(name = "Checkpoint_group_bitmap")
    private byte[] checkpointGroupBitmap;

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
     * @return Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Relay_log_pos
     */
    public Long getRelayLogPos() {
        return relayLogPos;
    }

    /**
     * @param relayLogPos
     */
    public void setRelayLogPos(Long relayLogPos) {
        this.relayLogPos = relayLogPos;
    }

    /**
     * @return Master_log_pos
     */
    public Long getMasterLogPos() {
        return masterLogPos;
    }

    /**
     * @param masterLogPos
     */
    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    /**
     * @return Checkpoint_relay_log_pos
     */
    public Long getCheckpointRelayLogPos() {
        return checkpointRelayLogPos;
    }

    /**
     * @param checkpointRelayLogPos
     */
    public void setCheckpointRelayLogPos(Long checkpointRelayLogPos) {
        this.checkpointRelayLogPos = checkpointRelayLogPos;
    }

    /**
     * @return Checkpoint_master_log_pos
     */
    public Long getCheckpointMasterLogPos() {
        return checkpointMasterLogPos;
    }

    /**
     * @param checkpointMasterLogPos
     */
    public void setCheckpointMasterLogPos(Long checkpointMasterLogPos) {
        this.checkpointMasterLogPos = checkpointMasterLogPos;
    }

    /**
     * @return Checkpoint_seqno
     */
    public Integer getCheckpointSeqno() {
        return checkpointSeqno;
    }

    /**
     * @param checkpointSeqno
     */
    public void setCheckpointSeqno(Integer checkpointSeqno) {
        this.checkpointSeqno = checkpointSeqno;
    }

    /**
     * @return Checkpoint_group_size
     */
    public Integer getCheckpointGroupSize() {
        return checkpointGroupSize;
    }

    /**
     * @param checkpointGroupSize
     */
    public void setCheckpointGroupSize(Integer checkpointGroupSize) {
        this.checkpointGroupSize = checkpointGroupSize;
    }

    /**
     * @return Relay_log_name
     */
    public String getRelayLogName() {
        return relayLogName;
    }

    /**
     * @param relayLogName
     */
    public void setRelayLogName(String relayLogName) {
        this.relayLogName = relayLogName;
    }

    /**
     * @return Master_log_name
     */
    public String getMasterLogName() {
        return masterLogName;
    }

    /**
     * @param masterLogName
     */
    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    /**
     * @return Checkpoint_relay_log_name
     */
    public String getCheckpointRelayLogName() {
        return checkpointRelayLogName;
    }

    /**
     * @param checkpointRelayLogName
     */
    public void setCheckpointRelayLogName(String checkpointRelayLogName) {
        this.checkpointRelayLogName = checkpointRelayLogName;
    }

    /**
     * @return Checkpoint_master_log_name
     */
    public String getCheckpointMasterLogName() {
        return checkpointMasterLogName;
    }

    /**
     * @param checkpointMasterLogName
     */
    public void setCheckpointMasterLogName(String checkpointMasterLogName) {
        this.checkpointMasterLogName = checkpointMasterLogName;
    }

    /**
     * @return Checkpoint_group_bitmap
     */
    public byte[] getCheckpointGroupBitmap() {
        return checkpointGroupBitmap;
    }

    /**
     * @param checkpointGroupBitmap
     */
    public void setCheckpointGroupBitmap(byte[] checkpointGroupBitmap) {
        this.checkpointGroupBitmap = checkpointGroupBitmap;
    }
}