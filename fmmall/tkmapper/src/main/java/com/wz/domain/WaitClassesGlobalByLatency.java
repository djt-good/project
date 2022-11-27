package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "wait_classes_global_by_latency")
public class WaitClassesGlobalByLatency {
    @Column(name = "event_class")
    private String eventClass;

    private BigDecimal total;

    @Column(name = "total_latency")
    private String totalLatency;

    @Column(name = "min_latency")
    private String minLatency;

    @Column(name = "avg_latency")
    private String avgLatency;

    @Column(name = "max_latency")
    private String maxLatency;

    /**
     * @return event_class
     */
    public String getEventClass() {
        return eventClass;
    }

    /**
     * @param eventClass
     */
    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    /**
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(BigDecimal total) {
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
     * @return min_latency
     */
    public String getMinLatency() {
        return minLatency;
    }

    /**
     * @param minLatency
     */
    public void setMinLatency(String minLatency) {
        this.minLatency = minLatency;
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