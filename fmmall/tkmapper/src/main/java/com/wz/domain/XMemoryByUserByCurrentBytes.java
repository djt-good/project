package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$memory_by_user_by_current_bytes")
public class XMemoryByUserByCurrentBytes {
    private String user;

    @Column(name = "current_count_used")
    private BigDecimal currentCountUsed;

    @Column(name = "current_allocated")
    private BigDecimal currentAllocated;

    @Column(name = "current_avg_alloc")
    private BigDecimal currentAvgAlloc;

    @Column(name = "current_max_alloc")
    private Long currentMaxAlloc;

    @Column(name = "total_allocated")
    private BigDecimal totalAllocated;

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
    public BigDecimal getCurrentAllocated() {
        return currentAllocated;
    }

    /**
     * @param currentAllocated
     */
    public void setCurrentAllocated(BigDecimal currentAllocated) {
        this.currentAllocated = currentAllocated;
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
     * @return current_max_alloc
     */
    public Long getCurrentMaxAlloc() {
        return currentMaxAlloc;
    }

    /**
     * @param currentMaxAlloc
     */
    public void setCurrentMaxAlloc(Long currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc;
    }

    /**
     * @return total_allocated
     */
    public BigDecimal getTotalAllocated() {
        return totalAllocated;
    }

    /**
     * @param totalAllocated
     */
    public void setTotalAllocated(BigDecimal totalAllocated) {
        this.totalAllocated = totalAllocated;
    }
}