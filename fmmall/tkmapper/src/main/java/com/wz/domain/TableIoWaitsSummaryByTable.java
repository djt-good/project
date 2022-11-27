package com.wz.domain;

import javax.persistence.*;

@Table(name = "table_io_waits_summary_by_table")
public class TableIoWaitsSummaryByTable {
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

    @Column(name = "COUNT_READ")
    private Long countRead;

    @Column(name = "SUM_TIMER_READ")
    private Long sumTimerRead;

    @Column(name = "MIN_TIMER_READ")
    private Long minTimerRead;

    @Column(name = "AVG_TIMER_READ")
    private Long avgTimerRead;

    @Column(name = "MAX_TIMER_READ")
    private Long maxTimerRead;

    @Column(name = "COUNT_WRITE")
    private Long countWrite;

    @Column(name = "SUM_TIMER_WRITE")
    private Long sumTimerWrite;

    @Column(name = "MIN_TIMER_WRITE")
    private Long minTimerWrite;

    @Column(name = "AVG_TIMER_WRITE")
    private Long avgTimerWrite;

    @Column(name = "MAX_TIMER_WRITE")
    private Long maxTimerWrite;

    @Column(name = "COUNT_FETCH")
    private Long countFetch;

    @Column(name = "SUM_TIMER_FETCH")
    private Long sumTimerFetch;

    @Column(name = "MIN_TIMER_FETCH")
    private Long minTimerFetch;

    @Column(name = "AVG_TIMER_FETCH")
    private Long avgTimerFetch;

    @Column(name = "MAX_TIMER_FETCH")
    private Long maxTimerFetch;

    @Column(name = "COUNT_INSERT")
    private Long countInsert;

    @Column(name = "SUM_TIMER_INSERT")
    private Long sumTimerInsert;

    @Column(name = "MIN_TIMER_INSERT")
    private Long minTimerInsert;

    @Column(name = "AVG_TIMER_INSERT")
    private Long avgTimerInsert;

    @Column(name = "MAX_TIMER_INSERT")
    private Long maxTimerInsert;

    @Column(name = "COUNT_UPDATE")
    private Long countUpdate;

    @Column(name = "SUM_TIMER_UPDATE")
    private Long sumTimerUpdate;

    @Column(name = "MIN_TIMER_UPDATE")
    private Long minTimerUpdate;

    @Column(name = "AVG_TIMER_UPDATE")
    private Long avgTimerUpdate;

    @Column(name = "MAX_TIMER_UPDATE")
    private Long maxTimerUpdate;

    @Column(name = "COUNT_DELETE")
    private Long countDelete;

    @Column(name = "SUM_TIMER_DELETE")
    private Long sumTimerDelete;

    @Column(name = "MIN_TIMER_DELETE")
    private Long minTimerDelete;

    @Column(name = "AVG_TIMER_DELETE")
    private Long avgTimerDelete;

    @Column(name = "MAX_TIMER_DELETE")
    private Long maxTimerDelete;

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

    /**
     * @return COUNT_READ
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
     * @return SUM_TIMER_READ
     */
    public Long getSumTimerRead() {
        return sumTimerRead;
    }

    /**
     * @param sumTimerRead
     */
    public void setSumTimerRead(Long sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }

    /**
     * @return MIN_TIMER_READ
     */
    public Long getMinTimerRead() {
        return minTimerRead;
    }

    /**
     * @param minTimerRead
     */
    public void setMinTimerRead(Long minTimerRead) {
        this.minTimerRead = minTimerRead;
    }

    /**
     * @return AVG_TIMER_READ
     */
    public Long getAvgTimerRead() {
        return avgTimerRead;
    }

    /**
     * @param avgTimerRead
     */
    public void setAvgTimerRead(Long avgTimerRead) {
        this.avgTimerRead = avgTimerRead;
    }

    /**
     * @return MAX_TIMER_READ
     */
    public Long getMaxTimerRead() {
        return maxTimerRead;
    }

    /**
     * @param maxTimerRead
     */
    public void setMaxTimerRead(Long maxTimerRead) {
        this.maxTimerRead = maxTimerRead;
    }

    /**
     * @return COUNT_WRITE
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
     * @return SUM_TIMER_WRITE
     */
    public Long getSumTimerWrite() {
        return sumTimerWrite;
    }

    /**
     * @param sumTimerWrite
     */
    public void setSumTimerWrite(Long sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }

    /**
     * @return MIN_TIMER_WRITE
     */
    public Long getMinTimerWrite() {
        return minTimerWrite;
    }

    /**
     * @param minTimerWrite
     */
    public void setMinTimerWrite(Long minTimerWrite) {
        this.minTimerWrite = minTimerWrite;
    }

    /**
     * @return AVG_TIMER_WRITE
     */
    public Long getAvgTimerWrite() {
        return avgTimerWrite;
    }

    /**
     * @param avgTimerWrite
     */
    public void setAvgTimerWrite(Long avgTimerWrite) {
        this.avgTimerWrite = avgTimerWrite;
    }

    /**
     * @return MAX_TIMER_WRITE
     */
    public Long getMaxTimerWrite() {
        return maxTimerWrite;
    }

    /**
     * @param maxTimerWrite
     */
    public void setMaxTimerWrite(Long maxTimerWrite) {
        this.maxTimerWrite = maxTimerWrite;
    }

    /**
     * @return COUNT_FETCH
     */
    public Long getCountFetch() {
        return countFetch;
    }

    /**
     * @param countFetch
     */
    public void setCountFetch(Long countFetch) {
        this.countFetch = countFetch;
    }

    /**
     * @return SUM_TIMER_FETCH
     */
    public Long getSumTimerFetch() {
        return sumTimerFetch;
    }

