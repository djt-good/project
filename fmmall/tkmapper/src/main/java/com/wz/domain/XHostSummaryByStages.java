package com.wz.domain;

import javax.persistence.*;

@Table(name = "x$host_summary_by_stages")
public class XHostSummaryByStages {
    private String host;

    @Column(name = "event_name")
    private String eventName;

    private Long total;

    @Column(name = "total_latency")
    private Long totalLatency;

    @Column(name = "avg_latency")
    private Long avgLatency;

    /**
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
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
     * @return total_latency
     */
    public Long getTotalLatency() {
        return totalLatency;
    }

    /**
     * @param totalLatency
     */
    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * @return avg_latency
     */
    public Long getAvgLatency() {
        return avgLatency;
    }

    /**
     * @param avgLatency
     */
    public void setAvgLatency(Long avgLatency) {
        this.avgLatency = avgLatency;
    }
}