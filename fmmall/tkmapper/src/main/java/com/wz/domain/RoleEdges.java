package com.wz.domain;

import javax.persistence.*;

@Table(name = "role_edges")
public class RoleEdges {
    @Id
    @Column(name = "FROM_HOST")
    private String fromHost;

    @Id
    @Column(name = "FROM_USER")
    private String fromUser;

    @Id
    @Column(name = "TO_HOST")
    private String toHost;

    @Id
    @Column(name = "TO_USER")
    private String toUser;

    @Column(name = "WITH_ADMIN_OPTION")
    private String withAdminOption;

    /**
     * @return FROM_HOST
     */
    public String getFromHost() {
        return fromHost;
    }

    /**
     * @param fromHost
     */
    public void setFromHost(String fromHost) {
        this.fromHost = fromHost;
    }

    /**
     * @return FROM_USER
     */
    public String getFromUser() {
        return fromUser;
    }

    /**
     * @param fromUser
     */
    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    /**
     * @return TO_HOST
     */
    public String getToHost() {
        return toHost;
    }

    /**
     * @param toHost
     */
    public void setToHost(String toHost) {
        this.toHost = toHost;
    }

    /**
     * @return TO_USER
     */
    public String getToUser() {
        return toUser;
    }

    /**
     * @param toUser
     */
    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    /**
     * @return WITH_ADMIN_OPTION
     */
    public String getWithAdminOption() {
        return withAdminOption;
    }

    /**
     * @param withAdminOption
     */
    public void setWithAdminOption(String withAdminOption) {
        this.withAdminOption = withAdminOption;
    }
}