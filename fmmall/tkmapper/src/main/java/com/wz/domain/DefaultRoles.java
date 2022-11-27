package com.wz.domain;

import javax.persistence.*;

@Table(name = "default_roles")
public class DefaultRoles {
    @Id
    @Column(name = "HOST")
    private String host;

    @Id
    @Column(name = "USER")
    private String user;

    @Id
    @Column(name = "DEFAULT_ROLE_HOST")
    private String defaultRoleHost;

    @Id
    @Column(name = "DEFAULT_ROLE_USER")
    private String defaultRoleUser;

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
     * @return DEFAULT_ROLE_HOST
     */
    public String getDefaultRoleHost() {
        return defaultRoleHost;
    }

    /**
     * @param defaultRoleHost
     */
    public void setDefaultRoleHost(String defaultRoleHost) {
        this.defaultRoleHost = defaultRoleHost;
    }

    /**
     * @return DEFAULT_ROLE_USER
     */
    public String getDefaultRoleUser() {
        return defaultRoleUser;
    }

    /**
     * @param defaultRoleUser
     */
    public void setDefaultRoleUser(String defaultRoleUser) {
        this.defaultRoleUser = defaultRoleUser;
    }
}