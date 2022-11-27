package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$io_global_by_file_by_bytes")
public class XIoGlobalByFileByBytes {
    private String file;

    @Column(name = "count_read")
    private Long countRead;

    @Column(name = "total_read")
    private Long totalRead;

    @Column(name = "avg_read")
    private BigDecimal avgRead;

    @Column(name = "count_write")
    private Long countWrite;

    @Column(name = "total_written")
    private Long totalWritten;

    @Column(name = "avg_write")
    private BigDecimal avgWrite;

    private Long total;

    @Column(name = "write_pct")
    private BigDecimal writePct;

    /**
     * @return file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * @return count_read
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
     * @return total_read
     */
    public Long getTotalRead() {
        return totalRead;
    }

    /**
     * @param totalRead
     */
    public void setTotalRead(Long totalRead) {
        this.totalRead = totalRead;
    }

    /**
     * @return avg_read
     */
    public BigDecimal getAvgRead() {
        return avgRead;
    }

    /**
     * @param avgRead
     */
    public void setAvgRead(BigDecimal avgRead) {
        this.avgRead = avgRead;
    }

    /**
     * @return count_write
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
     * @return total_written
     */
    public Long getTotalWritten() {
        return totalWritten;
    }

    /**
     * @param totalWritten
     */
    public void setTotalWritten(Long totalWritten) {
        this.totalWritten = totalWritten;
    }

    /**
     * @return avg_write
     */
    public BigDecimal getAvgWrite() {
        return avgWrite;
    }

    /**
     * @param avgWrite
     */
    public void setAvgWrite(BigDecimal avgWrite) {
        this.avgWrite = avgWrite;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * @return write_pct
     */
    public BigDecimal getWritePct() {
        return writePct;
    }

    /**
     * @param writePct
     */
    public void setWritePct(BigDecimal writePct) {
        this.writePct = writePct;
    }
}