package com.wz.domain;

import javax.persistence.*;

@Table(name = "global_grants")
public class GlobalGrants {
    @Id
    @Column(name = "USER")
    private String user;

    @Id
    @Column(name = "HOST")
    private String host;

    @Id
    @Column(name = "PRIV")
    private String priv;

    @Column(name = "WITH_GRANT_OPTION")
    private String withGrantOption;

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
     * @return PRIV
     */
    public String getPriv() {
        return priv;
    }

    /**
     * @param priv
     */
    public void setPriv(String priv) {
        this.priv = priv;
    }

    /**
     * @return WITH_GRANT_OPTION
     */
    public String getWithGrantOption() {
        return withGrantOption;
    }

    /**
     * @param withGrantOption
     */
    public void setWithGrantOption(String withGrantOption) {
        this.withGrantOption = withGrantOption;
    }
}