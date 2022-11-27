package com.wz.domain;

import javax.persistence.*;

@Table(name = "replication_group_member_stats")
public class ReplicationGroupMemberStats {
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "VIEW_ID")
    private String viewId;

    @Column(name = "MEMBER_ID")
    private String memberId;

    @Column(name = "COUNT_TRANSACTIONS_IN_QUEUE")
    private Long countTransactionsInQueue;

    @Column(name = "COUNT_TRANSACTIONS_CHECKED")
    private Long countTransactionsChecked;

    @Column(name = "COUNT_CONFLICTS_DETECTED")
    private Long countConflictsDetected;

    @Column(name = "COUNT_TRANSACTIONS_ROWS_VALIDATING")
    private Long countTransactionsRowsValidating;

    @Column(name = "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE")
    private Long countTransactionsRemoteInApplierQueue;

    @Column(name = "COUNT_TRANSACTIONS_REMOTE_APPLIED")
    private Long countTransactionsRemoteApplied;

    @Column(name = "COUNT_TRANSACTIONS_LOCAL_PROPOSED")
    private Long countTransactionsLocalProposed;

    @Column(name = "COUNT_TRANSACTIONS_LOCAL_ROLLBACK")
    private Long countTransactionsLocalRollback;

    @Column(name = "TRANSACTIONS_COMMITTED_ALL_MEMBERS")
    private String transactionsCommittedAllMembers;

    @Column(name = "LAST_CONFLICT_FREE_TRANSACTION")
    private String lastConflictFreeTransaction;

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
     * @return VIEW_ID
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * @param viewId
     */
    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    /**
     * @return MEMBER_ID
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * @return COUNT_TRANSACTIONS_IN_QUEUE
     */
    public Long getCountTransactionsInQueue() {
        return countTransactionsInQueue;
    }

    /**
     * @param countTransactionsInQueue
     */
    public void setCountTransactionsInQueue(Long countTransactionsInQueue) {
        this.countTransactionsInQueue = countTransactionsInQueue;
    }

    /**
     * @return COUNT_TRANSACTIONS_CHECKED
     */
    public Long getCountTransactionsChecked() {
        return countTransactionsChecked;
    }

    /**
     * @param countTransactionsChecked
     */
    public void setCountTransactionsChecked(Long countTransactionsChecked) {
        this.countTransactionsChecked = countTransactionsChecked;
    }

    /**
     * @return COUNT_CONFLICTS_DETECTED
     */
    public Long getCountConflictsDetected() {
        return countConflictsDetected;
    }

    /**
     * @param countConflictsDetected
     */
    public void setCountConflictsDetected(Long countConflictsDetected) {
        this.countConflictsDetected = countConflictsDetected;
    }

    /**
     * @return COUNT_TRANSACTIONS_ROWS_VALIDATING
     */
    public Long getCountTransactionsRowsValidating() {
        return countTransactionsRowsValidating;
    }

    /**
     * @param countTransactionsRowsValidating
     */
    public void setCountTransactionsRowsValidating(Long countTransactionsRowsValidating) {
        this.countTransactionsRowsValidating = countTransactionsRowsValidating;
    }

    /**
     * @return COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     */
    public Long getCountTransactionsRemoteInApplierQueue() {
        return countTransactionsRemoteInApplierQueue;
    }

    /**
     * @param countTransactionsRemoteInApplierQueue
     */
    public void setCountTransactionsRemoteInApplierQueue(Long countTransactionsRemoteInApplierQueue) {
        this.countTransactionsRemoteInApplierQueue = countTransactionsRemoteInApplierQueue;
    }

    /**
     * @return COUNT_TRANSACTIONS_REMOTE_APPLIED
     */
    public Long getCountTransactionsRemoteApplied() {
        return countTransactionsRemoteApplied;
    }

    /**
     * @param countTransactionsRemoteApplied
     */
    public void setCountTransactionsRemoteApplied(Long countTransactionsRemoteApplied) {
        this.countTransactionsRemoteApplied = countTransactionsRemoteApplied;
    }

    /**
     * @return COUNT_TRANSACTIONS_LOCAL_PROPOSED
     */
    public Long getCountTransactionsLocalProposed() {
        return countTransactionsLocalProposed;
    }

    /**
     * @param countTransactionsLocalProposed
     */
    public void setCountTransactionsLocalProposed(Long countTransactionsLocalProposed) {
        this.countTransactionsLocalProposed = countTransactionsLocalProposed;
    }

    /**
     * @return COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     */
    public Long getCountTransactionsLocalRollback() {
        return countTransactionsLocalRollback;
    }

    /**
     * @param countTransactionsLocalRollback
     */
    public void setCountTransactionsLocalRollback(Long countTransactionsLocalRollback) {
        this.countTransactionsLocalRollback = countTransactionsLocalRollback;
    }

    /**
     * @return TRANSACTIONS_COMMITTED_ALL_MEMBERS
     */
    public String getTransactionsCommittedAllMembers() {
        return transactionsCommittedAllMembers;
    }

    /**
     * @param transactionsCommittedAllMembers
     */
    public void setTransactionsCommittedAllMembers(String transactionsCommittedAllMembers) {
        this.transactionsCommittedAllMembers = transactionsCommittedAllMembers;
    }

    /**
     * @return LAST_CONFLICT_FREE_TRANSACTION
     */
    public String getLastConflictFreeTransaction() {
        return lastConflictFreeTransaction;
    }

    /**
     * @param lastConflictFreeTransaction
     */
    public void setLastConflictFreeTransaction(String lastConflictFreeTransaction) {
        this.lastConflictFreeTransaction = lastConflictFreeTransaction;
    }
}