package com.wz.domain;

import javax.persistence.*;

@Table(name = "replication_applier_configuration")
public class ReplicationApplierConfiguration {
    @Id
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "DESIRED_DELAY")
    private Integer desiredDelay;

    /**
     * @return CHANNEL_NAME
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @param channelName
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * @return DESIRED_DELAY
     */
    public Integer getDesiredDelay() {
        return desiredDelay;
    }

    /**
     * @param desiredDelay
     */
    public void setDesiredDelay(Integer desiredDelay) {
        this.desiredDelay = desiredDelay;
    }
}