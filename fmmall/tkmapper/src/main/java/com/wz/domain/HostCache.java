package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "host_cache")
public class HostCache {
    @Id
    @Column(name = "IP")
    private String ip;

    @Column(name = "HOST")
    private String host;

    @Column(name = "HOST_VALIDATED")
    private String hostValidated;

    @Column(name = "SUM_CONNECT_ERRORS")
    private Long sumConnectErrors;

    @Column(name = "COUNT_HOST_BLOCKED_ERRORS")
    private Long countHostBlockedErrors;

    @Column(name = "COUNT_NAMEINFO_TRANSIENT_ERRORS")
    private Long countNameinfoTransientErrors;

    @Column(name = "COUNT_NAMEINFO_PERMANENT_ERRORS")
    private Long countNameinfoPermanentErrors;

    @Column(name = "COUNT_FORMAT_ERRORS")
    private Long countFormatErrors;

    @Column(name = "COUNT_ADDRINFO_TRANSIENT_ERRORS")
    private Long countAddrinfoTransientErrors;

    @Column(name = "COUNT_ADDRINFO_PERMANENT_ERRORS")
    private Long countAddrinfoPermanentErrors;

    @Column(name = "COUNT_FCRDNS_ERRORS")
    private Long countFcrdnsErrors;

    @Column(name = "COUNT_HOST_ACL_ERRORS")
    private Long countHostAclErrors;

    @Column(name = "COUNT_NO_AUTH_PLUGIN_ERRORS")
    private Long countNoAuthPluginErrors;

    @Column(name = "COUNT_AUTH_PLUGIN_ERRORS")
    private Long countAuthPluginErrors;

    @Column(name = "COUNT_HANDSHAKE_ERRORS")
    private Long countHandshakeErrors;

    @Column(name = "COUNT_PROXY_USER_ERRORS")
    private Long countProxyUserErrors;

    @Column(name = "COUNT_PROXY_USER_ACL_ERRORS")
    private Long countProxyUserAclErrors;

    @Column(name = "COUNT_AUTHENTICATION_ERRORS")
    private Long countAuthenticationErrors;

    @Column(name = "COUNT_SSL_ERRORS")
    private Long countSslErrors;

    @Column(name = "COUNT_MAX_USER_CONNECTIONS_ERRORS")
    private Long countMaxUserConnectionsErrors;

    @Column(name = "COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS")
    private Long countMaxUserConnectionsPerHourErrors;

    @Column(name = "COUNT_DEFAULT_DATABASE_ERRORS")
    private Long countDefaultDatabaseErrors;

    @Column(name = "COUNT_INIT_CONNECT_ERRORS")
    private Long countInitConnectErrors;

    @Column(name = "COUNT_LOCAL_ERRORS")
    private Long countLocalErrors;

    @Column(name = "COUNT_UNKNOWN_ERRORS")
    private Long countUnknownErrors;

    @Column(name = "FIRST_SEEN")
    private Date firstSeen;

    @Column(name = "LAST_SEEN")
    private Date lastSeen;

    @Column(name = "FIRST_ERROR_SEEN")
    private Date firstErrorSeen;

    @Column(name = "LAST_ERROR_SEEN")
    private Date lastErrorSeen;

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
     * @return HOST_VALIDATED
     */
    public String getHostValidated() {
        return hostValidated;
    }

    /**
     * @param hostValidated
     */
    public void setHostValidated(String hostValidated) {
        this.hostValidated = hostValidated;
    }

    /**
     * @return SUM_CONNECT_ERRORS
     */
    public Long getSumConnectErrors() {
        return sumConnectErrors;
    }

    /**
     * @param sumConnectErrors
     */
    public void setSumConnectErrors(Long sumConnectErrors) {
        this.sumConnectErrors = sumConnectErrors;
    }

    /**
     * @return COUNT_HOST_BLOCKED_ERRORS
     */
    public Long getCountHostBlockedErrors() {
        return countHostBlockedErrors;
    }

    /**
     * @param countHostBlockedErrors
     */
    public void setCountHostBlockedErrors(Long countHostBlockedErrors) {
        this.countHostBlockedErrors = countHostBlockedErrors;
    }

    /**
     * @return COUNT_NAMEINFO_TRANSIENT_ERRORS
     */
    public Long getCountNameinfoTransientErrors() {
        return countNameinfoTransientErrors;
    }

