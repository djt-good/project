package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tables_priv")
public class TablesPriv {
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
    @Column(name = "Table_name")
    private String tableName;

    @Column(name = "Grantor")
    private String grantor;

    @Column(name = "Timestamp")
    private Date timestamp;

    @Column(name = "Table_priv")
    private String tablePriv;

    @Column(name = "Column_priv")
    private String columnPriv;

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
     * @return Table_name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
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

    /**
     * @return Table_priv
     */
    public String getTablePriv() {
        return tablePriv;
    }

    /**
     * @param tablePriv
     */
    public void setTablePriv(String tablePriv) {
        this.tablePriv = tablePriv;
    }

    /**
     * @return Column_priv
     */
    public String getColumnPriv() {
        return columnPriv;
    }

    /**
     * @param columnPriv
     */
    public void setColumnPriv(String columnPriv) {
        this.columnPriv = columnPriv;
    }
}