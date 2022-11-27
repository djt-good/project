package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "password_history")
public class PasswordHistory {
    @Id
    @Column(name = "Host")
    private String host;

    @Id
    @Column(name = "User")
    private String user;

    @Id
    @Column(name = "Password_timestamp")
    private Date passwordTimestamp;

    @Column(name = "Password")
    private String password;

    /**
     * @return Host
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
     * @return User
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
     * @return Password_timestamp
     */
    public Date getPasswordTimestamp() {
        return passwordTimestamp;
    }

    /**
     * @param passwordTimestamp
     */
    public void setPasswordTimestamp(Date passwordTimestamp) {
        this.passwordTimestamp = passwordTimestamp;
    }

    /**
     * @return Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}