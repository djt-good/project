package com.wz.domain;

import javax.persistence.*;

@Table(name = "memory_summary_by_user_by_event_name")
public class MemorySummaryByUserByEventName {
    @Column(name = "USER")
    private String user;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "COUNT_ALLOC")
    private Long countAlloc;

    @Column(name = "COUNT_FREE")
    private Long countFree;

    @Column(name = "SUM_NUMBER_OF_BYTES_ALLOC")
    private Long sumNumberOfBytesAlloc;

    @Column(name = "SUM_NUMBER_OF_BYTES_FREE")
    private Long sumNumberOfBytesFree;

    @Column(name = "LOW_COUNT_USED")
    private Long lowCountUsed;

    @Column(name = "CURRENT_COUNT_USED")
    private Long currentCountUsed;

    @Column(name = "HIGH_COUNT_USED")
    private Long highCountUsed;

    @Column(name = "LOW_NUMBER_OF_BYTES_USED")
    private Long lowNumberOfBytesUsed;

    @Column(name = "CURRENT_NUMBER_OF_BYTES_USED")
    private Long currentNumberOfBytesUsed;

    @Column(name = "HIGH_NUMBER_OF_BYTES_USED")
    private Long highNumberOfBytesUsed;

    /**
     * @return USER
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
     * @return COUNT_ALLOC
     */
    public Long getCountAlloc() {
        return countAlloc;
    }

    /**
     * @param countAlloc
     */
    public void setCountAlloc(Long countAlloc) {
        this.countAlloc = countAlloc;
    }

    /**
     * @return COUNT_FREE
     */
    public Long getCountFree() {
        return countFree;
    }

    /**
     * @param countFree
     */
    public void setCountFree(Long countFree) {
        this.countFree = countFree;
    }

    /**
     * @return SUM_NUMBER_OF_BYTES_ALLOC
     */
    public Long getSumNumberOfBytesAlloc() {
        return sumNumberOfBytesAlloc;
    }

    /**
     * @param sumNumberOfBytesAlloc
     */
    public void setSumNumberOfBytesAlloc(Long sumNumberOfBytesAlloc) {
        this.sumNumberOfBytesAlloc = sumNumberOfBytesAlloc;
    }

    /**
     * @return SUM_NUMBER_OF_BYTES_FREE
     */
    public Long getSumNumberOfBytesFree() {
        return sumNumberOfBytesFree;
    }

    /**
     * @param sumNumberOfBytesFree
     */
    public void setSumNumberOfBytesFree(Long sumNumberOfBytesFree) {
        this.sumNumberOfBytesFree = sumNumberOfBytesFree;
    }

    /**
     * @return LOW_COUNT_USED
     */
    public Long getLowCountUsed() {
        return lowCountUsed;
    }

    /**
     * @param lowCountUsed
     */
    public void setLowCountUsed(Long lowCountUsed) {
        this.lowCountUsed = lowCountUsed;
    }

    /**
     * @return CURRENT_COUNT_USED
     */
    public Long getCurrentCountUsed() {
        return currentCountUsed;
    }

    /**
     * @param currentCountUsed
     */
    public void setCurrentCountUsed(Long currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }

    /**
     * @return HIGH_COUNT_USED
     */
    public Long getHighCountUsed() {
        return highCountUsed;
    }

    /**
     * @param highCountUsed
     */
    public void setHighCountUsed(Long highCountUsed) {
        this.highCountUsed = highCountUsed;
    }

    /**
     * @return LOW_NUMBER_OF_BYTES_USED
     */
    public Long getLowNumberOfBytesUsed() {
        return lowNumberOfBytesUsed;
    }

    /**
     * @param lowNumberOfBytesUsed
     */
    public void setLowNumberOfBytesUsed(Long lowNumberOfBytesUsed) {
        this.lowNumberOfBytesUsed = lowNumberOfBytesUsed;
    }

    /**
     * @return CURRENT_NUMBER_OF_BYTES_USED
     */
    public Long getCurrentNumberOfBytesUsed() {
        return currentNumberOfBytesUsed;
    }

    /**
     * @param currentNumberOfBytesUsed
     */
    public void setCurrentNumberOfBytesUsed(Long currentNumberOfBytesUsed) {
        this.currentNumberOfBytesUsed = currentNumberOfBytesUsed;
    }

    /**
     * @return HIGH_NUMBER_OF_BYTES_USED
     */
    public Long getHighNumberOfBytesUsed() {
        return highNumberOfBytesUsed;
    }

    /**
     * @param highNumberOfBytesUsed
     */
    public void setHighNumberOfBytesUsed(Long highNumberOfBytesUsed) {
        this.highNumberOfBytesUsed = highNumberOfBytesUsed;
    }
}