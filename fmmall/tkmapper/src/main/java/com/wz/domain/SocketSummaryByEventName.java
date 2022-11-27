package com.wz.domain;

import javax.persistence.*;

@Table(name = "socket_summary_by_event_name")
public class SocketSummaryByEventName {
    @Id
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

    @Column(name = "COUNT_READ")
    private Long countRead;

    @Column(name = "SUM_TIMER_READ")
    private Long sumTimerRead;

    @Column(name = "MIN_TIMER_READ")
    private Long minTimerRead;

    @Column(name = "AVG_TIMER_READ")
    private Long avgTimerRead;

    @Column(name = "MAX_TIMER_READ")
    private Long maxTimerRead;

    @Column(name = "SUM_NUMBER_OF_BYTES_READ")
    private Long sumNumberOfBytesRead;

    @Column(name = "COUNT_WRITE")
    private Long countWrite;

    @Column(name = "SUM_TIMER_WRITE")
    private Long sumTimerWrite;

    @Column(name = "MIN_TIMER_WRITE")
    private Long minTimerWrite;

    @Column(name = "AVG_TIMER_WRITE")
    private Long avgTimerWrite;

    @Column(name = "MAX_TIMER_WRITE")
    private Long maxTimerWrite;

    @Column(name = "SUM_NUMBER_OF_BYTES_WRITE")
    private Long sumNumberOfBytesWrite;

    @Column(name = "COUNT_MISC")
    private Long countMisc;

    @Column(name = "SUM_TIMER_MISC")
    private Long sumTimerMisc;

    @Column(name = "MIN_TIMER_MISC")
    private Long minTimerMisc;

    @Column(name = "AVG_TIMER_MISC")
    private Long avgTimerMisc;

    @Column(name = "MAX_TIMER_MISC")
    private Long maxTimerMisc;

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
     * @return COUNT_READ
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
     * @return SUM_TIMER_READ
     */
    public Long getSumTimerRead() {
        return sumTimerRead;
    }

    /**
     * @param sumTimerRead
     */
    public void setSumTimerRead(Long sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }

    /**
     * @return MIN_TIMER_READ
     */
    public Long getMinTimerRead() {
        return minTimerRead;
    }

    /**
     * @param minTimerRead
     */
    public void setMinTimerRead(Long minTimerRead) {
        this.minTimerRead = minTimerRead;
    }

    /**
     * @return AVG_TIMER_READ
     */
    public Long getAvgTimerRead() {
        return avgTimerRead;
    }

    /**
     * @param avgTimerRead
     */
    public void setAvgTimerRead(Long avgTimerRead) {
        this.avgTimerRead = avgTimerRead;
    }

    /**
     * @return MAX_TIMER_READ
     */
    public Long getMaxTimerRead() {
        return maxTimerRead;
    }

    /**
     * @param maxTimerRead
     */
    public void setMaxTimerRead(Long maxTimerRead) {
        this.maxTimerRead = maxTimerRead;
    }

    /**
     * @return SUM_NUMBER_OF_BYTES_READ
     */
    public Long getSumNumberOfBytesRead() {
        return sumNumberOfBytesRead;
    }

    /**
     * @param sumNumberOfBytesRead
     */
    public void setSumNumberOfBytesRead(Long sumNumberOfBytesRead) {
        this.sumNumberOfBytesRead = sumNumberOfBytesRead;
    }

    /**
     * @return COUNT_WRITE
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
     * @return SUM_TIMER_WRITE
     */
    public Long getSumTimerWrite() {
        return sumTimerWrite;
    }

    /**
     * @param sumTimerWrite
     */
    public void setSumTimerWrite(Long sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }

    /**
     * @return MIN_TIMER_WRITE
     */
    public Long getMinTimerWrite() {
        return minTimerWrite;
    }

    /**
     * @param minTimerWrite
     */
    public void setMinTimerWrite(Long minTimerWrite) {
        this.minTimerWrite = minTimerWrite;
    }

    /**
     * @return AVG_TIMER_WRITE
     */
    public Long getAvgTimerWrite() {
        return avgTimerWrite;
    }

    /**
     * @param avgTimerWrite
     */
    public void setAvgTimerWrite(Long avgTimerWrite) {
        this.avgTimerWrite = avgTimerWrite;
    }

    /**
     * @return MAX_TIMER_WRITE
     */
    public Long getMaxTimerWrite() {
        return maxTimerWrite;
    }

    /**
     * @param maxTimerWrite
     */
    public void setMaxTimerWrite(Long maxTimerWrite) {
        this.maxTimerWrite = maxTimerWrite;
    }

    /**
     * @return SUM_NUMBER_OF_BYTES_WRITE
     */
    public Long getSumNumberOfBytesWrite() {
        return sumNumberOfBytesWrite;
    }

    /**
     * @param sumNumberOfBytesWrite
     */
    public void setSumNumberOfBytesWrite(Long sumNumberOfBytesWrite) {
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
    }

    /**
     * @return COUNT_MISC
     */
    public Long getCountMisc() {
        return countMisc;
    }

    /**
     * @param countMisc
     */
    public void setCountMisc(Long countMisc) {
        this.countMisc = countMisc;
    }

    /**
     * @return SUM_TIMER_MISC
     */
    public Long getSumTimerMisc() {
        return sumTimerMisc;
    }

    /**
     * @param sumTimerMisc
     */
    public void setSumTimerMisc(Long sumTimerMisc) {
        this.sumTimerMisc = sumTimerMisc;
    }

    /**
     * @return MIN_TIMER_MISC
     */
    public Long getMinTimerMisc() {
        return minTimerMisc;
    }

    /**
     * @param minTimerMisc
     */
    public void setMinTimerMisc(Long minTimerMisc) {
        this.minTimerMisc = minTimerMisc;
    }

    /**
     * @return AVG_TIMER_MISC
     */
    public Long getAvgTimerMisc() {
        return avgTimerMisc;
    }

    /**
     * @param avgTimerMisc
     */
    public void setAvgTimerMisc(Long avgTimerMisc) {
        this.avgTimerMisc = avgTimerMisc;
    }

    /**
     * @return MAX_TIMER_MISC
     */
    public Long getMaxTimerMisc() {
        return maxTimerMisc;
    }

    /**
     * @param maxTimerMisc
     */
    public void setMaxTimerMisc(Long maxTimerMisc) {
        this.maxTimerMisc = maxTimerMisc;
    }
}