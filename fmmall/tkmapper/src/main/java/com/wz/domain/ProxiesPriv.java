package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "proxies_priv")
public class ProxiesPriv {
    @Id
    @Column(name = "Host")
    private String host;

    @Id
    @Column(name = "User")
    private String user;

    @Id
    @Column(name = "Proxied_host")
    private String proxiedHost;

    @Id
    @Column(name = "Proxied_user")
    private String proxiedUser;

    @Column(name = "With_grant")
    private Boolean withGrant;

    @Column(name = "Grantor")
    private String grantor;

    @Column(name = "Timestamp")
    private Date timestamp;

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
     * @return Proxied_host
     */
    public String getProxiedHost() {
        return proxiedHost;
    }

    /**
     * @param proxiedHost
     */
    public void setProxiedHost(String proxiedHost) {
        this.proxiedHost = proxiedHost;
    }

    /**
     * @return Proxied_user
     */
    public String getProxiedUser() {
        return proxiedUser;
    }

    /**
     * @param proxiedUser
     */
    public void setProxiedUser(String proxiedUser) {
        this.proxiedUser = proxiedUser;
    }

    /**
     * @return With_grant
     */
    public Boolean getWithGrant() {
        return withGrant;
    }

    /**
     * @param withGrant
     */
    public void setWithGrant(Boolean withGrant) {
        this.withGrant = withGrant;
    }

    /**
     * @return Grantor
     */
    public String getGrantor() {
        return grantor;
    }

    /**
     * @param grantor
     */
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    /**
     * @return Timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}