package com.wz.domain;

import javax.persistence.*;

@Table(name = "x$latest_file_io")
public class XLatestFileIo {
    private String thread;

    private String file;

    private Long latency;

    private String operation;

    private Long requested;

    /**
     * @return thread
     */
    public String getThread() {
        return thread;
    }

    /**
     * @param thread
     */
    public void setThread(String thread) {
        this.thread = thread;
    }

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
     * @return latency
     */
    public Long getLatency() {
        return latency;
    }

    /**
     * @param latency
     */
    public void setLatency(Long latency) {
        this.latency = latency;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return requested
     */
    public Long getRequested() {
        return requested;
    }

    /**
     * @param requested
     */
    public void setRequested(Long requested) {
        this.requested = requested;
    }
}