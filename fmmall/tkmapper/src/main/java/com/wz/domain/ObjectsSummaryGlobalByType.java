package com.wz.domain;

import javax.persistence.*;

@Table(name = "objects_summary_global_by_type")
public class ObjectsSummaryGlobalByType {
    @Column(name = "OBJECT_TYPE")
    private String objectType;

    @Column(name = "OBJECT_SCHEMA")
    private String objectSchema;

    @Column(name = "OBJECT_NAME")
    private String objectName;

    @Column(name = "COUNT_STAR")
    private Long countStar;

    @Column(name = "SUM_TIMER_WAIT")
    private Long sumTimerWait;

    @Column(name = "MIN_TIMER_WAIT")
    private Long minTimerWait;

    @Column(name = "AVG_TIMER_WAIT")
    private Long avgTimerWait;

    @Column(name = "MAX_TIMER_WAIT")
    private Long maxTimerWait;

    /**
     * @return OBJECT_TYPE
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * @param objectType
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * @return OBJECT_SCHEMA
     */
    public String getObjectSchema() {
        return objectSchema;
    }

    /**
     * @param objectSchema
     */
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    /**
     * @return OBJECT_NAME
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * @return COUNT_STAR
     */
    public Long getCountStar() {
        return countStar;
    }

    /**
     * @param countStar
     */
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    /**
     * @return SUM_TIMER_WAIT
     */
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    /**
     * @param sumTimerWait
     */
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    /**
     * @return MIN_TIMER_WAIT
     */
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    /**
     * @param minTimerWait
     */
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    /**
     * @return AVG_TIMER_WAIT
     */
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    /**
     * @param avgTimerWait
     */
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    /**
     * @return MAX_TIMER_WAIT
     */
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    /**
     * @param maxTimerWait
     */
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }
}