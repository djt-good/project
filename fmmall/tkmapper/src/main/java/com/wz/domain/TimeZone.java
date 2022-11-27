package com.wz.domain;

import javax.persistence.*;

@Table(name = "time_zone")
public class TimeZone {
    @Id
    @Column(name = "Time_zone_id")
    private Integer timeZoneId;

    @Column(name = "Use_leap_seconds")
    private String useLeapSeconds;

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
     * @return Use_leap_seconds
     */
    public String getUseLeapSeconds() {
        return useLeapSeconds;
    }

    /**
     * @param useLeapSeconds
     */
    public void setUseLeapSeconds(String useLeapSeconds) {
        this.useLeapSeconds = useLeapSeconds;
    }
}