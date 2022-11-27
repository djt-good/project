package com.wz.domain;

import javax.persistence.*;

@Table(name = "user_variables_by_thread")
public class UserVariablesByThread {
    @Id
    @Column(name = "THREAD_ID")
    private Long threadId;

    @Id
    @Column(name = "VARIABLE_NAME")
    private String variableName;

    @Column(name = "VARIABLE_VALUE")
    private byte[] variableValue;

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
    public byte[] getVariableValue() {
        return variableValue;
    }

    /**
     * @param variableValue
     */
    public void setVariableValue(byte[] variableValue) {
        this.variableValue = variableValue;
    }
}