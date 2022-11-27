package com.wz.domain;

import javax.persistence.*;

@Table(name = "io_global_by_wait_by_bytes")
public class IoGlobalByWaitByBytes {
    @Column(name = "event_name")
    private String eventName;

    private Long total;

    @Column(name = "count_read")
    private Long countRead;

    @Column(name = "count_write")
    private Long countWrite;

    @Column(name = "total_latency")
    private String totalLatency;

    @Column(name = "min_latency")
    private String minLatency;

    @Column(name = "avg_latency")
    private String avgLatency;

    @Column(name = "max_latency")
    private String maxLatency;

    @Column(name = "total_read")
    private String totalRead;

    @Column(name = "avg_read")
    private String avgRead;

    @Column(name = "total_written")
    private String totalWritten;

    @Column(name = "avg_written")
    private String avgWritten;

    @Column(name = "total_requested")
    private String totalRequested;

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

    /**
     * @return total_read
     */
    public String getTotalRead() {
        return totalRead;
    }

    /**
     * @param totalRead
     */
    public void setTotalRead(String totalRead) {
        this.totalRead = totalRead;
    }

    /**
     * @return avg_read
     */
    public String getAvgRead() {
        return avgRead;
    }

    /**
     * @param avgRead
     */
    public void setAvgRead(String avgRead) {
        this.avgRead = avgRead;
    }

    /**
     * @return total_written
     */
    public String getTotalWritten() {
        return totalWritten;
    }

    /**
     * @param totalWritten
     */
    public void setTotalWritten(String totalWritten) {
        this.totalWritten = totalWritten;
    }

    /**
     * @return avg_written
     */
    public String getAvgWritten() {
        return avgWritten;
    }

    /**
     * @param avgWritten
     */
    public void setAvgWritten(String avgWritten) {
        this.avgWritten = avgWritten;
    }

    /**
     * @return total_requested
     */
    public String getTotalRequested() {
        return totalRequested;
    }

    /**
     * @param totalRequested
     */
    public void setTotalRequested(String totalRequested) {
        this.totalRequested = totalRequested;
    }
}