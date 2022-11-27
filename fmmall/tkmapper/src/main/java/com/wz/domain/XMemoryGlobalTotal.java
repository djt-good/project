package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$memory_global_total")
public class XMemoryGlobalTotal {
    @Column(name = "total_allocated")
    private BigDecimal totalAllocated;

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