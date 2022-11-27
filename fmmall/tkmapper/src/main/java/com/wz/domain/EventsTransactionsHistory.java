package com.wz.domain;

import javax.persistence.*;

@Table(name = "events_transactions_history")
public class EventsTransactionsHistory {
    @Id
    @Column(name = "THREAD_ID")
    private Long threadId;

    @Id
    @Column(name = "EVENT_ID")
    private Long eventId;

    @Column(name = "END_EVENT_ID")
    private Long endEventId;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "STATE")
    private String state;

    @Column(name = "TRX_ID")
    private Long trxId;

    @Column(name = "GTID")
    private String gtid;

    @Column(name = "XID_FORMAT_ID")
    private Integer xidFormatId;

    @Column(name = "XID_GTRID")
    private String xidGtrid;

    @Column(name = "XID_BQUAL")
    private String xidBqual;

    @Column(name = "XA_STATE")
    private String xaState;

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "TIMER_START")
    private Long timerStart;

    @Column(name = "TIMER_END")
    private Long timerEnd;

    @Column(name = "TIMER_WAIT")
    private Long timerWait;

    @Column(name = "ACCESS_MODE")
    private String accessMode;

    @Column(name = "ISOLATION_LEVEL")
    private String isolationLevel;

    @Column(name = "AUTOCOMMIT")
    private String autocommit;

    @Column(name = "NUMBER_OF_SAVEPOINTS")
    private Long numberOfSavepoints;

    @Column(name = "NUMBER_OF_ROLLBACK_TO_SAVEPOINT")
    private Long numberOfRollbackToSavepoint;

    @Column(name = "NUMBER_OF_RELEASE_SAVEPOINT")
    private Long numberOfReleaseSavepoint;

    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "NESTING_EVENT_ID")
    private Long nestingEventId;

    @Column(name = "NESTING_EVENT_TYPE")
    private String nestingEventType;

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
     * @return END_EVENT_ID
     */
    public Long getEndEventId() {
        return endEventId;
    }

    /**
     * @param endEventId
     */
    public void setEndEventId(Long endEventId) {
        this.endEventId = endEventId;
    }

    /**
     * @return EVENT_NAME
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return TRX_ID
     */
    public Long getTrxId() {
        return trxId;
    }

    /**
     * @param trxId
     */
    public void setTrxId(Long trxId) {
        this.trxId = trxId;
    }

    /**
     * @return GTID
     */
    public String getGtid() {
        return gtid;
    }

    /**
     * @param gtid
     */
    public void setGtid(String gtid) {
        this.gtid = gtid;
    }

    /**
     * @return XID_FORMAT_ID
     */
    public Integer getXidFormatId() {
        return xidFormatId;
    }

    /**
     * @param xidFormatId
     */
    public void setXidFormatId(Integer xidFormatId) {
        this.xidFormatId = xidFormatId;
    }

    /**
     * @return XID_GTRID
     */
    public String getXidGtrid() {
        return xidGtrid;
    }

    /**
     * @param xidGtrid
     */
    public void setXidGtrid(String xidGtrid) {
        this.xidGtrid = xidGtrid;
    }

    /**
     * @return XID_BQUAL
     */
    public String getXidBqual() {
        return xidBqual;
    }

    /**
     * @param xidBqual
     */
    public void setXidBqual(String xidBqual) {
        this.xidBqual = xidBqual;
    }

    /**
     * @return XA_STATE
     */
    public String getXaState() {
        return xaState;
    }

    /**
     * @param xaState
     */
    public void setXaState(String xaState) {
        this.xaState = xaState;
    }

    /**
     * @return SOURCE
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return TIMER_START
     */
    public Long getTimerStart() {
        return timerStart;
    }

    /**
     * @param timerStart
     */
    public void setTimerStart(Long timerStart) {
        this.timerStart = timerStart;
    }

    /**
     * @return TIMER_END
     */
    public Long getTimerEnd() {
        return timerEnd;
    }

    /**
     * @param timerEnd
     */
    public void setTimerEnd(Long timerEnd) {
        this.timerEnd = timerEnd;
    }

    /**
     * @return TIMER_WAIT
     */
    public Long getTimerWait() {
        return timerWait;
    }

    /**
     * @param timerWait
     */
    public void setTimerWait(Long timerWait) {
        this.timerWait = timerWait;
    }

    /**
     * @return ACCESS_MODE
     */
    public String getAccessMode() {
        return accessMode;
    }

    /**
     * @param accessMode
     */
    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    /**
     * @return ISOLATION_LEVEL
     */
    public String getIsolationLevel() {
        return isolationLevel;
    }

    /**
     * @param isolationLevel
     */
    public void setIsolationLevel(String isolationLevel) {
        this.isolationLevel = isolationLevel;
    }

    /**
     * @return AUTOCOMMIT
     */
    public String getAutocommit() {
        return autocommit;
    }

    /**
     * @param autocommit
     */
    public void setAutocommit(String autocommit) {
        this.autocommit = autocommit;
    }

    /**
     * @return NUMBER_OF_SAVEPOINTS
     */
    public Long getNumberOfSavepoints() {
        return numberOfSavepoints;
    }

    /**
     * @param numberOfSavepoints
     */
    public void setNumberOfSavepoints(Long numberOfSavepoints) {
        this.numberOfSavepoints = numberOfSavepoints;
    }

    /**
     * @return NUMBER_OF_ROLLBACK_TO_SAVEPOINT
     */
    public Long getNumberOfRollbackToSavepoint() {
        return numberOfRollbackToSavepoint;
    }

    /**
     * @param numberOfRollbackToSavepoint
     */
    public void setNumberOfRollbackToSavepoint(Long numberOfRollbackToSavepoint) {
        this.numberOfRollbackToSavepoint = numberOfRollbackToSavepoint;
    }

    /**
     * @return NUMBER_OF_RELEASE_SAVEPOINT
     */
    public Long getNumberOfReleaseSavepoint() {
        return numberOfReleaseSavepoint;
    }

    /**
     * @param numberOfReleaseSavepoint
     */
    public void setNumberOfReleaseSavepoint(Long numberOfReleaseSavepoint) {
        this.numberOfReleaseSavepoint = numberOfReleaseSavepoint;
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
     * @return NESTING_EVENT_ID
     */
    public Long getNestingEventId() {
        return nestingEventId;
    }

    /**
     * @param nestingEventId
     */
    public void setNestingEventId(Long nestingEventId) {
        this.nestingEventId = nestingEventId;
    }

    /**
     * @return NESTING_EVENT_TYPE
     */
    public String getNestingEventType() {
        return nestingEventType;
    }

    /**
     * @param nestingEventType
     */
    public void setNestingEventType(String nestingEventType) {
        this.nestingEventType = nestingEventType;
    }
}