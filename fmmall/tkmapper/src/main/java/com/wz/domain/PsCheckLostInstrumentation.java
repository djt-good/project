package com.wz.domain;

import javax.persistence.*;

@Table(name = "ps_check_lost_instrumentation")
public class PsCheckLostInstrumentation {
    @Column(name = "variable_name")
    private String variableName;

    @Column(name = "variable_value")
    private String variableValue;

    /**
     * @return variable_name
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
     * @return variable_value
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