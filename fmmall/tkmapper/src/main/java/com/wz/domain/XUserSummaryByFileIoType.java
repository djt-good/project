package com.wz.domain;

import javax.persistence.*;

@Table(name = "x$user_summary_by_file_io_type")
public class XUserSummaryByFileIoType {
    private String user;

    @Column(name = "event_name")
    private String eventName;

    private Long total;

    private Long latency;

    @Column(name = "max_latency")
    private Long maxLatency;

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
    public Long getLatency() {
        return latency;
    }

    /**
     * @param latency
     */
    public void setLatency(Long latency) {
        this.latency = latency;
    }

    /**
     * @return max_latency
     */
    public Long getMaxLatency() {
        return maxLatency;
    }

    /**
     * @param maxLatency
     */
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }
}