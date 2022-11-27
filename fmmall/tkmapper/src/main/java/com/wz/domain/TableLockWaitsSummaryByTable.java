package com.wz.domain;

import javax.persistence.*;

@Table(name = "table_lock_waits_summary_by_table")
public class TableLockWaitsSummaryByTable {
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

    @Column(name = "COUNT_READ_NORMAL")
    private Long countReadNormal;

    @Column(name = "SUM_TIMER_READ_NORMAL")
    private Long sumTimerReadNormal;

    @Column(name = "MIN_TIMER_READ_NORMAL")
    private Long minTimerReadNormal;

    @Column(name = "AVG_TIMER_READ_NORMAL")
    private Long avgTimerReadNormal;

    @Column(name = "MAX_TIMER_READ_NORMAL")
    private Long maxTimerReadNormal;

    @Column(name = "COUNT_READ_WITH_SHARED_LOCKS")
    private Long countReadWithSharedLocks;

    @Column(name = "SUM_TIMER_READ_WITH_SHARED_LOCKS")
    private Long sumTimerReadWithSharedLocks;

    @Column(name = "MIN_TIMER_READ_WITH_SHARED_LOCKS")
    private Long minTimerReadWithSharedLocks;

    @Column(name = "AVG_TIMER_READ_WITH_SHARED_LOCKS")
    private Long avgTimerReadWithSharedLocks;

    @Column(name = "MAX_TIMER_READ_WITH_SHARED_LOCKS")
    private Long maxTimerReadWithSharedLocks;

    @Column(name = "COUNT_READ_HIGH_PRIORITY")
    private Long countReadHighPriority;

    @Column(name = "SUM_TIMER_READ_HIGH_PRIORITY")
    private Long sumTimerReadHighPriority;

    @Column(name = "MIN_TIMER_READ_HIGH_PRIORITY")
    private Long minTimerReadHighPriority;

    @Column(name = "AVG_TIMER_READ_HIGH_PRIORITY")
    private Long avgTimerReadHighPriority;

    @Column(name = "MAX_TIMER_READ_HIGH_PRIORITY")
    private Long maxTimerReadHighPriority;

    @Column(name = "COUNT_READ_NO_INSERT")
    private Long countReadNoInsert;

    @Column(name = "SUM_TIMER_READ_NO_INSERT")
    private Long sumTimerReadNoInsert;

    @Column(name = "MIN_TIMER_READ_NO_INSERT")
    private Long minTimerReadNoInsert;

    @Column(name = "AVG_TIMER_READ_NO_INSERT")
    private Long avgTimerReadNoInsert;

    @Column(name = "MAX_TIMER_READ_NO_INSERT")
    private Long maxTimerReadNoInsert;

    @Column(name = "COUNT_READ_EXTERNAL")
    private Long countReadExternal;

    @Column(name = "SUM_TIMER_READ_EXTERNAL")
    private Long sumTimerReadExternal;

    @Column(name = "MIN_TIMER_READ_EXTERNAL")
    private Long minTimerReadExternal;

    @Column(name = "AVG_TIMER_READ_EXTERNAL")
    private Long avgTimerReadExternal;

    @Column(name = "MAX_TIMER_READ_EXTERNAL")
    private Long maxTimerReadExternal;

    @Column(name = "COUNT_WRITE_ALLOW_WRITE")
    private Long countWriteAllowWrite;

    @Column(name = "SUM_TIMER_WRITE_ALLOW_WRITE")
    private Long sumTimerWriteAllowWrite;

    @Column(name = "MIN_TIMER_WRITE_ALLOW_WRITE")
    private Long minTimerWriteAllowWrite;

    @Column(name = "AVG_TIMER_WRITE_ALLOW_WRITE")
    private Long avgTimerWriteAllowWrite;

    @Column(name = "MAX_TIMER_WRITE_ALLOW_WRITE")
    private Long maxTimerWriteAllowWrite;

    @Column(name = "COUNT_WRITE_CONCURRENT_INSERT")
    private Long countWriteConcurrentInsert;

    @Column(name = "SUM_TIMER_WRITE_CONCURRENT_INSERT")
    private Long sumTimerWriteConcurrentInsert;

    @Column(name = "MIN_TIMER_WRITE_CONCURRENT_INSERT")
    private Long minTimerWriteConcurrentInsert;

    @Column(name = "AVG_TIMER_WRITE_CONCURRENT_INSERT")
    private Long avgTimerWriteConcurrentInsert;