    /**
     * @param countNameinfoTransientErrors
     */
    public void setCountNameinfoTransientErrors(Long countNameinfoTransientErrors) {
        this.countNameinfoTransientErrors = countNameinfoTransientErrors;
    }

    /**
     * @return COUNT_NAMEINFO_PERMANENT_ERRORS
     */
    public Long getCountNameinfoPermanentErrors() {
        return countNameinfoPermanentErrors;
    }

    /**
     * @param countNameinfoPermanentErrors
     */
    public void setCountNameinfoPermanentErrors(Long countNameinfoPermanentErrors) {
        this.countNameinfoPermanentErrors = countNameinfoPermanentErrors;
    }

    /**
     * @return COUNT_FORMAT_ERRORS
     */
    public Long getCountFormatErrors() {
        return countFormatErrors;
    }

    /**
     * @param countFormatErrors
     */
    public void setCountFormatErrors(Long countFormatErrors) {
        this.countFormatErrors = countFormatErrors;
    }

    /**
     * @return COUNT_ADDRINFO_TRANSIENT_ERRORS
     */
    public Long getCountAddrinfoTransientErrors() {
        return countAddrinfoTransientErrors;
    }

    /**
     * @param countAddrinfoTransientErrors
     */
    public void setCountAddrinfoTransientErrors(Long countAddrinfoTransientErrors) {
        this.countAddrinfoTransientErrors = countAddrinfoTransientErrors;
    }

    /**
     * @return COUNT_ADDRINFO_PERMANENT_ERRORS
     */
    public Long getCountAddrinfoPermanentErrors() {
        return countAddrinfoPermanentErrors;
    }

    /**
     * @param countAddrinfoPermanentErrors
     */
    public void setCountAddrinfoPermanentErrors(Long countAddrinfoPermanentErrors) {
        this.countAddrinfoPermanentErrors = countAddrinfoPermanentErrors;
    }

    /**
     * @return COUNT_FCRDNS_ERRORS
     */
    public Long getCountFcrdnsErrors() {
        return countFcrdnsErrors;
    }

    /**
     * @param countFcrdnsErrors
     */
    public void setCountFcrdnsErrors(Long countFcrdnsErrors) {
        this.countFcrdnsErrors = countFcrdnsErrors;
    }

    /**
     * @return COUNT_HOST_ACL_ERRORS
     */
    public Long getCountHostAclErrors() {
        return countHostAclErrors;
    }

    /**
     * @param countHostAclErrors
     */
    public void setCountHostAclErrors(Long countHostAclErrors) {
        this.countHostAclErrors = countHostAclErrors;
    }

    /**
     * @return COUNT_NO_AUTH_PLUGIN_ERRORS
     */
    public Long getCountNoAuthPluginErrors() {
        return countNoAuthPluginErrors;
    }

    /**
     * @param countNoAuthPluginErrors
     */
    public void setCountNoAuthPluginErrors(Long countNoAuthPluginErrors) {
        this.countNoAuthPluginErrors = countNoAuthPluginErrors;
    }

    /**
     * @return COUNT_AUTH_PLUGIN_ERRORS
     */
    public Long getCountAuthPluginErrors() {
        return countAuthPluginErrors;
    }

    /**
     * @param countAuthPluginErrors
     */
    public void setCountAuthPluginErrors(Long countAuthPluginErrors) {
        this.countAuthPluginErrors = countAuthPluginErrors;
    }

    /**
     * @return COUNT_HANDSHAKE_ERRORS
     */
    public Long getCountHandshakeErrors() {
        return countHandshakeErrors;
    }

    /**
     * @param countHandshakeErrors
     */
    public void setCountHandshakeErrors(Long countHandshakeErrors) {
        this.countHandshakeErrors = countHandshakeErrors;
    }

    /**
     * @return COUNT_PROXY_USER_ERRORS
     */
    public Long getCountProxyUserErrors() {
        return countProxyUserErrors;
    }

    /**
     * @param countProxyUserErrors
     */
    public void setCountProxyUserErrors(Long countProxyUserErrors) {
        this.countProxyUserErrors = countProxyUserErrors;
    }

    /**
     * @return COUNT_PROXY_USER_ACL_ERRORS
     */
    public Long getCountProxyUserAclErrors() {
        return countProxyUserAclErrors;
    }

