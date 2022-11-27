package com.wz.domain;

import javax.persistence.*;

@Table(name = "x$io_global_by_file_by_latency")
public class XIoGlobalByFileByLatency {
    private String file;

    private Long total;

    @Column(name = "total_latency")
    private Long totalLatency;

    @Column(name = "count_read")
    private Long countRead;

    @Column(name = "read_latency")
    private Long readLatency;

    @Column(name = "count_write")
    private Long countWrite;

    @Column(name = "write_latency")
    private Long writeLatency;

    @Column(name = "count_misc")
    private Long countMisc;

    @Column(name = "misc_latency")
    private Long miscLatency;

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
     * @return total_latency
     */
    public Long getTotalLatency() {
        return totalLatency;
    }

    /**
     * @param totalLatency
     */
    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
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
     * @return read_latency
     */
    public Long getReadLatency() {
        return readLatency;
    }

    /**
     * @param readLatency
     */
    public void setReadLatency(Long readLatency) {
        this.readLatency = readLatency;
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
     * @return write_latency
     */
    public Long getWriteLatency() {
        return writeLatency;
    }

    /**
     * @param writeLatency
     */
    public void setWriteLatency(Long writeLatency) {
        this.writeLatency = writeLatency;
    }

    /**
     * @return count_misc
     */
    public Long getCountMisc() {
        return countMisc;
    }

    /**
     * @param countMisc
     */
    public void setCountMisc(Long countMisc) {
        this.countMisc = countMisc;
    }

    /**
     * @return misc_latency
     */
    public Long getMiscLatency() {
        return miscLatency;
    }

    /**
     * @param miscLatency
     */
    public void setMiscLatency(Long miscLatency) {
        this.miscLatency = miscLatency;
    }
}