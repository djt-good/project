package com.wz.domain;

import javax.persistence.*;

@Table(name = "socket_instances")
public class SocketInstances {
    @Id
    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "THREAD_ID")
    private Long threadId;

    @Column(name = "SOCKET_ID")
    private Integer socketId;

    @Column(name = "IP")
    private String ip;

    @Column(name = "PORT")
    private Integer port;

    @Column(name = "STATE")
    private String state;

    /**
     * @return OBJECT_INSTANCE_BEGIN
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * @param objectInstanceBegin
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * @return EVENT_NAME
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @return THREAD_ID
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
     * @return SOCKET_ID
     */
    public Integer getSocketId() {
        return socketId;
    }

    /**
     * @param socketId
     */
    public void setSocketId(Integer socketId) {
        this.socketId = socketId;
    }

    /**
     * @return IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return PORT
     */
    public Integer getPort() {
        return port;
    }

    /**
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }
}