    /**
     * @param sumTimerFetch
     */
    public void setSumTimerFetch(Long sumTimerFetch) {
        this.sumTimerFetch = sumTimerFetch;
    }

    /**
     * @return MIN_TIMER_FETCH
     */
    public Long getMinTimerFetch() {
        return minTimerFetch;
    }

    /**
     * @param minTimerFetch
     */
    public void setMinTimerFetch(Long minTimerFetch) {
        this.minTimerFetch = minTimerFetch;
    }

    /**
     * @return AVG_TIMER_FETCH
     */
    public Long getAvgTimerFetch() {
        return avgTimerFetch;
    }

    /**
     * @param avgTimerFetch
     */
    public void setAvgTimerFetch(Long avgTimerFetch) {
        this.avgTimerFetch = avgTimerFetch;
    }

    /**
     * @return MAX_TIMER_FETCH
     */
    public Long getMaxTimerFetch() {
        return maxTimerFetch;
    }

    /**
     * @param maxTimerFetch
     */
    public void setMaxTimerFetch(Long maxTimerFetch) {
        this.maxTimerFetch = maxTimerFetch;
    }

    /**
     * @return COUNT_INSERT
     */
    public Long getCountInsert() {
        return countInsert;
    }

    /**
     * @param countInsert
     */
    public void setCountInsert(Long countInsert) {
        this.countInsert = countInsert;
    }

    /**
     * @return SUM_TIMER_INSERT
     */
    public Long getSumTimerInsert() {
        return sumTimerInsert;
    }

    /**
     * @param sumTimerInsert
     */
    public void setSumTimerInsert(Long sumTimerInsert) {
        this.sumTimerInsert = sumTimerInsert;
    }

    /**
     * @return MIN_TIMER_INSERT
     */
    public Long getMinTimerInsert() {
        return minTimerInsert;
    }

    /**
     * @param minTimerInsert
     */
    public void setMinTimerInsert(Long minTimerInsert) {
        this.minTimerInsert = minTimerInsert;
    }

    /**
     * @return AVG_TIMER_INSERT
     */
    public Long getAvgTimerInsert() {
        return avgTimerInsert;
    }

    /**
     * @param avgTimerInsert
     */
    public void setAvgTimerInsert(Long avgTimerInsert) {
        this.avgTimerInsert = avgTimerInsert;
    }

    /**
     * @return MAX_TIMER_INSERT
     */
    public Long getMaxTimerInsert() {
        return maxTimerInsert;
    }

    /**
     * @param maxTimerInsert
     */
    public void setMaxTimerInsert(Long maxTimerInsert) {
        this.maxTimerInsert = maxTimerInsert;
    }

    /**
     * @return COUNT_UPDATE
     */
    public Long getCountUpdate() {
        return countUpdate;
    }

    /**
     * @param countUpdate
     */
    public void setCountUpdate(Long countUpdate) {
        this.countUpdate = countUpdate;
    }

    /**
     * @return SUM_TIMER_UPDATE
     */
    public Long getSumTimerUpdate() {
        return sumTimerUpdate;
    }

    /**
     * @param sumTimerUpdate
     */
    public void setSumTimerUpdate(Long sumTimerUpdate) {
        this.sumTimerUpdate = sumTimerUpdate;
    }

    /**
     * @return MIN_TIMER_UPDATE
     */
    public Long getMinTimerUpdate() {
        return minTimerUpdate;
    }

    /**
     * @param minTimerUpdate
     */
    public void setMinTimerUpdate(Long minTimerUpdate) {
        this.minTimerUpdate = minTimerUpdate;
    }

    /**
     * @return AVG_TIMER_UPDATE
     */
    public Long getAvgTimerUpdate() {
        return avgTimerUpdate;
    }

    /**
     * @param avgTimerUpdate
     */
    public void setAvgTimerUpdate(Long avgTimerUpdate) {
        this.avgTimerUpdate = avgTimerUpdate;
    }

    /**
     * @return MAX_TIMER_UPDATE
     */
    public Long getMaxTimerUpdate() {
        return maxTimerUpdate;
    }

    /**
     * @param maxTimerUpdate
     */
    public void setMaxTimerUpdate(Long maxTimerUpdate) {
        this.maxTimerUpdate = maxTimerUpdate;
    }

    /**
     * @return COUNT_DELETE
     */
    public Long getCountDelete() {
        return countDelete;
    }

    /**
     * @param countDelete
     */
    public void setCountDelete(Long countDelete) {
        this.countDelete = countDelete;
    }

    /**
     * @return SUM_TIMER_DELETE
     */
    public Long getSumTimerDelete() {
        return sumTimerDelete;
    }

    /**
     * @param sumTimerDelete
     */
    public void setSumTimerDelete(Long sumTimerDelete) {
        this.sumTimerDelete = sumTimerDelete;
    }

    /**
     * @return MIN_TIMER_DELETE
     */
    public Long getMinTimerDelete() {
        return minTimerDelete;
    }

    /**
     * @param minTimerDelete
     */
    public void setMinTimerDelete(Long minTimerDelete) {
        this.minTimerDelete = minTimerDelete;
    }

    /**
     * @return AVG_TIMER_DELETE
     */
    public Long getAvgTimerDelete() {
        return avgTimerDelete;
    }

    /**
     * @param avgTimerDelete
     */
    public void setAvgTimerDelete(Long avgTimerDelete) {
        this.avgTimerDelete = avgTimerDelete;
    }

    /**
     * @return MAX_TIMER_DELETE
     */
    public Long getMaxTimerDelete() {
        return maxTimerDelete;
    }

    /**
     * @param maxTimerDelete
     */
    public void setMaxTimerDelete(Long maxTimerDelete) {
        this.maxTimerDelete = maxTimerDelete;
    }
}