    @Column(name = "MAX_TIMER_WRITE_CONCURRENT_INSERT")
    private Long maxTimerWriteConcurrentInsert;

    @Column(name = "COUNT_WRITE_LOW_PRIORITY")
    private Long countWriteLowPriority;

    @Column(name = "SUM_TIMER_WRITE_LOW_PRIORITY")
    private Long sumTimerWriteLowPriority;

    @Column(name = "MIN_TIMER_WRITE_LOW_PRIORITY")
    private Long minTimerWriteLowPriority;

    @Column(name = "AVG_TIMER_WRITE_LOW_PRIORITY")
    private Long avgTimerWriteLowPriority;

    @Column(name = "MAX_TIMER_WRITE_LOW_PRIORITY")
    private Long maxTimerWriteLowPriority;

    @Column(name = "COUNT_WRITE_NORMAL")
    private Long countWriteNormal;

    @Column(name = "SUM_TIMER_WRITE_NORMAL")
    private Long sumTimerWriteNormal;

    @Column(name = "MIN_TIMER_WRITE_NORMAL")
    private Long minTimerWriteNormal;

    @Column(name = "AVG_TIMER_WRITE_NORMAL")
    private Long avgTimerWriteNormal;

    @Column(name = "MAX_TIMER_WRITE_NORMAL")
    private Long maxTimerWriteNormal;

    @Column(name = "COUNT_WRITE_EXTERNAL")
    private Long countWriteExternal;

    @Column(name = "SUM_TIMER_WRITE_EXTERNAL")
    private Long sumTimerWriteExternal;

    @Column(name = "MIN_TIMER_WRITE_EXTERNAL")
    private Long minTimerWriteExternal;

    @Column(name = "AVG_TIMER_WRITE_EXTERNAL")
    private Long avgTimerWriteExternal;

    @Column(name = "MAX_TIMER_WRITE_EXTERNAL")
    private Long maxTimerWriteExternal;

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
     * @return COUNT_READ_NORMAL
     */
    public Long getCountReadNormal() {
        return countReadNormal;
    }

    /**
     * @param countReadNormal
     */
    public void setCountReadNormal(Long countReadNormal) {
        this.countReadNormal = countReadNormal;
    }

    /**
     * @return SUM_TIMER_READ_NORMAL
     */
    public Long getSumTimerReadNormal() {
        return sumTimerReadNormal;
    }

    /**
     * @param sumTimerReadNormal
     */
    public void setSumTimerReadNormal(Long sumTimerReadNormal) {
        this.sumTimerReadNormal = sumTimerReadNormal;
    }

    /**
     * @return MIN_TIMER_READ_NORMAL
     */
    public Long getMinTimerReadNormal() {
        return minTimerReadNormal;
    }

    /**
     * @param minTimerReadNormal
     */
    public void setMinTimerReadNormal(Long minTimerReadNormal) {
        this.minTimerReadNormal = minTimerReadNormal;
    }

    /**
     * @return AVG_TIMER_READ_NORMAL
     */
    public Long getAvgTimerReadNormal() {
        return avgTimerReadNormal;
    }

    /**
     * @param avgTimerReadNormal
     */
    public void setAvgTimerReadNormal(Long avgTimerReadNormal) {
        this.avgTimerReadNormal = avgTimerReadNormal;
    }

    /**
     * @return MAX_TIMER_READ_NORMAL
     */
    public Long getMaxTimerReadNormal() {
        return maxTimerReadNormal;
    }

    /**
     * @param maxTimerReadNormal
     */
    public void setMaxTimerReadNormal(Long maxTimerReadNormal) {
        this.maxTimerReadNormal = maxTimerReadNormal;
    }

    /**
     * @return COUNT_READ_WITH_SHARED_LOCKS
     */
    public Long getCountReadWithSharedLocks() {
        return countReadWithSharedLocks;
    }

    /**
     * @param countReadWithSharedLocks
     */
    public void setCountReadWithSharedLocks(Long countReadWithSharedLocks) {
        this.countReadWithSharedLocks = countReadWithSharedLocks;
    }

    /**
     * @return SUM_TIMER_READ_WITH_SHARED_LOCKS
     */
    public Long getSumTimerReadWithSharedLocks() {
        return sumTimerReadWithSharedLocks;
    }

