package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$ps_digest_avg_latency_distribution")
public class XPsDigestAvgLatencyDistribution {
    private Long cnt;

    @Column(name = "avg_us")
    private BigDecimal avgUs;

    /**
     * @return cnt
     */
    public Long getCnt() {
        return cnt;
    }

    /**
     * @param cnt
     */
    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    /**
     * @return avg_us
     */
    public BigDecimal getAvgUs() {
        return avgUs;
    }

    /**
     * @param avgUs
     */
    public void setAvgUs(BigDecimal avgUs) {
        this.avgUs = avgUs;
    }
}