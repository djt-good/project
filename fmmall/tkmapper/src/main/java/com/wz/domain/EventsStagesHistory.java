package com.wz.domain;

import javax.persistence.*;

@Table(name = "events_stages_history")
public class EventsStagesHistory {
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

    @Column(name = "WORK_COMPLETED")
    private Long workCompleted;

    @Column(name = "WORK_ESTIMATED")
    private Long workEstimated;

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
     * @return WORK_COMPLETED
     */
    public Long getWorkCompleted() {
        return workCompleted;
    }

    /**
     * @param workCompleted
     */
    public void setWorkCompleted(Long workCompleted) {
        this.workCompleted = workCompleted;
    }

    /**
     * @return WORK_ESTIMATED
     */
    public Long getWorkEstimated() {
        return workEstimated;
    }

    /**
     * @param workEstimated
     */
    public void setWorkEstimated(Long workEstimated) {
        this.workEstimated = workEstimated;
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