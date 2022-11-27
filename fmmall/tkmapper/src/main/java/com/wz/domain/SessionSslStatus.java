package com.wz.domain;

import javax.persistence.*;

@Table(name = "session_ssl_status")
public class SessionSslStatus {
    @Column(name = "thread_id")
    private Long threadId;

    @Column(name = "ssl_version")
    private String sslVersion;

    @Column(name = "ssl_cipher")
    private String sslCipher;

    @Column(name = "ssl_sessions_reused")
    private String sslSessionsReused;

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
     * @return ssl_version
     */
    public String getSslVersion() {
        return sslVersion;
    }

    /**
     * @param sslVersion
     */
    public void setSslVersion(String sslVersion) {
        this.sslVersion = sslVersion;
    }

    /**
     * @return ssl_cipher
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
     * @return ssl_sessions_reused
     */
    public String getSslSessionsReused() {
        return sslSessionsReused;
    }

    /**
     * @param sslSessionsReused
     */
    public void setSslSessionsReused(String sslSessionsReused) {
        this.sslSessionsReused = sslSessionsReused;
    }
}