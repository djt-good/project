package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$wait_classes_global_by_avg_latency")
public class XWaitClassesGlobalByAvgLatency {
    @Column(name = "event_class")
    private String eventClass;

    private BigDecimal total;

    @Column(name = "total_latency")
    private BigDecimal totalLatency;

    @Column(name = "min_latency")
    private Long minLatency;

    @Column(name = "avg_latency")
    private BigDecimal avgLatency;

    @Column(name = "max_latency")
    private Long maxLatency;

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
    public BigDecimal getTotalLatency() {
        return totalLatency;
    }

    /**
     * @param totalLatency
     */
    public void setTotalLatency(BigDecimal totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * @return min_latency
     */
    public Long getMinLatency() {
        return minLatency;
    }

    /**
     * @param minLatency
     */
    public void setMinLatency(Long minLatency) {
        this.minLatency = minLatency;
    }

    /**
     * @return avg_latency
     */
    public BigDecimal getAvgLatency() {
        return avgLatency;
    }

    /**
     * @param avgLatency
     */
    public void setAvgLatency(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
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