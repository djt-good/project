package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "replication_applier_status_by_coordinator")
public class ReplicationApplierStatusByCoordinator {
    @Id
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "THREAD_ID")
    private Long threadId;

    @Column(name = "SERVICE_STATE")
    private String serviceState;

    @Column(name = "LAST_ERROR_NUMBER")
    private Integer lastErrorNumber;

    @Column(name = "LAST_ERROR_MESSAGE")
    private String lastErrorMessage;

    @Column(name = "LAST_ERROR_TIMESTAMP")
    private Date lastErrorTimestamp;

    @Column(name = "LAST_PROCESSED_TRANSACTION")
    private String lastProcessedTransaction;

    @Column(name = "LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date lastProcessedTransactionOriginalCommitTimestamp;

    @Column(name = "LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date lastProcessedTransactionImmediateCommitTimestamp;

    @Column(name = "LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP")
    private Date lastProcessedTransactionStartBufferTimestamp;

    @Column(name = "LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP")
    private Date lastProcessedTransactionEndBufferTimestamp;

    @Column(name = "PROCESSING_TRANSACTION")
    private String processingTransaction;

    @Column(name = "PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date processingTransactionOriginalCommitTimestamp;

    @Column(name = "PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date processingTransactionImmediateCommitTimestamp;

    @Column(name = "PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP")
    private Date processingTransactionStartBufferTimestamp;

    /**
     * @return CHANNEL_NAME
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @param channelName
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
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
     * @return SERVICE_STATE
     */
    public String getServiceState() {
        return serviceState;
    }

    /**
     * @param serviceState
     */
    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    /**
     * @return LAST_ERROR_NUMBER
     */
    public Integer getLastErrorNumber() {
        return lastErrorNumber;
    }

    /**
     * @param lastErrorNumber
     */
    public void setLastErrorNumber(Integer lastErrorNumber) {
        this.lastErrorNumber = lastErrorNumber;
    }

    /**
     * @return LAST_ERROR_MESSAGE
     */
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    /**
     * @param lastErrorMessage
     */
    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    /**
     * @return LAST_ERROR_TIMESTAMP
     */
    public Date getLastErrorTimestamp() {
        return lastErrorTimestamp;
    }

    /**
     * @param lastErrorTimestamp
     */
    public void setLastErrorTimestamp(Date lastErrorTimestamp) {
        this.lastErrorTimestamp = lastErrorTimestamp;
    }

    /**
     * @return LAST_PROCESSED_TRANSACTION
     */
    public String getLastProcessedTransaction() {
        return lastProcessedTransaction;
    }

    /**
     * @param lastProcessedTransaction
     */
    public void setLastProcessedTransaction(String lastProcessedTransaction) {
        this.lastProcessedTransaction = lastProcessedTransaction;
    }

    /**
     * @return LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     */
    public Date getLastProcessedTransactionOriginalCommitTimestamp() {
        return lastProcessedTransactionOriginalCommitTimestamp;
    }

    /**
     * @param lastProcessedTransactionOriginalCommitTimestamp
     */
    public void setLastProcessedTransactionOriginalCommitTimestamp(Date lastProcessedTransactionOriginalCommitTimestamp) {
        this.lastProcessedTransactionOriginalCommitTimestamp = lastProcessedTransactionOriginalCommitTimestamp;
    }

    /**
     * @return LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     */
    public Date getLastProcessedTransactionImmediateCommitTimestamp() {
        return lastProcessedTransactionImmediateCommitTimestamp;
    }

    /**
     * @param lastProcessedTransactionImmediateCommitTimestamp
     */
    public void setLastProcessedTransactionImmediateCommitTimestamp(Date lastProcessedTransactionImmediateCommitTimestamp) {
        this.lastProcessedTransactionImmediateCommitTimestamp = lastProcessedTransactionImmediateCommitTimestamp;
    }

    /**
     * @return LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     */
    public Date getLastProcessedTransactionStartBufferTimestamp() {
        return lastProcessedTransactionStartBufferTimestamp;
    }

    /**
     * @param lastProcessedTransactionStartBufferTimestamp
     */
    public void setLastProcessedTransactionStartBufferTimestamp(Date lastProcessedTransactionStartBufferTimestamp) {
        this.lastProcessedTransactionStartBufferTimestamp = lastProcessedTransactionStartBufferTimestamp;
    }

    /**
     * @return LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     */
    public Date getLastProcessedTransactionEndBufferTimestamp() {
        return lastProcessedTransactionEndBufferTimestamp;
    }

    /**
     * @param lastProcessedTransactionEndBufferTimestamp
     */
    public void setLastProcessedTransactionEndBufferTimestamp(Date lastProcessedTransactionEndBufferTimestamp) {
        this.lastProcessedTransactionEndBufferTimestamp = lastProcessedTransactionEndBufferTimestamp;
    }

    /**
     * @return PROCESSING_TRANSACTION
     */
    public String getProcessingTransaction() {
        return processingTransaction;
    }

    /**
     * @param processingTransaction
     */
    public void setProcessingTransaction(String processingTransaction) {
        this.processingTransaction = processingTransaction;
    }

    /**
     * @return PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     */
    public Date getProcessingTransactionOriginalCommitTimestamp() {
        return processingTransactionOriginalCommitTimestamp;
    }

    /**
     * @param processingTransactionOriginalCommitTimestamp
     */
    public void setProcessingTransactionOriginalCommitTimestamp(Date processingTransactionOriginalCommitTimestamp) {
        this.processingTransactionOriginalCommitTimestamp = processingTransactionOriginalCommitTimestamp;
    }

    /**
     * @return PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     */
    public Date getProcessingTransactionImmediateCommitTimestamp() {
        return processingTransactionImmediateCommitTimestamp;
    }

    /**
     * @param processingTransactionImmediateCommitTimestamp
     */
    public void setProcessingTransactionImmediateCommitTimestamp(Date processingTransactionImmediateCommitTimestamp) {
        this.processingTransactionImmediateCommitTimestamp = processingTransactionImmediateCommitTimestamp;
    }

    /**
     * @return PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     */
    public Date getProcessingTransactionStartBufferTimestamp() {
        return processingTransactionStartBufferTimestamp;
    }

    /**
     * @param processingTransactionStartBufferTimestamp
     */
    public void setProcessingTransactionStartBufferTimestamp(Date processingTransactionStartBufferTimestamp) {
        this.processingTransactionStartBufferTimestamp = processingTransactionStartBufferTimestamp;
    }
}