package com.wz.domain;

import javax.persistence.*;

@Table(name = "memory_global_by_current_bytes")
public class MemoryGlobalByCurrentBytes {
    @Column(name = "event_name")
    private String eventName;

    @Column(name = "current_count")
    private Long currentCount;

    @Column(name = "high_count")
    private Long highCount;

    @Column(name = "current_alloc")
    private String currentAlloc;

    @Column(name = "current_avg_alloc")
    private String currentAvgAlloc;

    @Column(name = "high_alloc")
    private String highAlloc;

    @Column(name = "high_avg_alloc")
    private String highAvgAlloc;

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
     * @return current_count
     */
    public Long getCurrentCount() {
        return currentCount;
    }

    /**
     * @param currentCount
     */
    public void setCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
    }

    /**
     * @return high_count
     */
    public Long getHighCount() {
        return highCount;
    }

    /**
     * @param highCount
     */
    public void setHighCount(Long highCount) {
        this.highCount = highCount;
    }

    /**
     * @return current_alloc
     */
    public String getCurrentAlloc() {
        return currentAlloc;
    }

    /**
     * @param currentAlloc
     */
    public void setCurrentAlloc(String currentAlloc) {
        this.currentAlloc = currentAlloc;
    }

    /**
     * @return current_avg_alloc
     */
    public String getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    /**
     * @param currentAvgAlloc
     */
    public void setCurrentAvgAlloc(String currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    /**
     * @return high_alloc
     */
    public String getHighAlloc() {
        return highAlloc;
    }

    /**
     * @param highAlloc
     */
    public void setHighAlloc(String highAlloc) {
        this.highAlloc = highAlloc;
    }

    /**
     * @return high_avg_alloc
     */
    public String getHighAvgAlloc() {
        return highAvgAlloc;
    }

    /**
     * @param highAvgAlloc
     */
    public void setHighAvgAlloc(String highAvgAlloc) {
        this.highAvgAlloc = highAvgAlloc;
    }
}