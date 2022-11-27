package com.wz.domain;

import javax.persistence.*;

public class Servers {
    @Id
    @Column(name = "Server_name")
    private String serverName;

    @Column(name = "Host")
    private String host;

    @Column(name = "Db")
    private String db;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "Port")
    private Integer port;

    @Column(name = "Socket")
    private String socket;

    @Column(name = "Wrapper")
    private String wrapper;

    @Column(name = "Owner")
    private String owner;

    /**
     * @return Server_name
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * @param serverName
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

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
     * @return Db
     */
    public String getDb() {
        return db;
    }

    /**
     * @param db
     */
    public void setDb(String db) {
        this.db = db;
    }

    /**
     * @return Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
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

    /**
     * @return Port
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
     * @return Socket
     */
    public String getSocket() {
        return socket;
    }

    /**
     * @param socket
     */
    public void setSocket(String socket) {
        this.socket = socket;
    }

    /**
     * @return Wrapper
     */
    public String getWrapper() {
        return wrapper;
    }

    /**
     * @param wrapper
     */
    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    /**
     * @return Owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
}