    /**
     * @param countProxyUserAclErrors
     */
    public void setCountProxyUserAclErrors(Long countProxyUserAclErrors) {
        this.countProxyUserAclErrors = countProxyUserAclErrors;
    }

    /**
     * @return COUNT_AUTHENTICATION_ERRORS
     */
    public Long getCountAuthenticationErrors() {
        return countAuthenticationErrors;
    }

    /**
     * @param countAuthenticationErrors
     */
    public void setCountAuthenticationErrors(Long countAuthenticationErrors) {
        this.countAuthenticationErrors = countAuthenticationErrors;
    }

    /**
     * @return COUNT_SSL_ERRORS
     */
    public Long getCountSslErrors() {
        return countSslErrors;
    }

    /**
     * @param countSslErrors
     */
    public void setCountSslErrors(Long countSslErrors) {
        this.countSslErrors = countSslErrors;
    }

    /**
     * @return COUNT_MAX_USER_CONNECTIONS_ERRORS
     */
    public Long getCountMaxUserConnectionsErrors() {
        return countMaxUserConnectionsErrors;
    }

    /**
     * @param countMaxUserConnectionsErrors
     */
    public void setCountMaxUserConnectionsErrors(Long countMaxUserConnectionsErrors) {
        this.countMaxUserConnectionsErrors = countMaxUserConnectionsErrors;
    }

    /**
     * @return COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS
     */
    public Long getCountMaxUserConnectionsPerHourErrors() {
        return countMaxUserConnectionsPerHourErrors;
    }

    /**
     * @param countMaxUserConnectionsPerHourErrors
     */
    public void setCountMaxUserConnectionsPerHourErrors(Long countMaxUserConnectionsPerHourErrors) {
        this.countMaxUserConnectionsPerHourErrors = countMaxUserConnectionsPerHourErrors;
    }

    /**
     * @return COUNT_DEFAULT_DATABASE_ERRORS
     */
    public Long getCountDefaultDatabaseErrors() {
        return countDefaultDatabaseErrors;
    }

    /**
     * @param countDefaultDatabaseErrors
     */
    public void setCountDefaultDatabaseErrors(Long countDefaultDatabaseErrors) {
        this.countDefaultDatabaseErrors = countDefaultDatabaseErrors;
    }

    /**
     * @return COUNT_INIT_CONNECT_ERRORS
     */
    public Long getCountInitConnectErrors() {
        return countInitConnectErrors;
    }

    /**
     * @param countInitConnectErrors
     */
    public void setCountInitConnectErrors(Long countInitConnectErrors) {
        this.countInitConnectErrors = countInitConnectErrors;
    }

    /**
     * @return COUNT_LOCAL_ERRORS
     */
    public Long getCountLocalErrors() {
        return countLocalErrors;
    }

    /**
     * @param countLocalErrors
     */
    public void setCountLocalErrors(Long countLocalErrors) {
        this.countLocalErrors = countLocalErrors;
    }

    /**
     * @return COUNT_UNKNOWN_ERRORS
     */
    public Long getCountUnknownErrors() {
        return countUnknownErrors;
    }

    /**
     * @param countUnknownErrors
     */
    public void setCountUnknownErrors(Long countUnknownErrors) {
        this.countUnknownErrors = countUnknownErrors;
    }

    /**
     * @return FIRST_SEEN
     */
    public Date getFirstSeen() {
        return firstSeen;
    }

    /**
     * @param firstSeen
     */
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * @return LAST_SEEN
     */
    public Date getLastSeen() {
        return lastSeen;
    }

    /**
     * @param lastSeen
     */
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * @return FIRST_ERROR_SEEN
     */
    public Date getFirstErrorSeen() {
        return firstErrorSeen;
    }

    /**
     * @param firstErrorSeen
     */
    public void setFirstErrorSeen(Date firstErrorSeen) {
        this.firstErrorSeen = firstErrorSeen;
    }

    /**
     * @return LAST_ERROR_SEEN
     */
    public Date getLastErrorSeen() {
        return lastErrorSeen;
    }

    /**
     * @param lastErrorSeen
     */
    public void setLastErrorSeen(Date lastErrorSeen) {
        this.lastErrorSeen = lastErrorSeen;
    }
}