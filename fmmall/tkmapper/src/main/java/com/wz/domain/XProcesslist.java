package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$processlist")
public class XProcesslist {
    @Column(name = "thd_id")
    private Long thdId;

    @Column(name = "conn_id")
    private Long connId;

    private String user;

    private String db;

    private String command;

    private String state;

    private Long time;

    @Column(name = "statement_latency")
    private Long statementLatency;

    private BigDecimal progress;

    @Column(name = "lock_latency")
    private Long lockLatency;

    @Column(name = "rows_examined")
    private Long rowsExamined;

    @Column(name = "rows_sent")
    private Long rowsSent;

    @Column(name = "rows_affected")
    private Long rowsAffected;

    @Column(name = "tmp_tables")
    private Long tmpTables;

    @Column(name = "tmp_disk_tables")
    private Long tmpDiskTables;

    @Column(name = "full_scan")
    private String fullScan;

    @Column(name = "last_statement_latency")
    private Long lastStatementLatency;

    @Column(name = "current_memory")
    private BigDecimal currentMemory;

    @Column(name = "last_wait")
    private String lastWait;

    @Column(name = "last_wait_latency")
    private String lastWaitLatency;

    private String source;

    @Column(name = "trx_latency")
    private Long trxLatency;

    @Column(name = "trx_state")
    private String trxState;

    @Column(name = "trx_autocommit")
    private String trxAutocommit;

    private String pid;

    @Column(name = "program_name")
    private String programName;

    @Column(name = "current_statement")
    private String currentStatement;

    @Column(name = "last_statement")
    private String lastStatement;

    /**
     * @return thd_id
     */
    public Long getThdId() {
        return thdId;
    }

    /**
     * @param thdId
     */
    public void setThdId(Long thdId) {
        this.thdId = thdId;
    }

    /**
     * @return conn_id
     */
    public Long getConnId() {
        return connId;
    }

    /**
     * @param connId
     */
    public void setConnId(Long connId) {
        this.connId = connId;
    }

    /**
     * @return user
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
     * @return db
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
     * @return command
     */
    public String getCommand() {
        return command;
    }

    /**
     * @param command
     */
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * @return state
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

    /**
     * @return time
     */
    public Long getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * @return statement_latency
     */
    public Long getStatementLatency() {
        return statementLatency;
    }

    /**
     * @param statementLatency
     */
    public void setStatementLatency(Long statementLatency) {
        this.statementLatency = statementLatency;
    }

    /**
     * @return progress
     */
    public BigDecimal getProgress() {
        return progress;
    }

    /**
     * @param progress
     */
    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    /**
     * @return lock_latency
     */
    public Long getLockLatency() {
        return lockLatency;
    }

    /**
     * @param lockLatency
     */
    public void setLockLatency(Long lockLatency) {
        this.lockLatency = lockLatency;
    }

    /**
     * @return rows_examined
     */
    public Long getRowsExamined() {
        return rowsExamined;
    }

    /**
     * @param rowsExamined
     */
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * @return rows_sent
     */
    public Long getRowsSent() {
        return rowsSent;
    }

    /**
     * @param rowsSent
     */
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * @return rows_affected
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    /**
     * @param rowsAffected
     */
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    /**
     * @return tmp_tables
     */
    public Long getTmpTables() {
        return tmpTables;
    }

    /**
     * @param tmpTables
     */
    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }

    /**
     * @return tmp_disk_tables
     */
    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    /**
     * @param tmpDiskTables
     */
    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    /**
     * @return full_scan
     */
    public String getFullScan() {
        return fullScan;
    }

    /**
     * @param fullScan
     */
    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    /**
     * @return last_statement_latency
     */
    public Long getLastStatementLatency() {
        return lastStatementLatency;
    }

    /**
     * @param lastStatementLatency
     */
    public void setLastStatementLatency(Long lastStatementLatency) {
        this.lastStatementLatency = lastStatementLatency;
    }

    /**
     * @return current_memory
     */
    public BigDecimal getCurrentMemory() {
        return currentMemory;
    }

    /**
     * @param currentMemory
     */
    public void setCurrentMemory(BigDecimal currentMemory) {
        this.currentMemory = currentMemory;
    }

    /**
     * @return last_wait
     */
    public String getLastWait() {
        return lastWait;
    }

    /**
     * @param lastWait
     */
    public void setLastWait(String lastWait) {
        this.lastWait = lastWait;
    }

    /**
     * @return last_wait_latency
     */
    public String getLastWaitLatency() {
        return lastWaitLatency;
    }

    /**
     * @param lastWaitLatency
     */
    public void setLastWaitLatency(String lastWaitLatency) {
        this.lastWaitLatency = lastWaitLatency;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return trx_latency
     */
    public Long getTrxLatency() {
        return trxLatency;
    }

    /**
     * @param trxLatency
     */
    public void setTrxLatency(Long trxLatency) {
        this.trxLatency = trxLatency;
    }

    /**
     * @return trx_state
     */
    public String getTrxState() {
        return trxState;
    }

    /**
     * @param trxState
     */
    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    /**
     * @return trx_autocommit
     */
    public String getTrxAutocommit() {
        return trxAutocommit;
    }

    /**
     * @param trxAutocommit
     */
    public void setTrxAutocommit(String trxAutocommit) {
        this.trxAutocommit = trxAutocommit;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return program_name
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * @param programName
     */
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * @return current_statement
     */
    public String getCurrentStatement() {
        return currentStatement;
    }

    /**
     * @param currentStatement
     */
    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement;
    }

    /**
     * @return last_statement
     */
    public String getLastStatement() {
        return lastStatement;
    }

    /**
     * @param lastStatement
     */
    public void setLastStatement(String lastStatement) {
        this.lastStatement = lastStatement;
    }
}