package com.wz.domain;

import javax.persistence.*;

@Table(name = "user_summary_by_file_io_type")
public class UserSummaryByFileIoType {
    private String user;

    @Column(name = "event_name")
    private String eventName;

    private Long total;

    private String latency;

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
     * @return event_name
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
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
     * @return latency
     */
    public String getLatency() {
        return latency;
    }

    /**
     * @param latency
     */
    public void setLatency(String latency) {
        this.latency = latency;
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