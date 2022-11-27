package com.wz.domain;

import javax.persistence.*;

@Table(name = "setup_consumers")
public class SetupConsumers {
    @Id
    @Column(name = "NAME")
    private String name;

    @Column(name = "ENABLED")
    private String enabled;

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
}