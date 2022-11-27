package com.wz.domain;

import javax.persistence.*;

@Table(name = "file_instances")
public class FileInstances {
    @Id
    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "OPEN_COUNT")
    private Integer openCount;

    /**
     * @return FILE_NAME
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return EVENT_NAME
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @return OPEN_COUNT
     */
    public Integer getOpenCount() {
        return openCount;
    }

    /**
     * @param openCount
     */
    public void setOpenCount(Integer openCount) {
        this.openCount = openCount;
    }
}