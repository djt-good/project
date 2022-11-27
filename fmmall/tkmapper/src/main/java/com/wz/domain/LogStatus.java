package com.wz.domain;

import javax.persistence.*;

@Table(name = "log_status")
public class LogStatus {
    @Column(name = "SERVER_UUID")
    private String serverUuid;

    @Column(name = "LOCAL")
    private String local;

    @Column(name = "REPLICATION")
    private String replication;

    @Column(name = "STORAGE_ENGINES")
    private String storageEngines;

    /**
     * @return SERVER_UUID
     */
    public String getServerUuid() {
        return serverUuid;
    }

    /**
     * @param serverUuid
     */
    public void setServerUuid(String serverUuid) {
        this.serverUuid = serverUuid;
    }

    /**
     * @return LOCAL
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return REPLICATION
     */
    public String getReplication() {
        return replication;
    }

    /**
     * @param replication
     */
    public void setReplication(String replication) {
        this.replication = replication;
    }

    /**
     * @return STORAGE_ENGINES
     */
    public String getStorageEngines() {
        return storageEngines;
    }

    /**
     * @param storageEngines
     */
    public void setStorageEngines(String storageEngines) {
        this.storageEngines = storageEngines;
    }
}