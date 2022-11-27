package com.wz.domain;

import javax.persistence.*;

public class Version {
    @Column(name = "sys_version")
    private String sysVersion;

    @Column(name = "mysql_version")
    private String mysqlVersion;

    /**
     * @return sys_version
     */
    public String getSysVersion() {
        return sysVersion;
    }

    /**
     * @param sysVersion
     */
    public void setSysVersion(String sysVersion) {
        this.sysVersion = sysVersion;
    }

    /**
     * @return mysql_version
     */
    public String getMysqlVersion() {
        return mysqlVersion;
    }

    /**
     * @param mysqlVersion
     */
    public void setMysqlVersion(String mysqlVersion) {
        this.mysqlVersion = mysqlVersion;
    }
}