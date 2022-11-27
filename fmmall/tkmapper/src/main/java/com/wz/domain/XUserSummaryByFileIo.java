package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$user_summary_by_file_io")
public class XUserSummaryByFileIo {
    private String user;

    private BigDecimal ios;

    @Column(name = "io_latency")
    private BigDecimal ioLatency;

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
     * @return ios
     */
    public BigDecimal getIos() {
        return ios;
    }

    /**
     * @param ios
     */
    public void setIos(BigDecimal ios) {
        this.ios = ios;
    }

    /**
     * @return io_latency
     */
    public BigDecimal getIoLatency() {
        return ioLatency;
    }

    /**
     * @param ioLatency
     */
    public void setIoLatency(BigDecimal ioLatency) {
        this.ioLatency = ioLatency;
    }
}