package com.wz.domain;

import javax.persistence.*;

@Table(name = "data_locks")
public class DataLocks {
    @Id
    @Column(name = "ENGINE_LOCK_ID")
    private String engineLockId;

    @Id
    @Column(name = "ENGINE")
    private String engine;

    @Column(name = "ENGINE_TRANSACTION_ID")
    private Long engineTransactionId;

    @Column(name = "THREAD_ID")
    private Long threadId;

    @Column(name = "EVENT_ID")
    private Long eventId;

    @Column(name = "OBJECT_SCHEMA")
    private String objectSchema;

    @Column(name = "OBJECT_NAME")
    private String objectName;

    @Column(name = "PARTITION_NAME")
    private String partitionName;

    @Column(name = "SUBPARTITION_NAME")
    private String subpartitionName;

    @Column(name = "INDEX_NAME")
    private String indexName;

    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "LOCK_TYPE")
    private String lockType;

    @Column(name = "LOCK_MODE")
    private String lockMode;

    @Column(name = "LOCK_STATUS")
    private String lockStatus;

    @Column(name = "LOCK_DATA")
    private String lockData;

    /**
     * @return ENGINE_LOCK_ID
     */
    public String getEngineLockId() {
        return engineLockId;
    }

    /**
     * @param engineLockId
     */
    public void setEngineLockId(String engineLockId) {
        this.engineLockId = engineLockId;
    }

    /**
     * @return ENGINE
     */
    public String getEngine() {
        return engine;
    }

    /**
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * @return ENGINE_TRANSACTION_ID
     */
    public Long getEngineTransactionId() {
        return engineTransactionId;
    }

    /**
     * @param engineTransactionId
     */
    public void setEngineTransactionId(Long engineTransactionId) {
        this.engineTransactionId = engineTransactionId;
    }

    /**
     * @return THREAD_ID
     */
    public Long getThreadId() {
        return threadId;
    }

    /**
     * @param threadId
     */
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /**
     * @return EVENT_ID
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * @param eventId
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
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
     * @return PARTITION_NAME
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * @param partitionName
     */
    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    /**
     * @return SUBPARTITION_NAME
     */
    public String getSubpartitionName() {
        return subpartitionName;
    }

    /**
     * @param subpartitionName
     */
    public void setSubpartitionName(String subpartitionName) {
        this.subpartitionName = subpartitionName;
    }

    /**
     * @return INDEX_NAME
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * @param indexName
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * @return OBJECT_INSTANCE_BEGIN
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * @param objectInstanceBegin
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * @return LOCK_TYPE
     */
    public String getLockType() {
        return lockType;
    }

    /**
     * @param lockType
     */
    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    /**
     * @return LOCK_MODE
     */
    public String getLockMode() {
        return lockMode;
    }

    /**
     * @param lockMode
     */
    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    /**
     * @return LOCK_STATUS
     */
    public String getLockStatus() {
        return lockStatus;
    }

    /**
     * @param lockStatus
     */
    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    /**
     * @return LOCK_DATA
     */
    public String getLockData() {
        return lockData;
    }

    /**
     * @param lockData
     */
    public void setLockData(String lockData) {
        this.lockData = lockData;
    }
}