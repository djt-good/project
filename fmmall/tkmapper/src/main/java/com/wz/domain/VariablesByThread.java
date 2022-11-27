package com.wz.domain;

import javax.persistence.*;

@Table(name = "variables_by_thread")
public class VariablesByThread {
    @Id
    @Column(name = "THREAD_ID")
    private Long threadId;

    @Id
    @Column(name = "VARIABLE_NAME")
    private String variableName;

    @Column(name = "VARIABLE_VALUE")
    private String variableValue;

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