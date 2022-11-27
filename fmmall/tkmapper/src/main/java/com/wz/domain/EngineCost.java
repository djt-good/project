package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "engine_cost")
public class EngineCost {
    @Id
    @Column(name = "cost_name")
    private String costName;

    @Id
    @Column(name = "engine_name")
    private String engineName;

    @Id
    @Column(name = "device_type")
    private Integer deviceType;

    @Column(name = "cost_value")
    private Float costValue;

    @Column(name = "last_update")
    private Date lastUpdate;

    private String comment;

    @Column(name = "default_value")
    private Float defaultValue;

    /**
     * @return cost_name
     */
    public String getCostName() {
        return costName;
    }

    /**
     * @param costName
     */
    public void setCostName(String costName) {
        this.costName = costName;
    }

    /**
     * @return engine_name
     */
    public String getEngineName() {
        return engineName;
    }

    /**
     * @param engineName
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * @return device_type
     */
    public Integer getDeviceType() {
        return deviceType;
    }

    /**
     * @param deviceType
     */
    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * @return cost_value
     */
    public Float getCostValue() {
        return costValue;
    }

    /**
     * @param costValue
     */
    public void setCostValue(Float costValue) {
        this.costValue = costValue;
    }

    /**
     * @return last_update
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * @param lastUpdate
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return default_value
     */
    public Float getDefaultValue() {
        return defaultValue;
    }

    /**
     * @param defaultValue
     */
    public void setDefaultValue(Float defaultValue) {
        this.defaultValue = defaultValue;
    }
}