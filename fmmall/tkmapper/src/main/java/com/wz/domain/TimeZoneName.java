package com.wz.domain;

import javax.persistence.*;

@Table(name = "time_zone_name")
public class TimeZoneName {
    @Id
    @Column(name = "Name")
    private String name;

    @Column(name = "Time_zone_id")
    private Integer timeZoneId;

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

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
}