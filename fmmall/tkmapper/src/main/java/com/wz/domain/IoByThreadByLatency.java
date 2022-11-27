package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "io_by_thread_by_latency")
public class IoByThreadByLatency {
    private String user;

    private BigDecimal total;

    @Column(name = "thread_id")
    private Long threadId;

    @Column(name = "processlist_id")
    private Long processlistId;

    @Column(name = "total_latency")
    private String totalLatency;

    @Column(name = "min_latency")
    private String minLatency;

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
     * @return thread_id
     */
    public Long getThreadId() {
        return threadId;
    }

    /**
     * @param threadId
     */
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /**
     * @return processlist_id
     */
    public Long getProcesslistId() {
        return processlistId;
    }

    /**
     * @param processlistId
     */
    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
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