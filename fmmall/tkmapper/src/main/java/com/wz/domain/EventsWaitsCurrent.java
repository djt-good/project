package com.wz.domain;

import javax.persistence.*;

@Table(name = "events_waits_current")
public class EventsWaitsCurrent {
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

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "TIMER_START")
    private Long timerStart;

    @Column(name = "TIMER_END")
    private Long timerEnd;

    @Column(name = "TIMER_WAIT")
    private Long timerWait;

    @Column(name = "SPINS")
    private Integer spins;

    @Column(name = "OBJECT_SCHEMA")
    private String objectSchema;

    @Column(name = "OBJECT_NAME")
    private String objectName;

    @Column(name = "INDEX_NAME")
    private String indexName;

    @Column(name = "OBJECT_TYPE")
    private String objectType;

    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "NESTING_EVENT_ID")
    private Long nestingEventId;

    @Column(name = "NESTING_EVENT_TYPE")
    private String nestingEventType;

    @Column(name = "OPERATION")
    private String operation;

    @Column(name = "NUMBER_OF_BYTES")
    private Long numberOfBytes;

    @Column(name = "FLAGS")
    private Integer flags;

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
     * @return SPINS
     */
    public Integer getSpins() {
        return spins;
    }

    /**
     * @param spins
     */
    public void setSpins(Integer spins) {
        this.spins = spins;
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

    /**
     * @return OPERATION
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return NUMBER_OF_BYTES
     */
    public Long getNumberOfBytes() {
        return numberOfBytes;
    }

    /**
     * @param numberOfBytes
     */
    public void setNumberOfBytes(Long numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * @return FLAGS
     */
    public Integer getFlags() {
        return flags;
    }

    /**
     * @param flags
     */
    public void setFlags(Integer flags) {
        this.flags = flags;
    }
}