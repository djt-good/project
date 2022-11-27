package com.wz.domain;

import javax.persistence.*;

@Table(name = "replication_group_members")
public class ReplicationGroupMembers {
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "MEMBER_ID")
    private String memberId;

    @Column(name = "MEMBER_HOST")
    private String memberHost;

    @Column(name = "MEMBER_PORT")
    private Integer memberPort;

    @Column(name = "MEMBER_STATE")
    private String memberState;

    @Column(name = "MEMBER_ROLE")
    private String memberRole;

    @Column(name = "MEMBER_VERSION")
    private String memberVersion;

    /**
     * @return CHANNEL_NAME
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @param channelName
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * @return MEMBER_ID
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * @return MEMBER_HOST
     */
    public String getMemberHost() {
        return memberHost;
    }

    /**
     * @param memberHost
     */
    public void setMemberHost(String memberHost) {
        this.memberHost = memberHost;
    }

    /**
     * @return MEMBER_PORT
     */
    public Integer getMemberPort() {
        return memberPort;
    }

    /**
     * @param memberPort
     */
    public void setMemberPort(Integer memberPort) {
        this.memberPort = memberPort;
    }

    /**
     * @return MEMBER_STATE
     */
    public String getMemberState() {
        return memberState;
    }

    /**
     * @param memberState
     */
    public void setMemberState(String memberState) {
        this.memberState = memberState;
    }

    /**
     * @return MEMBER_ROLE
     */
    public String getMemberRole() {
        return memberRole;
    }

    /**
     * @param memberRole
     */
    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole;
    }

    /**
     * @return MEMBER_VERSION
     */
    public String getMemberVersion() {
        return memberVersion;
    }

    /**
     * @param memberVersion
     */
    public void setMemberVersion(String memberVersion) {
        this.memberVersion = memberVersion;
    }
}