package com.wz.domain;

import javax.persistence.*;

@Table(name = "time_zone_transition")
public class TimeZoneTransition {
    @Id
    @Column(name = "Time_zone_id")
    private Integer timeZoneId;

    @Id
    @Column(name = "Transition_time")
    private Long transitionTime;

    @Column(name = "Transition_type_id")
    private Integer transitionTypeId;

    /**
     * @return Time_zone_id
     */
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * @param timeZoneId
     */
    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    /**
     * @return Transition_time
     */
    public Long getTransitionTime() {
        return transitionTime;
    }

    /**
     * @param transitionTime
     */
    public void setTransitionTime(Long transitionTime) {
        this.transitionTime = transitionTime;
    }

    /**
     * @return Transition_type_id
     */
    public Integer getTransitionTypeId() {
        return transitionTypeId;
    }

    /**
     * @param transitionTypeId
     */
    public void setTransitionTypeId(Integer transitionTypeId) {
        this.transitionTypeId = transitionTypeId;
    }
}