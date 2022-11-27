package com.wz.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "x$statements_with_errors_or_warnings")
public class XStatementsWithErrorsOrWarnings {
    private String db;

    @Column(name = "exec_count")
    private Long execCount;

    private Long errors;

    @Column(name = "error_pct")
    private BigDecimal errorPct;

    private Long warnings;

    @Column(name = "warning_pct")
    private BigDecimal warningPct;

    @Column(name = "first_seen")
    private Date firstSeen;

    @Column(name = "last_seen")
    private Date lastSeen;

    private String digest;

    private String query;

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
     * @return exec_count
     */
    public Long getExecCount() {
        return execCount;
    }

    /**
     * @param execCount
     */
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    /**
     * @return errors
     */
    public Long getErrors() {
        return errors;
    }

    /**
     * @param errors
     */
    public void setErrors(Long errors) {
        this.errors = errors;
    }

    /**
     * @return error_pct
     */
    public BigDecimal getErrorPct() {
        return errorPct;
    }

    /**
     * @param errorPct
     */
    public void setErrorPct(BigDecimal errorPct) {
        this.errorPct = errorPct;
    }

    /**
     * @return warnings
     */
    public Long getWarnings() {
        return warnings;
    }

    /**
     * @param warnings
     */
    public void setWarnings(Long warnings) {
        this.warnings = warnings;
    }

    /**
     * @return warning_pct
     */
    public BigDecimal getWarningPct() {
        return warningPct;
    }

    /**
     * @param warningPct
     */
    public void setWarningPct(BigDecimal warningPct) {
        this.warningPct = warningPct;
    }

    /**
     * @return first_seen
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
     * @return last_seen
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
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    /**
     * @param digest
     */
    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query
     */
    public void setQuery(String query) {
        this.query = query;
    }
}