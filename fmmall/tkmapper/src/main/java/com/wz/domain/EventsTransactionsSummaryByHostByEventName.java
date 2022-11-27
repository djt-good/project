package com.wz.domain;

import javax.persistence.*;

@Table(name = "events_transactions_summary_by_host_by_event_name")
public class EventsTransactionsSummaryByHostByEventName {
    @Column(name = "HOST")
    private String host;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "COUNT_STAR")
    private Long countStar;

    @Column(name = "SUM_TIMER_WAIT")
    private Long sumTimerWait;

    @Column(name = "MIN_TIMER_WAIT")
    private Long minTimerWait;

    @Column(name = "AVG_TIMER_WAIT")
    private Long avgTimerWait;

    @Column(name = "MAX_TIMER_WAIT")
    private Long maxTimerWait;

    @Column(name = "COUNT_READ_WRITE")
    private Long countReadWrite;

    @Column(name = "SUM_TIMER_READ_WRITE")
    private Long sumTimerReadWrite;

    @Column(name = "MIN_TIMER_READ_WRITE")
    private Long minTimerReadWrite;

    @Column(name = "AVG_TIMER_READ_WRITE")
    private Long avgTimerReadWrite;

    @Column(name = "MAX_TIMER_READ_WRITE")
    private Long maxTimerReadWrite;

    @Column(name = "COUNT_READ_ONLY")
    private Long countReadOnly;

    @Column(name = "SUM_TIMER_READ_ONLY")
    private Long sumTimerReadOnly;

    @Column(name = "MIN_TIMER_READ_ONLY")
    private Long minTimerReadOnly;

    @Column(name = "AVG_TIMER_READ_ONLY")
    private Long avgTimerReadOnly;

    @Column(name = "MAX_TIMER_READ_ONLY")
    private Long maxTimerReadOnly;

    /**
     * @return HOST
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
     * @return EVENT_NAME
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
     * @return COUNT_STAR
     */
    public Long getCountStar() {
        return countStar;
    }

    /**
     * @param countStar
     */
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    /**
     * @return SUM_TIMER_WAIT
     */
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    /**
     * @param sumTimerWait
     */
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    /**
     * @return MIN_TIMER_WAIT
     */
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    /**
     * @param minTimerWait
     */
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    /**
     * @return AVG_TIMER_WAIT
     */
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    /**
     * @param avgTimerWait
     */
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    /**
     * @return MAX_TIMER_WAIT
     */
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    /**
     * @param maxTimerWait
     */
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }

    /**
     * @return COUNT_READ_WRITE
     */
    public Long getCountReadWrite() {
        return countReadWrite;
    }

    /**
     * @param countReadWrite
     */
    public void setCountReadWrite(Long countReadWrite) {
        this.countReadWrite = countReadWrite;
    }

    /**
     * @return SUM_TIMER_READ_WRITE
     */
    public Long getSumTimerReadWrite() {
        return sumTimerReadWrite;
    }

    /**
     * @param sumTimerReadWrite
     */
    public void setSumTimerReadWrite(Long sumTimerReadWrite) {
        this.sumTimerReadWrite = sumTimerReadWrite;
    }

    /**
     * @return MIN_TIMER_READ_WRITE
     */
    public Long getMinTimerReadWrite() {
        return minTimerReadWrite;
    }

    /**
     * @param minTimerReadWrite
     */
    public void setMinTimerReadWrite(Long minTimerReadWrite) {
        this.minTimerReadWrite = minTimerReadWrite;
    }

    /**
     * @return AVG_TIMER_READ_WRITE
     */
    public Long getAvgTimerReadWrite() {
        return avgTimerReadWrite;
    }

    /**
     * @param avgTimerReadWrite
     */
    public void setAvgTimerReadWrite(Long avgTimerReadWrite) {
        this.avgTimerReadWrite = avgTimerReadWrite;
    }

    /**
     * @return MAX_TIMER_READ_WRITE
     */
    public Long getMaxTimerReadWrite() {
        return maxTimerReadWrite;
    }

    /**
     * @param maxTimerReadWrite
     */
    public void setMaxTimerReadWrite(Long maxTimerReadWrite) {
        this.maxTimerReadWrite = maxTimerReadWrite;
    }

    /**
     * @return COUNT_READ_ONLY
     */
    public Long getCountReadOnly() {
        return countReadOnly;
    }

    /**
     * @param countReadOnly
     */
    public void setCountReadOnly(Long countReadOnly) {
        this.countReadOnly = countReadOnly;
    }

    /**
     * @return SUM_TIMER_READ_ONLY
     */
    public Long getSumTimerReadOnly() {
        return sumTimerReadOnly;
    }

    /**
     * @param sumTimerReadOnly
     */
    public void setSumTimerReadOnly(Long sumTimerReadOnly) {
        this.sumTimerReadOnly = sumTimerReadOnly;
    }

    /**
     * @return MIN_TIMER_READ_ONLY
     */
    public Long getMinTimerReadOnly() {
        return minTimerReadOnly;
    }

    /**
     * @param minTimerReadOnly
     */
    public void setMinTimerReadOnly(Long minTimerReadOnly) {
        this.minTimerReadOnly = minTimerReadOnly;
    }

    /**
     * @return AVG_TIMER_READ_ONLY
     */
    public Long getAvgTimerReadOnly() {
        return avgTimerReadOnly;
    }

    /**
     * @param avgTimerReadOnly
     */
    public void setAvgTimerReadOnly(Long avgTimerReadOnly) {
        this.avgTimerReadOnly = avgTimerReadOnly;
    }

    /**
     * @return MAX_TIMER_READ_ONLY
     */
    public Long getMaxTimerReadOnly() {
        return maxTimerReadOnly;
    }

    /**
     * @param maxTimerReadOnly
     */
    public void setMaxTimerReadOnly(Long maxTimerReadOnly) {
        this.maxTimerReadOnly = maxTimerReadOnly;
    }
}