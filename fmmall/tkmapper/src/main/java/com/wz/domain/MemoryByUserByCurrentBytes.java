package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "memory_by_user_by_current_bytes")
public class MemoryByUserByCurrentBytes {
    private String user;

    @Column(name = "current_count_used")
    private BigDecimal currentCountUsed;

    @Column(name = "current_allocated")
    private String currentAllocated;

    @Column(name = "current_avg_alloc")
    private String currentAvgAlloc;

    @Column(name = "current_max_alloc")
    private String currentMaxAlloc;

    @Column(name = "total_allocated")
    private String totalAllocated;

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
     * @return current_count_used
     */
    public BigDecimal getCurrentCountUsed() {
        return currentCountUsed;
    }

    /**
     * @param currentCountUsed
     */
    public void setCurrentCountUsed(BigDecimal currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }

    /**
     * @return current_allocated
     */
    public String getCurrentAllocated() {
        return currentAllocated;
    }

    /**
     * @param currentAllocated
     */
    public void setCurrentAllocated(String currentAllocated) {
        this.currentAllocated = currentAllocated;
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
     * @return current_max_alloc
     */
    public String getCurrentMaxAlloc() {
        return currentMaxAlloc;
    }

    /**
     * @param currentMaxAlloc
     */
    public void setCurrentMaxAlloc(String currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc;
    }

    /**
     * @return total_allocated
     */
    public String getTotalAllocated() {
        return totalAllocated;
    }

    /**
     * @param totalAllocated
     */
    public void setTotalAllocated(String totalAllocated) {
        this.totalAllocated = totalAllocated;
    }
}