    /**
     * @param sumTimerReadWithSharedLocks
     */
    public void setSumTimerReadWithSharedLocks(Long sumTimerReadWithSharedLocks) {
        this.sumTimerReadWithSharedLocks = sumTimerReadWithSharedLocks;
    }

    /**
     * @return MIN_TIMER_READ_WITH_SHARED_LOCKS
     */
    public Long getMinTimerReadWithSharedLocks() {
        return minTimerReadWithSharedLocks;
    }

    /**
     * @param minTimerReadWithSharedLocks
     */
    public void setMinTimerReadWithSharedLocks(Long minTimerReadWithSharedLocks) {
        this.minTimerReadWithSharedLocks = minTimerReadWithSharedLocks;
    }

    /**
     * @return AVG_TIMER_READ_WITH_SHARED_LOCKS
     */
    public Long getAvgTimerReadWithSharedLocks() {
        return avgTimerReadWithSharedLocks;
    }

    /**
     * @param avgTimerReadWithSharedLocks
     */
    public void setAvgTimerReadWithSharedLocks(Long avgTimerReadWithSharedLocks) {
        this.avgTimerReadWithSharedLocks = avgTimerReadWithSharedLocks;
    }

    /**
     * @return MAX_TIMER_READ_WITH_SHARED_LOCKS
     */
    public Long getMaxTimerReadWithSharedLocks() {
        return maxTimerReadWithSharedLocks;
    }

    /**
     * @param maxTimerReadWithSharedLocks
     */
    public void setMaxTimerReadWithSharedLocks(Long maxTimerReadWithSharedLocks) {
        this.maxTimerReadWithSharedLocks = maxTimerReadWithSharedLocks;
    }

    /**
     * @return COUNT_READ_HIGH_PRIORITY
     */
    public Long getCountReadHighPriority() {
        return countReadHighPriority;
    }

    /**
     * @param countReadHighPriority
     */
    public void setCountReadHighPriority(Long countReadHighPriority) {
        this.countReadHighPriority = countReadHighPriority;
    }

    /**
     * @return SUM_TIMER_READ_HIGH_PRIORITY
     */
    public Long getSumTimerReadHighPriority() {
        return sumTimerReadHighPriority;
    }

    /**
     * @param sumTimerReadHighPriority
     */
    public void setSumTimerReadHighPriority(Long sumTimerReadHighPriority) {
        this.sumTimerReadHighPriority = sumTimerReadHighPriority;
    }

    /**
     * @return MIN_TIMER_READ_HIGH_PRIORITY
     */
    public Long getMinTimerReadHighPriority() {
        return minTimerReadHighPriority;
    }

    /**
     * @param minTimerReadHighPriority
     */
    public void setMinTimerReadHighPriority(Long minTimerReadHighPriority) {
        this.minTimerReadHighPriority = minTimerReadHighPriority;
    }

    /**
     * @return AVG_TIMER_READ_HIGH_PRIORITY
     */
    public Long getAvgTimerReadHighPriority() {
        return avgTimerReadHighPriority;
    }

    /**
     * @param avgTimerReadHighPriority
     */
    public void setAvgTimerReadHighPriority(Long avgTimerReadHighPriority) {
        this.avgTimerReadHighPriority = avgTimerReadHighPriority;
    }

    /**
     * @return MAX_TIMER_READ_HIGH_PRIORITY
     */
    public Long getMaxTimerReadHighPriority() {
        return maxTimerReadHighPriority;
    }

    /**
     * @param maxTimerReadHighPriority
     */
    public void setMaxTimerReadHighPriority(Long maxTimerReadHighPriority) {
        this.maxTimerReadHighPriority = maxTimerReadHighPriority;
    }

    /**
     * @return COUNT_READ_NO_INSERT
     */
    public Long getCountReadNoInsert() {
        return countReadNoInsert;
    }

    /**
     * @param countReadNoInsert
     */
    public void setCountReadNoInsert(Long countReadNoInsert) {
        this.countReadNoInsert = countReadNoInsert;
    }

    /**
     * @return SUM_TIMER_READ_NO_INSERT
     */
    public Long getSumTimerReadNoInsert() {
        return sumTimerReadNoInsert;
    }

    /**
     * @param sumTimerReadNoInsert
     */
    public void setSumTimerReadNoInsert(Long sumTimerReadNoInsert) {
        this.sumTimerReadNoInsert = sumTimerReadNoInsert;
    }

    /**
     * @return MIN_TIMER_READ_NO_INSERT
     */
    public Long getMinTimerReadNoInsert() {
        return minTimerReadNoInsert;
    }

