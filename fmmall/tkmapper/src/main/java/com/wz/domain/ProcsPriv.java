package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "procs_priv")
public class ProcsPriv {
    @Id
    @Column(name = "Host")
    private String host;

    @Id
    @Column(name = "Db")
    private String db;

    @Id
    @Column(name = "User")
    private String user;

    @Id
    @Column(name = "Routine_name")
    private String routineName;

    @Id
    @Column(name = "Routine_type")
    private String routineType;

    @Column(name = "Grantor")
    private String grantor;

    @Column(name = "Proc_priv")
    private String procPriv;

    @Column(name = "Timestamp")
    private Date timestamp;

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
     * @return User
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
     * @return Routine_name
     */
    public String getRoutineName() {
        return routineName;
    }

    /**
     * @param routineName
     */
    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    /**
     * @return Routine_type
     */
    public String getRoutineType() {
        return routineType;
    }

    /**
     * @param routineType
     */
    public void setRoutineType(String routineType) {
        this.routineType = routineType;
    }

    /**
     * @return Grantor
     */
    public String getGrantor() {
        return grantor;
    }

    /**
     * @param grantor
     */
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    /**
     * @return Proc_priv
     */
    public String getProcPriv() {
        return procPriv;
    }

    /**
     * @param procPriv
     */
    public void setProcPriv(String procPriv) {
        this.procPriv = procPriv;
    }

    /**
     * @return Timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}