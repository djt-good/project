package com.wz.domain;

import javax.persistence.*;

@Table(name = "data_lock_waits")
public class DataLockWaits {
    @Column(name = "ENGINE")
    private String engine;

    @Column(name = "REQUESTING_ENGINE_LOCK_ID")
    private String requestingEngineLockId;

    @Column(name = "REQUESTING_ENGINE_TRANSACTION_ID")
    private Long requestingEngineTransactionId;

    @Column(name = "REQUESTING_THREAD_ID")
    private Long requestingThreadId;

    @Column(name = "REQUESTING_EVENT_ID")
    private Long requestingEventId;

    @Column(name = "REQUESTING_OBJECT_INSTANCE_BEGIN")
    private Long requestingObjectInstanceBegin;

    @Column(name = "BLOCKING_ENGINE_LOCK_ID")
    private String blockingEngineLockId;

    @Column(name = "BLOCKING_ENGINE_TRANSACTION_ID")
    private Long blockingEngineTransactionId;

    @Column(name = "BLOCKING_THREAD_ID")
    private Long blockingThreadId;

    @Column(name = "BLOCKING_EVENT_ID")
    private Long blockingEventId;

    @Column(name = "BLOCKING_OBJECT_INSTANCE_BEGIN")
    private Long blockingObjectInstanceBegin;

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
     * @return REQUESTING_ENGINE_LOCK_ID
     */
    public String getRequestingEngineLockId() {
        return requestingEngineLockId;
    }

    /**
     * @param requestingEngineLockId
     */
    public void setRequestingEngineLockId(String requestingEngineLockId) {
        this.requestingEngineLockId = requestingEngineLockId;
    }

    /**
     * @return REQUESTING_ENGINE_TRANSACTION_ID
     */
    public Long getRequestingEngineTransactionId() {
        return requestingEngineTransactionId;
    }

    /**
     * @param requestingEngineTransactionId
     */
    public void setRequestingEngineTransactionId(Long requestingEngineTransactionId) {
        this.requestingEngineTransactionId = requestingEngineTransactionId;
    }

    /**
     * @return REQUESTING_THREAD_ID
     */
    public Long getRequestingThreadId() {
        return requestingThreadId;
    }

    /**
     * @param requestingThreadId
     */
    public void setRequestingThreadId(Long requestingThreadId) {
        this.requestingThreadId = requestingThreadId;
    }

    /**
     * @return REQUESTING_EVENT_ID
     */
    public Long getRequestingEventId() {
        return requestingEventId;
    }

    /**
     * @param requestingEventId
     */
    public void setRequestingEventId(Long requestingEventId) {
        this.requestingEventId = requestingEventId;
    }

    /**
     * @return REQUESTING_OBJECT_INSTANCE_BEGIN
     */
    public Long getRequestingObjectInstanceBegin() {
        return requestingObjectInstanceBegin;
    }

    /**
     * @param requestingObjectInstanceBegin
     */
    public void setRequestingObjectInstanceBegin(Long requestingObjectInstanceBegin) {
        this.requestingObjectInstanceBegin = requestingObjectInstanceBegin;
    }

    /**
     * @return BLOCKING_ENGINE_LOCK_ID
     */
    public String getBlockingEngineLockId() {
        return blockingEngineLockId;
    }

    /**
     * @param blockingEngineLockId
     */
    public void setBlockingEngineLockId(String blockingEngineLockId) {
        this.blockingEngineLockId = blockingEngineLockId;
    }

    /**
     * @return BLOCKING_ENGINE_TRANSACTION_ID
     */
    public Long getBlockingEngineTransactionId() {
        return blockingEngineTransactionId;
    }

    /**
     * @param blockingEngineTransactionId
     */
    public void setBlockingEngineTransactionId(Long blockingEngineTransactionId) {
        this.blockingEngineTransactionId = blockingEngineTransactionId;
    }

    /**
     * @return BLOCKING_THREAD_ID
     */
    public Long getBlockingThreadId() {
        return blockingThreadId;
    }

    /**
     * @param blockingThreadId
     */
    public void setBlockingThreadId(Long blockingThreadId) {
        this.blockingThreadId = blockingThreadId;
    }

    /**
     * @return BLOCKING_EVENT_ID
     */
    public Long getBlockingEventId() {
        return blockingEventId;
    }

    /**
     * @param blockingEventId
     */
    public void setBlockingEventId(Long blockingEventId) {
        this.blockingEventId = blockingEventId;
    }

    /**
     * @return BLOCKING_OBJECT_INSTANCE_BEGIN
     */
    public Long getBlockingObjectInstanceBegin() {
        return blockingObjectInstanceBegin;
    }

    /**
     * @param blockingObjectInstanceBegin
     */
    public void setBlockingObjectInstanceBegin(Long blockingObjectInstanceBegin) {
        this.blockingObjectInstanceBegin = blockingObjectInstanceBegin;
    }
}