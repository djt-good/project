package com.wz.domain;

import javax.persistence.*;

@Table(name = "status_by_user")
public class StatusByUser {
    @Column(name = "USER")
    private String user;

    @Column(name = "VARIABLE_NAME")
    private String variableName;

    @Column(name = "VARIABLE_VALUE")
    private String variableValue;

    /**
     * @return USER
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

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
     * @return VARIABLE_VALUE
     */
    public String getVariableValue() {
        return variableValue;
    }

    /**
     * @param variableValue
     */
    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }
}