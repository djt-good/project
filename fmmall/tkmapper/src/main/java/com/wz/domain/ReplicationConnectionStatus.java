package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "replication_connection_status")
public class ReplicationConnectionStatus {
    @Id
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "SOURCE_UUID")
    private String sourceUuid;

    @Column(name = "THREAD_ID")
    private Long threadId;

    @Column(name = "SERVICE_STATE")
    private String serviceState;

    @Column(name = "COUNT_RECEIVED_HEARTBEATS")
    private Long countReceivedHeartbeats;

    /**
     * Shows when the most recent heartbeat signal was received.
     */
    @Column(name = "LAST_HEARTBEAT_TIMESTAMP")
    private Date lastHeartbeatTimestamp;

    @Column(name = "LAST_ERROR_NUMBER")
    private Integer lastErrorNumber;

    @Column(name = "LAST_ERROR_MESSAGE")
    private String lastErrorMessage;

    @Column(name = "LAST_ERROR_TIMESTAMP")
    private Date lastErrorTimestamp;

    @Column(name = "LAST_QUEUED_TRANSACTION")
    private String lastQueuedTransaction;

    @Column(name = "LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date lastQueuedTransactionOriginalCommitTimestamp;

    @Column(name = "LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date lastQueuedTransactionImmediateCommitTimestamp;

    @Column(name = "LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP")
    private Date lastQueuedTransactionStartQueueTimestamp;

    @Column(name = "LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP")
    private Date lastQueuedTransactionEndQueueTimestamp;

    @Column(name = "QUEUEING_TRANSACTION")
    private String queueingTransaction;

    @Column(name = "QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date queueingTransactionOriginalCommitTimestamp;

    @Column(name = "QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date queueingTransactionImmediateCommitTimestamp;

    @Column(name = "QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP")
    private Date queueingTransactionStartQueueTimestamp;

    @Column(name = "RECEIVED_TRANSACTION_SET")
    private String receivedTransactionSet;

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
     * @return GROUP_NAME
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return SOURCE_UUID
     */
    public String getSourceUuid() {
        return sourceUuid;
    }

    /**
     * @param sourceUuid
     */
    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid;
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
     * @return COUNT_RECEIVED_HEARTBEATS
     */
    public Long getCountReceivedHeartbeats() {
        return countReceivedHeartbeats;
    }

    /**
     * @param countReceivedHeartbeats
     */
    public void setCountReceivedHeartbeats(Long countReceivedHeartbeats) {
        this.countReceivedHeartbeats = countReceivedHeartbeats;
    }

    /**
     * 获取Shows when the most recent heartbeat signal was received.
     *
     * @return LAST_HEARTBEAT_TIMESTAMP - Shows when the most recent heartbeat signal was received.
     */
    public Date getLastHeartbeatTimestamp() {
        return lastHeartbeatTimestamp;
    }

    /**
     * 设置Shows when the most recent heartbeat signal was received.
     *
     * @param lastHeartbeatTimestamp Shows when the most recent heartbeat signal was received.
     */
    public void setLastHeartbeatTimestamp(Date lastHeartbeatTimestamp) {
        this.lastHeartbeatTimestamp = lastHeartbeatTimestamp;
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
     * @return LAST_QUEUED_TRANSACTION
     */
    public String getLastQueuedTransaction() {
        return lastQueuedTransaction;
    }

    /**
     * @param lastQueuedTransaction
     */
    public void setLastQueuedTransaction(String lastQueuedTransaction) {
        this.lastQueuedTransaction = lastQueuedTransaction;
    }

    /**
     * @return LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     */
    public Date getLastQueuedTransactionOriginalCommitTimestamp() {
        return lastQueuedTransactionOriginalCommitTimestamp;
    }

    /**
     * @param lastQueuedTransactionOriginalCommitTimestamp
     */
    public void setLastQueuedTransactionOriginalCommitTimestamp(Date lastQueuedTransactionOriginalCommitTimestamp) {
        this.lastQueuedTransactionOriginalCommitTimestamp = lastQueuedTransactionOriginalCommitTimestamp;
    }

    /**
     * @return LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     */
    public Date getLastQueuedTransactionImmediateCommitTimestamp() {
        return lastQueuedTransactionImmediateCommitTimestamp;
    }

    /**
     * @param lastQueuedTransactionImmediateCommitTimestamp
     */
    public void setLastQueuedTransactionImmediateCommitTimestamp(Date lastQueuedTransactionImmediateCommitTimestamp) {
        this.lastQueuedTransactionImmediateCommitTimestamp = lastQueuedTransactionImmediateCommitTimestamp;
    }

    /**
     * @return LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP
     */
    public Date getLastQueuedTransactionStartQueueTimestamp() {
        return lastQueuedTransactionStartQueueTimestamp;
    }

    /**
     * @param lastQueuedTransactionStartQueueTimestamp
     */
    public void setLastQueuedTransactionStartQueueTimestamp(Date lastQueuedTransactionStartQueueTimestamp) {
        this.lastQueuedTransactionStartQueueTimestamp = lastQueuedTransactionStartQueueTimestamp;
    }

    /**
     * @return LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP
     */
    public Date getLastQueuedTransactionEndQueueTimestamp() {
        return lastQueuedTransactionEndQueueTimestamp;
    }

    /**
     * @param lastQueuedTransactionEndQueueTimestamp
     */
    public void setLastQueuedTransactionEndQueueTimestamp(Date lastQueuedTransactionEndQueueTimestamp) {
        this.lastQueuedTransactionEndQueueTimestamp = lastQueuedTransactionEndQueueTimestamp;
    }

    /**
     * @return QUEUEING_TRANSACTION
     */
    public String getQueueingTransaction() {
        return queueingTransaction;
    }

    /**
     * @param queueingTransaction
     */
    public void setQueueingTransaction(String queueingTransaction) {
        this.queueingTransaction = queueingTransaction;
    }

    /**
     * @return QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     */
    public Date getQueueingTransactionOriginalCommitTimestamp() {
        return queueingTransactionOriginalCommitTimestamp;
    }

    /**
     * @param queueingTransactionOriginalCommitTimestamp
     */
    public void setQueueingTransactionOriginalCommitTimestamp(Date queueingTransactionOriginalCommitTimestamp) {
        this.queueingTransactionOriginalCommitTimestamp = queueingTransactionOriginalCommitTimestamp;
    }

    /**
     * @return QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     */
    public Date getQueueingTransactionImmediateCommitTimestamp() {
        return queueingTransactionImmediateCommitTimestamp;
    }

    /**
     * @param queueingTransactionImmediateCommitTimestamp
     */
    public void setQueueingTransactionImmediateCommitTimestamp(Date queueingTransactionImmediateCommitTimestamp) {
        this.queueingTransactionImmediateCommitTimestamp = queueingTransactionImmediateCommitTimestamp;
    }

    /**
     * @return QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP
     */
    public Date getQueueingTransactionStartQueueTimestamp() {
        return queueingTransactionStartQueueTimestamp;
    }

    /**
     * @param queueingTransactionStartQueueTimestamp
     */
    public void setQueueingTransactionStartQueueTimestamp(Date queueingTransactionStartQueueTimestamp) {
        this.queueingTransactionStartQueueTimestamp = queueingTransactionStartQueueTimestamp;
    }

    /**
     * @return RECEIVED_TRANSACTION_SET
     */
    public String getReceivedTransactionSet() {
        return receivedTransactionSet;
    }

    /**
     * @param receivedTransactionSet
     */
    public void setReceivedTransactionSet(String receivedTransactionSet) {
        this.receivedTransactionSet = receivedTransactionSet;
    }
}