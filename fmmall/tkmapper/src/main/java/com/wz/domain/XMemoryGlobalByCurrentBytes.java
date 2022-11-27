package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$memory_global_by_current_bytes")
public class XMemoryGlobalByCurrentBytes {
    @Column(name = "event_name")
    private String eventName;

    @Column(name = "current_count")
    private Long currentCount;

    @Column(name = "current_alloc")
    private Long currentAlloc;

    @Column(name = "current_avg_alloc")
    private BigDecimal currentAvgAlloc;

    @Column(name = "high_count")
    private Long highCount;

    @Column(name = "high_alloc")
    private Long highAlloc;

    @Column(name = "high_avg_alloc")
    private BigDecimal highAvgAlloc;

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
     * @return current_alloc
     */
    public Long getCurrentAlloc() {
        return currentAlloc;
    }

    /**
     * @param currentAlloc
     */
    public void setCurrentAlloc(Long currentAlloc) {
        this.currentAlloc = currentAlloc;
    }

    /**
     * @return current_avg_alloc
     */
    public BigDecimal getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    /**
     * @param currentAvgAlloc
     */
    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
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
     * @return high_alloc
     */
    public Long getHighAlloc() {
        return highAlloc;
    }

    /**
     * @param highAlloc
     */
    public void setHighAlloc(Long highAlloc) {
        this.highAlloc = highAlloc;
    }

    /**
     * @return high_avg_alloc
     */
    public BigDecimal getHighAvgAlloc() {
        return highAvgAlloc;
    }

    /**
     * @param highAvgAlloc
     */
    public void setHighAvgAlloc(BigDecimal highAvgAlloc) {
        this.highAvgAlloc = highAvgAlloc;
    }
}