    /**
     * @param minTimerReadNoInsert
     */
    public void setMinTimerReadNoInsert(Long minTimerReadNoInsert) {
        this.minTimerReadNoInsert = minTimerReadNoInsert;
    }

    /**
     * @return AVG_TIMER_READ_NO_INSERT
     */
    public Long getAvgTimerReadNoInsert() {
        return avgTimerReadNoInsert;
    }

    /**
     * @param avgTimerReadNoInsert
     */
    public void setAvgTimerReadNoInsert(Long avgTimerReadNoInsert) {
        this.avgTimerReadNoInsert = avgTimerReadNoInsert;
    }

    /**
     * @return MAX_TIMER_READ_NO_INSERT
     */
    public Long getMaxTimerReadNoInsert() {
        return maxTimerReadNoInsert;
    }

    /**
     * @param maxTimerReadNoInsert
     */
    public void setMaxTimerReadNoInsert(Long maxTimerReadNoInsert) {
        this.maxTimerReadNoInsert = maxTimerReadNoInsert;
    }

    /**
     * @return COUNT_READ_EXTERNAL
     */
    public Long getCountReadExternal() {
        return countReadExternal;
    }

    /**
     * @param countReadExternal
     */
    public void setCountReadExternal(Long countReadExternal) {
        this.countReadExternal = countReadExternal;
    }

    /**
     * @return SUM_TIMER_READ_EXTERNAL
     */
    public Long getSumTimerReadExternal() {
        return sumTimerReadExternal;
    }

    /**
     * @param sumTimerReadExternal
     */
    public void setSumTimerReadExternal(Long sumTimerReadExternal) {
        this.sumTimerReadExternal = sumTimerReadExternal;
    }

    /**
     * @return MIN_TIMER_READ_EXTERNAL
     */
    public Long getMinTimerReadExternal() {
        return minTimerReadExternal;
    }

    /**
     * @param minTimerReadExternal
     */
    public void setMinTimerReadExternal(Long minTimerReadExternal) {
        this.minTimerReadExternal = minTimerReadExternal;
    }

    /**
     * @return AVG_TIMER_READ_EXTERNAL
     */
    public Long getAvgTimerReadExternal() {
        return avgTimerReadExternal;
    }

    /**
     * @param avgTimerReadExternal
     */
    public void setAvgTimerReadExternal(Long avgTimerReadExternal) {
        this.avgTimerReadExternal = avgTimerReadExternal;
    }

    /**
     * @return MAX_TIMER_READ_EXTERNAL
     */
    public Long getMaxTimerReadExternal() {
        return maxTimerReadExternal;
    }

    /**
     * @param maxTimerReadExternal
     */
    public void setMaxTimerReadExternal(Long maxTimerReadExternal) {
        this.maxTimerReadExternal = maxTimerReadExternal;
    }

    /**
     * @return COUNT_WRITE_ALLOW_WRITE
     */
    public Long getCountWriteAllowWrite() {
        return countWriteAllowWrite;
    }

    /**
     * @param countWriteAllowWrite
     */
    public void setCountWriteAllowWrite(Long countWriteAllowWrite) {
        this.countWriteAllowWrite = countWriteAllowWrite;
    }

    /**
     * @return SUM_TIMER_WRITE_ALLOW_WRITE
     */
    public Long getSumTimerWriteAllowWrite() {
        return sumTimerWriteAllowWrite;
    }

    /**
     * @param sumTimerWriteAllowWrite
     */
    public void setSumTimerWriteAllowWrite(Long sumTimerWriteAllowWrite) {
        this.sumTimerWriteAllowWrite = sumTimerWriteAllowWrite;
    }

    /**
     * @return MIN_TIMER_WRITE_ALLOW_WRITE
     */
    public Long getMinTimerWriteAllowWrite() {
        return minTimerWriteAllowWrite;
    }

    /**
     * @param minTimerWriteAllowWrite
     */
    public void setMinTimerWriteAllowWrite(Long minTimerWriteAllowWrite) {
        this.minTimerWriteAllowWrite = minTimerWriteAllowWrite;
    }

    /**
     * @return AVG_TIMER_WRITE_ALLOW_WRITE
     */
    public Long getAvgTimerWriteAllowWrite() {
        return avgTimerWriteAllowWrite;
    }

