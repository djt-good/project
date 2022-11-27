package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "io_global_by_file_by_bytes")
public class IoGlobalByFileByBytes {
    private String file;

    @Column(name = "count_read")
    private Long countRead;

    @Column(name = "count_write")
    private Long countWrite;

    @Column(name = "write_pct")
    private BigDecimal writePct;

    @Column(name = "total_read")
    private String totalRead;

    @Column(name = "avg_read")
    private String avgRead;

    @Column(name = "total_written")
    private String totalWritten;

    @Column(name = "avg_write")
    private String avgWrite;

    private String total;

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

    /**
     * @return total_read
     */
    public String getTotalRead() {
        return totalRead;
    }

    /**
     * @param totalRead
     */
    public void setTotalRead(String totalRead) {
        this.totalRead = totalRead;
    }

    /**
     * @return avg_read
     */
    public String getAvgRead() {
        return avgRead;
    }

    /**
     * @param avgRead
     */
    public void setAvgRead(String avgRead) {
        this.avgRead = avgRead;
    }

    /**
     * @return total_written
     */
    public String getTotalWritten() {
        return totalWritten;
    }

    /**
     * @param totalWritten
     */
    public void setTotalWritten(String totalWritten) {
        this.totalWritten = totalWritten;
    }

    /**
     * @return avg_write
     */
    public String getAvgWrite() {
        return avgWrite;
    }

    /**
     * @param avgWrite
     */
    public void setAvgWrite(String avgWrite) {
        this.avgWrite = avgWrite;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(String total) {
        this.total = total;
    }
}