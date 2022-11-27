package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "replication_applier_filters")
public class ReplicationApplierFilters {
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "FILTER_NAME")
    private String filterName;

    @Column(name = "CONFIGURED_BY")
    private String configuredBy;

    @Column(name = "ACTIVE_SINCE")
    private Date activeSince;

    @Column(name = "COUNTER")
    private Long counter;

    @Column(name = "FILTER_RULE")
    private String filterRule;

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
     * @return FILTER_NAME
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * @param filterName
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * @return CONFIGURED_BY
     */
    public String getConfiguredBy() {
        return configuredBy;
    }

    /**
     * @param configuredBy
     */
    public void setConfiguredBy(String configuredBy) {
        this.configuredBy = configuredBy;
    }

    /**
     * @return ACTIVE_SINCE
     */
    public Date getActiveSince() {
        return activeSince;
    }

    /**
     * @param activeSince
     */
    public void setActiveSince(Date activeSince) {
        this.activeSince = activeSince;
    }

    /**
     * @return COUNTER
     */
    public Long getCounter() {
        return counter;
    }

    /**
     * @param counter
     */
    public void setCounter(Long counter) {
        this.counter = counter;
    }

    /**
     * @return FILTER_RULE
     */
    public String getFilterRule() {
        return filterRule;
    }

    /**
     * @param filterRule
     */
    public void setFilterRule(String filterRule) {
        this.filterRule = filterRule;
    }
}