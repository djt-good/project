package com.wz.domain;

import javax.persistence.*;

@Table(name = "replication_connection_configuration")
public class ReplicationConnectionConfiguration {
    @Id
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "HOST")
    private String host;

    @Column(name = "PORT")
    private Integer port;

    @Column(name = "USER")
    private String user;

    @Column(name = "NETWORK_INTERFACE")
    private String networkInterface;

    @Column(name = "AUTO_POSITION")
    private String autoPosition;

    @Column(name = "SSL_ALLOWED")
    private String sslAllowed;

    @Column(name = "SSL_CA_FILE")
    private String sslCaFile;

    @Column(name = "SSL_CA_PATH")
    private String sslCaPath;

    @Column(name = "SSL_CERTIFICATE")
    private String sslCertificate;

    @Column(name = "SSL_CIPHER")
    private String sslCipher;

    @Column(name = "SSL_KEY")
    private String sslKey;

    @Column(name = "SSL_VERIFY_SERVER_CERTIFICATE")
    private String sslVerifyServerCertificate;

    @Column(name = "SSL_CRL_FILE")
    private String sslCrlFile;

    @Column(name = "SSL_CRL_PATH")
    private String sslCrlPath;

    @Column(name = "CONNECTION_RETRY_INTERVAL")
    private Integer connectionRetryInterval;

    @Column(name = "CONNECTION_RETRY_COUNT")
    private Long connectionRetryCount;

    /**
     * Number of seconds after which a heartbeat will be sent .
     */
    @Column(name = "HEARTBEAT_INTERVAL")
    private Double heartbeatInterval;

    @Column(name = "TLS_VERSION")
    private String tlsVersion;

    @Column(name = "PUBLIC_KEY_PATH")
    private String publicKeyPath;

    @Column(name = "GET_PUBLIC_KEY")
    private String getPublicKey;

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
     * @return NETWORK_INTERFACE
     */
    public String getNetworkInterface() {
        return networkInterface;
    }

    /**
     * @param networkInterface
     */
    public void setNetworkInterface(String networkInterface) {
        this.networkInterface = networkInterface;
    }

    /**
     * @return AUTO_POSITION
     */
    public String getAutoPosition() {
        return autoPosition;
    }

    /**
     * @param autoPosition
     */
    public void setAutoPosition(String autoPosition) {
        this.autoPosition = autoPosition;
    }

    /**
     * @return SSL_ALLOWED
     */
    public String getSslAllowed() {
        return sslAllowed;
    }

    /**
     * @param sslAllowed
     */
    public void setSslAllowed(String sslAllowed) {
        this.sslAllowed = sslAllowed;
    }

    /**
     * @return SSL_CA_FILE
     */
    public String getSslCaFile() {
        return sslCaFile;
    }

    /**
     * @param sslCaFile
     */
    public void setSslCaFile(String sslCaFile) {
        this.sslCaFile = sslCaFile;
    }

    /**
     * @return SSL_CA_PATH
     */
    public String getSslCaPath() {
        return sslCaPath;
    }

    /**
     * @param sslCaPath
     */
    public void setSslCaPath(String sslCaPath) {
        this.sslCaPath = sslCaPath;
    }

    /**
     * @return SSL_CERTIFICATE
     */
    public String getSslCertificate() {
        return sslCertificate;
    }

    /**
     * @param sslCertificate
     */
    public void setSslCertificate(String sslCertificate) {
        this.sslCertificate = sslCertificate;
    }

    /**
     * @return SSL_CIPHER
     */
    public String getSslCipher() {
        return sslCipher;
    }

    /**
     * @param sslCipher
     */
    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    /**
     * @return SSL_KEY
     */
    public String getSslKey() {
        return sslKey;
    }

    /**
     * @param sslKey
     */
    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    /**
     * @return SSL_VERIFY_SERVER_CERTIFICATE
     */
    public String getSslVerifyServerCertificate() {
        return sslVerifyServerCertificate;
    }

    /**
     * @param sslVerifyServerCertificate
     */
    public void setSslVerifyServerCertificate(String sslVerifyServerCertificate) {
        this.sslVerifyServerCertificate = sslVerifyServerCertificate;
    }

    /**
     * @return SSL_CRL_FILE
     */
    public String getSslCrlFile() {
        return sslCrlFile;
    }

    /**
     * @param sslCrlFile
     */
    public void setSslCrlFile(String sslCrlFile) {
        this.sslCrlFile = sslCrlFile;
    }

    /**
     * @return SSL_CRL_PATH
     */
    public String getSslCrlPath() {
        return sslCrlPath;
    }

    /**
     * @param sslCrlPath
     */
    public void setSslCrlPath(String sslCrlPath) {
        this.sslCrlPath = sslCrlPath;
    }

    /**
     * @return CONNECTION_RETRY_INTERVAL
     */
    public Integer getConnectionRetryInterval() {
        return connectionRetryInterval;
    }

    /**
     * @param connectionRetryInterval
     */
    public void setConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
    }

    /**
     * @return CONNECTION_RETRY_COUNT
     */
    public Long getConnectionRetryCount() {
        return connectionRetryCount;
    }

    /**
     * @param connectionRetryCount
     */
    public void setConnectionRetryCount(Long connectionRetryCount) {
        this.connectionRetryCount = connectionRetryCount;
    }

    /**
     * 获取Number of seconds after which a heartbeat will be sent .
     *
     * @return HEARTBEAT_INTERVAL - Number of seconds after which a heartbeat will be sent .
     */
    public Double getHeartbeatInterval() {
        return heartbeatInterval;
    }

    /**
     * 设置Number of seconds after which a heartbeat will be sent .
     *
     * @param heartbeatInterval Number of seconds after which a heartbeat will be sent .
     */
    public void setHeartbeatInterval(Double heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
    }

    /**
     * @return TLS_VERSION
     */
    public String getTlsVersion() {
        return tlsVersion;
    }

    /**
     * @param tlsVersion
     */
    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }

    /**
     * @return PUBLIC_KEY_PATH
     */
    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    /**
     * @param publicKeyPath
     */
    public void setPublicKeyPath(String publicKeyPath) {
        this.publicKeyPath = publicKeyPath;
    }

    /**
     * @return GET_PUBLIC_KEY
     */
    public String getGetPublicKey() {
        return getPublicKey;
    }

    /**
     * @param getPublicKey
     */
    public void setGetPublicKey(String getPublicKey) {
        this.getPublicKey = getPublicKey;
    }
}