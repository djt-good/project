package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "general_log")
public class GeneralLog {
    @Column(name = "event_time")
    private Date eventTime;

    @Column(name = "thread_id")
    private Long threadId;

    @Column(name = "server_id")
    private Integer serverId;

    @Column(name = "command_type")
    private String commandType;

    @Column(name = "user_host")
    private String userHost;

    private byte[] argument;

    /**
     * @return event_time
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * @param eventTime
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * @return thread_id
     */
    public Long getThreadId() {
        return threadId;
    }

    /**
     * @param threadId
     */
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /**
     * @return server_id
     */
    public Integer getServerId() {
        return serverId;
    }

    /**
     * @param serverId
     */
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    /**
     * @return command_type
     */
    public String getCommandType() {
        return commandType;
    }

    /**
     * @param commandType
     */
    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    /**
     * @return user_host
     */
    public String getUserHost() {
        return userHost;
    }

    /**
     * @param userHost
     */
    public void setUserHost(String userHost) {
        this.userHost = userHost;
    }

    /**
     * @return argument
     */
    public byte[] getArgument() {
        return argument;
    }

    /**
     * @param argument
     */
    public void setArgument(byte[] argument) {
        this.argument = argument;
    }
}