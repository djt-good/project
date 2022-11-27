package com.wz.domain;

import javax.persistence.*;

@Table(name = "setup_actors")
public class SetupActors {
    @Id
    @Column(name = "HOST")
    private String host;

    @Id
    @Column(name = "USER")
    private String user;

    @Id
    @Column(name = "ROLE")
    private String role;

    @Column(name = "ENABLED")
    private String enabled;

    @Column(name = "HISTORY")
    private String history;

    /**
     * @return HOST
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

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
     * @return ROLE
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
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
}