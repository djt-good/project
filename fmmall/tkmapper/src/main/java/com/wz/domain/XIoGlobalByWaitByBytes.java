package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$io_global_by_wait_by_bytes")
public class XIoGlobalByWaitByBytes {
    @Column(name = "event_name")
    private String eventName;

    private Long total;

    @Column(name = "total_latency")
    private Long totalLatency;

    @Column(name = "min_latency")
    private Long minLatency;

    @Column(name = "avg_latency")
    private Long avgLatency;

    @Column(name = "max_latency")
    private Long maxLatency;

    @Column(name = "count_read")
    private Long countRead;

    @Column(name = "total_read")
    private Long totalRead;

    @Column(name = "avg_read")
    private BigDecimal avgRead;

    @Column(name = "count_write")
    private Long countWrite;

    @Column(name = "total_written")
    private Long totalWritten;

    @Column(name = "avg_written")
    private BigDecimal avgWritten;

    @Column(name = "total_requested")
    private Long totalRequested;

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
    public Long getAvgLatency() {
        return avgLatency;
    }

    /**
     * @param avgLatency
     */
    public void setAvgLatency(Long avgLatency) {
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

    /**
     * @return count_read
     */
    public Long getCountRead() {
        return countRead;
    }

    /**
     * @param countRead
     */
    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    /**
     * @return total_read
     */
    public Long getTotalRead() {
        return totalRead;
    }

    /**
     * @param totalRead
     */
    public void setTotalRead(Long totalRead) {
        this.totalRead = totalRead;
    }

    /**
     * @return avg_read
     */
    public BigDecimal getAvgRead() {
        return avgRead;
    }

    /**
     * @param avgRead
     */
    public void setAvgRead(BigDecimal avgRead) {
        this.avgRead = avgRead;
    }

    /**
     * @return count_write
     */
    public Long getCountWrite() {
        return countWrite;
    }

    /**
     * @param countWrite
     */
    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    /**
     * @return total_written
     */
    public Long getTotalWritten() {
        return totalWritten;
    }

    /**
     * @param totalWritten
     */
    public void setTotalWritten(Long totalWritten) {
        this.totalWritten = totalWritten;
    }

    /**
     * @return avg_written
     */
    public BigDecimal getAvgWritten() {
        return avgWritten;
    }

    /**
     * @param avgWritten
     */
    public void setAvgWritten(BigDecimal avgWritten) {
        this.avgWritten = avgWritten;
    }

    /**
     * @return total_requested
     */
    public Long getTotalRequested() {
        return totalRequested;
    }

    /**
     * @param totalRequested
     */
    public void setTotalRequested(Long totalRequested) {
        this.totalRequested = totalRequested;
    }
}