package com.wz.domain;

import javax.persistence.*;

public class Threads {
    @Id
    @Column(name = "THREAD_ID")
    private Long threadId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "PROCESSLIST_ID")
    private Long processlistId;

    @Column(name = "PROCESSLIST_USER")
    private String processlistUser;

    @Column(name = "PROCESSLIST_HOST")
    private String processlistHost;

    @Column(name = "PROCESSLIST_DB")
    private String processlistDb;

    @Column(name = "PROCESSLIST_COMMAND")
    private String processlistCommand;

    @Column(name = "PROCESSLIST_TIME")
    private Long processlistTime;

    @Column(name = "PROCESSLIST_STATE")
    private String processlistState;

    @Column(name = "PARENT_THREAD_ID")
    private Long parentThreadId;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "INSTRUMENTED")
    private String instrumented;

    @Column(name = "HISTORY")
    private String history;

    @Column(name = "CONNECTION_TYPE")
    private String connectionType;

    @Column(name = "THREAD_OS_ID")
    private Long threadOsId;

    @Column(name = "RESOURCE_GROUP")
    private String resourceGroup;

    @Column(name = "PROCESSLIST_INFO")
    private String processlistInfo;

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
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return PROCESSLIST_ID
     */
    public Long getProcesslistId() {
        return processlistId;
    }

    /**
     * @param processlistId
     */
    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
    }

    /**
     * @return PROCESSLIST_USER
     */
    public String getProcesslistUser() {
        return processlistUser;
    }

    /**
     * @param processlistUser
     */
    public void setProcesslistUser(String processlistUser) {
        this.processlistUser = processlistUser;
    }

    /**
     * @return PROCESSLIST_HOST
     */
    public String getProcesslistHost() {
        return processlistHost;
    }

    /**
     * @param processlistHost
     */
    public void setProcesslistHost(String processlistHost) {
        this.processlistHost = processlistHost;
    }

    /**
     * @return PROCESSLIST_DB
     */
    public String getProcesslistDb() {
        return processlistDb;
    }

    /**
     * @param processlistDb
     */
    public void setProcesslistDb(String processlistDb) {
        this.processlistDb = processlistDb;
    }

    /**
     * @return PROCESSLIST_COMMAND
     */
    public String getProcesslistCommand() {
        return processlistCommand;
    }

    /**
     * @param processlistCommand
     */
    public void setProcesslistCommand(String processlistCommand) {
        this.processlistCommand = processlistCommand;
    }

    /**
     * @return PROCESSLIST_TIME
     */
    public Long getProcesslistTime() {
        return processlistTime;
    }

    /**
     * @param processlistTime
     */
    public void setProcesslistTime(Long processlistTime) {
        this.processlistTime = processlistTime;
    }

    /**
     * @return PROCESSLIST_STATE
     */
    public String getProcesslistState() {
        return processlistState;
    }

    /**
     * @param processlistState
     */
    public void setProcesslistState(String processlistState) {
        this.processlistState = processlistState;
    }

    /**
     * @return PARENT_THREAD_ID
     */
    public Long getParentThreadId() {
        return parentThreadId;
    }

    /**
     * @param parentThreadId
     */
    public void setParentThreadId(Long parentThreadId) {
        this.parentThreadId = parentThreadId;
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
     * @return INSTRUMENTED
     */
    public String getInstrumented() {
        return instrumented;
    }

    /**
     * @param instrumented
     */
    public void setInstrumented(String instrumented) {
        this.instrumented = instrumented;
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

    /**
     * @return CONNECTION_TYPE
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * @param connectionType
     */
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * @return THREAD_OS_ID
     */
    public Long getThreadOsId() {
        return threadOsId;
    }

    /**
     * @param threadOsId
     */
    public void setThreadOsId(Long threadOsId) {
        this.threadOsId = threadOsId;
    }

    /**
     * @return RESOURCE_GROUP
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * @param resourceGroup
     */
    public void setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    /**
     * @return PROCESSLIST_INFO
     */
    public String getProcesslistInfo() {
        return processlistInfo;
    }

    /**
     * @param processlistInfo
     */
    public void setProcesslistInfo(String processlistInfo) {
        this.processlistInfo = processlistInfo;
    }
}