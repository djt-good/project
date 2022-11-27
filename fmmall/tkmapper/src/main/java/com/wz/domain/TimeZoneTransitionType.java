package com.wz.domain;

import javax.persistence.*;

@Table(name = "time_zone_transition_type")
public class TimeZoneTransitionType {
    @Id
    @Column(name = "Time_zone_id")
    private Integer timeZoneId;

    @Id
    @Column(name = "Transition_type_id")
    private Integer transitionTypeId;

    @Column(name = "Offset")
    private Integer offset;

    @Column(name = "Is_DST")
    private Byte isDst;

    @Column(name = "Abbreviation")
    private String abbreviation;

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

    /**
     * @return Offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * @param offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * @return Is_DST
     */
    public Byte getIsDst() {
        return isDst;
    }

    /**
     * @param isDst
     */
    public void setIsDst(Byte isDst) {
        this.isDst = isDst;
    }

    /**
     * @return Abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * @param abbreviation
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}