    /**
     * @param avgTimerWriteAllowWrite
     */
    public void setAvgTimerWriteAllowWrite(Long avgTimerWriteAllowWrite) {
        this.avgTimerWriteAllowWrite = avgTimerWriteAllowWrite;
    }

    /**
     * @return MAX_TIMER_WRITE_ALLOW_WRITE
     */
    public Long getMaxTimerWriteAllowWrite() {
        return maxTimerWriteAllowWrite;
    }

    /**
     * @param maxTimerWriteAllowWrite
     */
    public void setMaxTimerWriteAllowWrite(Long maxTimerWriteAllowWrite) {
        this.maxTimerWriteAllowWrite = maxTimerWriteAllowWrite;
    }

    /**
     * @return COUNT_WRITE_CONCURRENT_INSERT
     */
    public Long getCountWriteConcurrentInsert() {
        return countWriteConcurrentInsert;
    }

    /**
     * @param countWriteConcurrentInsert
     */
    public void setCountWriteConcurrentInsert(Long countWriteConcurrentInsert) {
        this.countWriteConcurrentInsert = countWriteConcurrentInsert;
    }

    /**
     * @return SUM_TIMER_WRITE_CONCURRENT_INSERT
     */
    public Long getSumTimerWriteConcurrentInsert() {
        return sumTimerWriteConcurrentInsert;
    }

    /**
     * @param sumTimerWriteConcurrentInsert
     */
    public void setSumTimerWriteConcurrentInsert(Long sumTimerWriteConcurrentInsert) {
        this.sumTimerWriteConcurrentInsert = sumTimerWriteConcurrentInsert;
    }

    /**
     * @return MIN_TIMER_WRITE_CONCURRENT_INSERT
     */
    public Long getMinTimerWriteConcurrentInsert() {
        return minTimerWriteConcurrentInsert;
    }

    /**
     * @param minTimerWriteConcurrentInsert
     */
    public void setMinTimerWriteConcurrentInsert(Long minTimerWriteConcurrentInsert) {
        this.minTimerWriteConcurrentInsert = minTimerWriteConcurrentInsert;
    }

    /**
     * @return AVG_TIMER_WRITE_CONCURRENT_INSERT
     */
    public Long getAvgTimerWriteConcurrentInsert() {
        return avgTimerWriteConcurrentInsert;
    }

    /**
     * @param avgTimerWriteConcurrentInsert
     */
    public void setAvgTimerWriteConcurrentInsert(Long avgTimerWriteConcurrentInsert) {
        this.avgTimerWriteConcurrentInsert = avgTimerWriteConcurrentInsert;
    }

    /**
     * @return MAX_TIMER_WRITE_CONCURRENT_INSERT
     */
    public Long getMaxTimerWriteConcurrentInsert() {
        return maxTimerWriteConcurrentInsert;
    }

    /**
     * @param maxTimerWriteConcurrentInsert
     */
    public void setMaxTimerWriteConcurrentInsert(Long maxTimerWriteConcurrentInsert) {
        this.maxTimerWriteConcurrentInsert = maxTimerWriteConcurrentInsert;
    }

    /**
     * @return COUNT_WRITE_LOW_PRIORITY
     */
    public Long getCountWriteLowPriority() {
        return countWriteLowPriority;
    }

    /**
     * @param countWriteLowPriority
     */
    public void setCountWriteLowPriority(Long countWriteLowPriority) {
        this.countWriteLowPriority = countWriteLowPriority;
    }

    /**
     * @return SUM_TIMER_WRITE_LOW_PRIORITY
     */
    public Long getSumTimerWriteLowPriority() {
        return sumTimerWriteLowPriority;
    }

    /**
     * @param sumTimerWriteLowPriority
     */
    public void setSumTimerWriteLowPriority(Long sumTimerWriteLowPriority) {
        this.sumTimerWriteLowPriority = sumTimerWriteLowPriority;
    }

    /**
     * @return MIN_TIMER_WRITE_LOW_PRIORITY
     */
    public Long getMinTimerWriteLowPriority() {
        return minTimerWriteLowPriority;
    }

    /**
     * @param minTimerWriteLowPriority
     */
    public void setMinTimerWriteLowPriority(Long minTimerWriteLowPriority) {
        this.minTimerWriteLowPriority = minTimerWriteLowPriority;
    }

    /**
     * @return AVG_TIMER_WRITE_LOW_PRIORITY
     */
    public Long getAvgTimerWriteLowPriority() {
        return avgTimerWriteLowPriority;
    }

