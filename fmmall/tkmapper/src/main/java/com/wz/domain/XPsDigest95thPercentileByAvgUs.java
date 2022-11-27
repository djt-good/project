package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$ps_digest_95th_percentile_by_avg_us")
public class XPsDigest95thPercentileByAvgUs {
    @Column(name = "avg_us")
    private BigDecimal avgUs;

    private BigDecimal percentile;

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

    /**
     * @return percentile
     */
    public BigDecimal getPercentile() {
        return percentile;
    }

    /**
     * @param percentile
     */
    public void setPercentile(BigDecimal percentile) {
        this.percentile = percentile;
    }
}