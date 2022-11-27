package com.wz.domain;

import javax.persistence.*;

@Table(name = "io_global_by_file_by_latency")
public class IoGlobalByFileByLatency {
    private String file;

    private Long total;

    @Column(name = "count_read")
    private Long countRead;

    @Column(name = "count_write")
    private Long countWrite;

    @Column(name = "count_misc")
    private Long countMisc;

    @Column(name = "total_latency")
    private String totalLatency;

    @Column(name = "read_latency")
    private String readLatency;

    @Column(name = "write_latency")
    private String writeLatency;

    @Column(name = "misc_latency")
    private String miscLatency;

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
     * @return total_latency
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * @param totalLatency
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * @return read_latency
     */
    public String getReadLatency() {
        return readLatency;
    }

    /**
     * @param readLatency
     */
    public void setReadLatency(String readLatency) {
        this.readLatency = readLatency;
    }

    /**
     * @return write_latency
     */
    public String getWriteLatency() {
        return writeLatency;
    }

    /**
     * @param writeLatency
     */
    public void setWriteLatency(String writeLatency) {
        this.writeLatency = writeLatency;
    }

    /**
     * @return misc_latency
     */
    public String getMiscLatency() {
        return miscLatency;
    }

    /**
     * @param miscLatency
     */
    public void setMiscLatency(String miscLatency) {
        this.miscLatency = miscLatency;
    }
}