package com.wz.domain;

import javax.persistence.*;

@Table(name = "gtid_executed")
public class GtidExecuted {
    /**
     * uuid of the source where the transaction was originally executed.
     */
    @Id
    @Column(name = "source_uuid")
    private String sourceUuid;

    /**
     * First number of interval.
     */
    @Id
    @Column(name = "interval_start")
    private Long intervalStart;

    /**
     * Last number of interval.
     */
    @Column(name = "interval_end")
    private Long intervalEnd;

    /**
     * 获取uuid of the source where the transaction was originally executed.
     *
     * @return source_uuid - uuid of the source where the transaction was originally executed.
     */
    public String getSourceUuid() {
        return sourceUuid;
    }

    /**
     * 设置uuid of the source where the transaction was originally executed.
     *
     * @param sourceUuid uuid of the source where the transaction was originally executed.
     */
    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid;
    }

    /**
     * 获取First number of interval.
     *
     * @return interval_start - First number of interval.
     */
    public Long getIntervalStart() {
        return intervalStart;
    }

    /**
     * 设置First number of interval.
     *
     * @param intervalStart First number of interval.
     */
    public void setIntervalStart(Long intervalStart) {
        this.intervalStart = intervalStart;
    }

    /**
     * 获取Last number of interval.
     *
     * @return interval_end - Last number of interval.
     */
    public Long getIntervalEnd() {
        return intervalEnd;
    }

    /**
     * 设置Last number of interval.
     *
     * @param intervalEnd Last number of interval.
     */
    public void setIntervalEnd(Long intervalEnd) {
        this.intervalEnd = intervalEnd;
    }
}