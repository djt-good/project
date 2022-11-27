package com.wz.domain;

import javax.persistence.*;

@Table(name = "replication_applier_status")
public class ReplicationApplierStatus {
    @Id
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "SERVICE_STATE")
    private String serviceState;

    @Column(name = "REMAINING_DELAY")
    private Integer remainingDelay;

    @Column(name = "COUNT_TRANSACTIONS_RETRIES")
    private Long countTransactionsRetries;

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
     * @return SERVICE_STATE
     */
    public String getServiceState() {
        return serviceState;
    }

    /**
     * @param serviceState
     */
    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    /**
     * @return REMAINING_DELAY
     */
    public Integer getRemainingDelay() {
        return remainingDelay;
    }

    /**
     * @param remainingDelay
     */
    public void setRemainingDelay(Integer remainingDelay) {
        this.remainingDelay = remainingDelay;
    }

    /**
     * @return COUNT_TRANSACTIONS_RETRIES
     */
    public Long getCountTransactionsRetries() {
        return countTransactionsRetries;
    }

    /**
     * @param countTransactionsRetries
     */
    public void setCountTransactionsRetries(Long countTransactionsRetries) {
        this.countTransactionsRetries = countTransactionsRetries;
    }
}