    /**
     * @param avgTimerWriteLowPriority
     */
    public void setAvgTimerWriteLowPriority(Long avgTimerWriteLowPriority) {
        this.avgTimerWriteLowPriority = avgTimerWriteLowPriority;
    }

    /**
     * @return MAX_TIMER_WRITE_LOW_PRIORITY
     */
    public Long getMaxTimerWriteLowPriority() {
        return maxTimerWriteLowPriority;
    }

    /**
     * @param maxTimerWriteLowPriority
     */
    public void setMaxTimerWriteLowPriority(Long maxTimerWriteLowPriority) {
        this.maxTimerWriteLowPriority = maxTimerWriteLowPriority;
    }

    /**
     * @return COUNT_WRITE_NORMAL
     */
    public Long getCountWriteNormal() {
        return countWriteNormal;
    }

    /**
     * @param countWriteNormal
     */
    public void setCountWriteNormal(Long countWriteNormal) {
        this.countWriteNormal = countWriteNormal;
    }

    /**
     * @return SUM_TIMER_WRITE_NORMAL
     */
    public Long getSumTimerWriteNormal() {
        return sumTimerWriteNormal;
    }

    /**
     * @param sumTimerWriteNormal
     */
    public void setSumTimerWriteNormal(Long sumTimerWriteNormal) {
        this.sumTimerWriteNormal = sumTimerWriteNormal;
    }

    /**
     * @return MIN_TIMER_WRITE_NORMAL
     */
    public Long getMinTimerWriteNormal() {
        return minTimerWriteNormal;
    }

    /**
     * @param minTimerWriteNormal
     */
    public void setMinTimerWriteNormal(Long minTimerWriteNormal) {
        this.minTimerWriteNormal = minTimerWriteNormal;
    }

    /**
     * @return AVG_TIMER_WRITE_NORMAL
     */
    public Long getAvgTimerWriteNormal() {
        return avgTimerWriteNormal;
    }

    /**
     * @param avgTimerWriteNormal
     */
    public void setAvgTimerWriteNormal(Long avgTimerWriteNormal) {
        this.avgTimerWriteNormal = avgTimerWriteNormal;
    }

    /**
     * @return MAX_TIMER_WRITE_NORMAL
     */
    public Long getMaxTimerWriteNormal() {
        return maxTimerWriteNormal;
    }

    /**
     * @param maxTimerWriteNormal
     */
    public void setMaxTimerWriteNormal(Long maxTimerWriteNormal) {
        this.maxTimerWriteNormal = maxTimerWriteNormal;
    }

    /**
     * @return COUNT_WRITE_EXTERNAL
     */
    public Long getCountWriteExternal() {
        return countWriteExternal;
    }

    /**
     * @param countWriteExternal
     */
    public void setCountWriteExternal(Long countWriteExternal) {
        this.countWriteExternal = countWriteExternal;
    }

    /**
     * @return SUM_TIMER_WRITE_EXTERNAL
     */
    public Long getSumTimerWriteExternal() {
        return sumTimerWriteExternal;
    }

    /**
     * @param sumTimerWriteExternal
     */
    public void setSumTimerWriteExternal(Long sumTimerWriteExternal) {
        this.sumTimerWriteExternal = sumTimerWriteExternal;
    }

    /**
     * @return MIN_TIMER_WRITE_EXTERNAL
     */
    public Long getMinTimerWriteExternal() {
        return minTimerWriteExternal;
    }

    /**
     * @param minTimerWriteExternal
     */
    public void setMinTimerWriteExternal(Long minTimerWriteExternal) {
        this.minTimerWriteExternal = minTimerWriteExternal;
    }

    /**
     * @return AVG_TIMER_WRITE_EXTERNAL
     */
    public Long getAvgTimerWriteExternal() {
        return avgTimerWriteExternal;
    }

    /**
     * @param avgTimerWriteExternal
     */
    public void setAvgTimerWriteExternal(Long avgTimerWriteExternal) {
        this.avgTimerWriteExternal = avgTimerWriteExternal;
    }

    /**
     * @return MAX_TIMER_WRITE_EXTERNAL
     */
    public Long getMaxTimerWriteExternal() {
        return maxTimerWriteExternal;
    }

    /**
     * @param maxTimerWriteExternal
     */
    public void setMaxTimerWriteExternal(Long maxTimerWriteExternal) {
        this.maxTimerWriteExternal = maxTimerWriteExternal;
    }
}