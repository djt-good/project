package com.wz.domain;

import javax.persistence.*;

@Table(name = "waits_by_user_by_latency")
public class WaitsByUserByLatency {
    private String user;

    private String event;

    private Long total;

    @Column(name = "total_latency")
    private String totalLatency;

    @Column(name = "avg_latency")
    private String avgLatency;

    @Column(name = "max_latency")
    private String maxLatency;

    /**
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return event;
    }

    /**
     * @param event
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * @return total_latency
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * @param totalLatency
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * @return avg_latency
     */
    public String getAvgLatency() {
        return avgLatency;
    }

    /**
     * @param avgLatency
     */
    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
    }

    /**
     * @return max_latency
     */
    public String getMaxLatency() {
        return maxLatency;
    }

    /**
     * @param maxLatency
     */
    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }
}