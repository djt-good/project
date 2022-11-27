package com.wz.domain;

import javax.persistence.*;

@Table(name = "setup_threads")
public class SetupThreads {
    @Id
    @Column(name = "NAME")
    private String name;

    @Column(name = "ENABLED")
    private String enabled;

    @Column(name = "HISTORY")
    private String history;

    @Column(name = "PROPERTIES")
    private String properties;

    @Column(name = "VOLATILITY")
    private Integer volatility;

    @Column(name = "DOCUMENTATION")
    private String documentation;

    /**
     * @return NAME
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
     * @return ENABLED
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /**
     * @return HISTORY
     */
    public String getHistory() {
        return history;
    }

    /**
     * @param history
     */
    public void setHistory(String history) {
        this.history = history;
    }

    /**
     * @return PROPERTIES
     */
    public String getProperties() {
        return properties;
    }

    /**
     * @param properties
     */
    public void setProperties(String properties) {
        this.properties = properties;
    }

    /**
     * @return VOLATILITY
     */
    public Integer getVolatility() {
        return volatility;
    }

    /**
     * @param volatility
     */
    public void setVolatility(Integer volatility) {
        this.volatility = volatility;
    }

    /**
     * @return DOCUMENTATION
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * @param documentation
     */
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }
}