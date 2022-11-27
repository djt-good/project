package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "replication_applier_status_by_worker")
public class ReplicationApplierStatusByWorker {
    @Id
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Id
    @Column(name = "WORKER_ID")
    private Long workerId;

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

    @Column(name = "LAST_APPLIED_TRANSACTION")
    private String lastAppliedTransaction;

    @Column(name = "LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date lastAppliedTransactionOriginalCommitTimestamp;

    @Column(name = "LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date lastAppliedTransactionImmediateCommitTimestamp;

    @Column(name = "LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP")
    private Date lastAppliedTransactionStartApplyTimestamp;

    @Column(name = "LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP")
    private Date lastAppliedTransactionEndApplyTimestamp;

    @Column(name = "APPLYING_TRANSACTION")
    private String applyingTransaction;

    @Column(name = "APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date applyingTransactionOriginalCommitTimestamp;

    @Column(name = "APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date applyingTransactionImmediateCommitTimestamp;

    @Column(name = "APPLYING_TRANSACTION_START_APPLY_TIMESTAMP")
    private Date applyingTransactionStartApplyTimestamp;

    @Column(name = "LAST_APPLIED_TRANSACTION_RETRIES_COUNT")
    private Long lastAppliedTransactionRetriesCount;

    @Column(name = "LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER")
    private Integer lastAppliedTransactionLastTransientErrorNumber;

    @Column(name = "LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE")
    private String lastAppliedTransactionLastTransientErrorMessage;

    @Column(name = "LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP")
    private Date lastAppliedTransactionLastTransientErrorTimestamp;

    @Column(name = "APPLYING_TRANSACTION_RETRIES_COUNT")
    private Long applyingTransactionRetriesCount;

    @Column(name = "APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER")
    private Integer applyingTransactionLastTransientErrorNumber;

    @Column(name = "APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE")
    private String applyingTransactionLastTransientErrorMessage;

    @Column(name = "APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP")
    private Date applyingTransactionLastTransientErrorTimestamp;

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
     * @return WORKER_ID
     */
    public Long getWorkerId() {
        return workerId;
    }

    /**
     * @param workerId
     */
    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
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
     * @return LAST_APPLIED_TRANSACTION
     */
    public String getLastAppliedTransaction() {
        return lastAppliedTransaction;
    }

    /**
     * @param lastAppliedTransaction
     */
    public void setLastAppliedTransaction(String lastAppliedTransaction) {
        this.lastAppliedTransaction = lastAppliedTransaction;
    }

    /**
     * @return LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     */
    public Date getLastAppliedTransactionOriginalCommitTimestamp() {
        return lastAppliedTransactionOriginalCommitTimestamp;
    }

    /**
     * @param lastAppliedTransactionOriginalCommitTimestamp
     */
    public void setLastAppliedTransactionOriginalCommitTimestamp(Date lastAppliedTransactionOriginalCommitTimestamp) {
        this.lastAppliedTransactionOriginalCommitTimestamp = lastAppliedTransactionOriginalCommitTimestamp;
    }

    /**
     * @return LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     */
    public Date getLastAppliedTransactionImmediateCommitTimestamp() {
        return lastAppliedTransactionImmediateCommitTimestamp;
    }

    /**
     * @param lastAppliedTransactionImmediateCommitTimestamp
     */
    public void setLastAppliedTransactionImmediateCommitTimestamp(Date lastAppliedTransactionImmediateCommitTimestamp) {
        this.lastAppliedTransactionImmediateCommitTimestamp = lastAppliedTransactionImmediateCommitTimestamp;
    }

    /**
     * @return LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP
     */
    public Date getLastAppliedTransactionStartApplyTimestamp() {
        return lastAppliedTransactionStartApplyTimestamp;
    }

    /**
     * @param lastAppliedTransactionStartApplyTimestamp
     */
    public void setLastAppliedTransactionStartApplyTimestamp(Date lastAppliedTransactionStartApplyTimestamp) {
        this.lastAppliedTransactionStartApplyTimestamp = lastAppliedTransactionStartApplyTimestamp;
    }

    /**
     * @return LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP
     */
    public Date getLastAppliedTransactionEndApplyTimestamp() {
        return lastAppliedTransactionEndApplyTimestamp;
    }

    /**
     * @param lastAppliedTransactionEndApplyTimestamp
     */
    public void setLastAppliedTransactionEndApplyTimestamp(Date lastAppliedTransactionEndApplyTimestamp) {
        this.lastAppliedTransactionEndApplyTimestamp = lastAppliedTransactionEndApplyTimestamp;
    }

    /**
     * @return APPLYING_TRANSACTION
     */
    public String getApplyingTransaction() {
        return applyingTransaction;
    }

    /**
     * @param applyingTransaction
     */
    public void setApplyingTransaction(String applyingTransaction) {
        this.applyingTransaction = applyingTransaction;
    }

    /**
     * @return APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     */
    public Date getApplyingTransactionOriginalCommitTimestamp() {
        return applyingTransactionOriginalCommitTimestamp;
    }

    /**
     * @param applyingTransactionOriginalCommitTimestamp
     */
    public void setApplyingTransactionOriginalCommitTimestamp(Date applyingTransactionOriginalCommitTimestamp) {
        this.applyingTransactionOriginalCommitTimestamp = applyingTransactionOriginalCommitTimestamp;
    }

    /**
     * @return APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     */
    public Date getApplyingTransactionImmediateCommitTimestamp() {
        return applyingTransactionImmediateCommitTimestamp;
    }

    /**
     * @param applyingTransactionImmediateCommitTimestamp
     */
    public void setApplyingTransactionImmediateCommitTimestamp(Date applyingTransactionImmediateCommitTimestamp) {
        this.applyingTransactionImmediateCommitTimestamp = applyingTransactionImmediateCommitTimestamp;
    }

    /**
     * @return APPLYING_TRANSACTION_START_APPLY_TIMESTAMP
     */
    public Date getApplyingTransactionStartApplyTimestamp() {
        return applyingTransactionStartApplyTimestamp;
    }

    /**
     * @param applyingTransactionStartApplyTimestamp
     */
    public void setApplyingTransactionStartApplyTimestamp(Date applyingTransactionStartApplyTimestamp) {
        this.applyingTransactionStartApplyTimestamp = applyingTransactionStartApplyTimestamp;
    }

    /**
     * @return LAST_APPLIED_TRANSACTION_RETRIES_COUNT
     */
    public Long getLastAppliedTransactionRetriesCount() {
        return lastAppliedTransactionRetriesCount;
    }

    /**
     * @param lastAppliedTransactionRetriesCount
     */
    public void setLastAppliedTransactionRetriesCount(Long lastAppliedTransactionRetriesCount) {
        this.lastAppliedTransactionRetriesCount = lastAppliedTransactionRetriesCount;
    }

    /**
     * @return LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER
     */
    public Integer getLastAppliedTransactionLastTransientErrorNumber() {
        return lastAppliedTransactionLastTransientErrorNumber;
    }

    /**
     * @param lastAppliedTransactionLastTransientErrorNumber
     */
    public void setLastAppliedTransactionLastTransientErrorNumber(Integer lastAppliedTransactionLastTransientErrorNumber) {
        this.lastAppliedTransactionLastTransientErrorNumber = lastAppliedTransactionLastTransientErrorNumber;
    }

    /**
     * @return LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE
     */
    public String getLastAppliedTransactionLastTransientErrorMessage() {
        return lastAppliedTransactionLastTransientErrorMessage;
    }

    /**
     * @param lastAppliedTransactionLastTransientErrorMessage
     */
    public void setLastAppliedTransactionLastTransientErrorMessage(String lastAppliedTransactionLastTransientErrorMessage) {
        this.lastAppliedTransactionLastTransientErrorMessage = lastAppliedTransactionLastTransientErrorMessage;
    }

    /**
     * @return LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP
     */
    public Date getLastAppliedTransactionLastTransientErrorTimestamp() {
        return lastAppliedTransactionLastTransientErrorTimestamp;
    }

    /**
     * @param lastAppliedTransactionLastTransientErrorTimestamp
     */
    public void setLastAppliedTransactionLastTransientErrorTimestamp(Date lastAppliedTransactionLastTransientErrorTimestamp) {
        this.lastAppliedTransactionLastTransientErrorTimestamp = lastAppliedTransactionLastTransientErrorTimestamp;
    }

    /**
     * @return APPLYING_TRANSACTION_RETRIES_COUNT
     */
    public Long getApplyingTransactionRetriesCount() {
        return applyingTransactionRetriesCount;
    }

    /**
     * @param applyingTransactionRetriesCount
     */
    public void setApplyingTransactionRetriesCount(Long applyingTransactionRetriesCount) {
        this.applyingTransactionRetriesCount = applyingTransactionRetriesCount;
    }

    /**
     * @return APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER
     */
    public Integer getApplyingTransactionLastTransientErrorNumber() {
        return applyingTransactionLastTransientErrorNumber;
    }

    /**
     * @param applyingTransactionLastTransientErrorNumber
     */
    public void setApplyingTransactionLastTransientErrorNumber(Integer applyingTransactionLastTransientErrorNumber) {
        this.applyingTransactionLastTransientErrorNumber = applyingTransactionLastTransientErrorNumber;
    }

    /**
     * @return APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE
     */
    public String getApplyingTransactionLastTransientErrorMessage() {
        return applyingTransactionLastTransientErrorMessage;
    }

    /**
     * @param applyingTransactionLastTransientErrorMessage
     */
    public void setApplyingTransactionLastTransientErrorMessage(String applyingTransactionLastTransientErrorMessage) {
        this.applyingTransactionLastTransientErrorMessage = applyingTransactionLastTransientErrorMessage;
    }

    /**
     * @return APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP
     */
    public Date getApplyingTransactionLastTransientErrorTimestamp() {
        return applyingTransactionLastTransientErrorTimestamp;
    }

    /**
     * @param applyingTransactionLastTransientErrorTimestamp
     */
    public void setApplyingTransactionLastTransientErrorTimestamp(Date applyingTransactionLastTransientErrorTimestamp) {
        this.applyingTransactionLastTransientErrorTimestamp = applyingTransactionLastTransientErrorTimestamp;
    }
}