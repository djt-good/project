package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "variables_info")
public class VariablesInfo {
    @Column(name = "VARIABLE_NAME")
    private String variableName;

    @Column(name = "VARIABLE_SOURCE")
    private String variableSource;

    @Column(name = "VARIABLE_PATH")
    private String variablePath;

    @Column(name = "MIN_VALUE")
    private String minValue;

    @Column(name = "MAX_VALUE")
    private String maxValue;

    @Column(name = "SET_TIME")
    private Date setTime;

    @Column(name = "SET_USER")
    private String setUser;

    @Column(name = "SET_HOST")
    private String setHost;

    /**
     * @return VARIABLE_NAME
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * @param variableName
     */
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    /**
     * @return VARIABLE_SOURCE
     */
    public String getVariableSource() {
        return variableSource;
    }

    /**
     * @param variableSource
     */
    public void setVariableSource(String variableSource) {
        this.variableSource = variableSource;
    }

    /**
     * @return VARIABLE_PATH
     */
    public String getVariablePath() {
        return variablePath;
    }

    /**
     * @param variablePath
     */
    public void setVariablePath(String variablePath) {
        this.variablePath = variablePath;
    }

    /**
     * @return MIN_VALUE
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * @param minValue
     */
    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    /**
     * @return MAX_VALUE
     */
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * @param maxValue
     */
    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * @return SET_TIME
     */
    public Date getSetTime() {
        return setTime;
    }

    /**
     * @param setTime
     */
    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    /**
     * @return SET_USER
     */
    public String getSetUser() {
        return setUser;
    }

    /**
     * @param setUser
     */
    public void setSetUser(String setUser) {
        this.setUser = setUser;
    }

    /**
     * @return SET_HOST
     */
    public String getSetHost() {
        return setHost;
    }

    /**
     * @param setHost
     */
    public void setSetHost(String setHost) {
        this.setHost = setHost;
    }
}