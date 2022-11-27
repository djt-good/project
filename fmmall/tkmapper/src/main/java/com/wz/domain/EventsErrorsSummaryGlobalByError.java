package com.wz.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "events_errors_summary_global_by_error")
public class EventsErrorsSummaryGlobalByError {
    @Column(name = "ERROR_NUMBER")
    private Integer errorNumber;

    @Column(name = "ERROR_NAME")
    private String errorName;

    @Column(name = "SQL_STATE")
    private String sqlState;

    @Column(name = "SUM_ERROR_RAISED")
    private Long sumErrorRaised;

    @Column(name = "SUM_ERROR_HANDLED")
    private Long sumErrorHandled;

    @Column(name = "FIRST_SEEN")
    private Date firstSeen;

    @Column(name = "LAST_SEEN")
    private Date lastSeen;

    /**
     * @return ERROR_NUMBER
     */
    public Integer getErrorNumber() {
        return errorNumber;
    }

    /**
     * @param errorNumber
     */
    public void setErrorNumber(Integer errorNumber) {
        this.errorNumber = errorNumber;
    }

    /**
     * @return ERROR_NAME
     */
    public String getErrorName() {
        return errorName;
    }

    /**
     * @param errorName
     */
    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    /**
     * @return SQL_STATE
     */
    public String getSqlState() {
        return sqlState;
    }

    /**
     * @param sqlState
     */
    public void setSqlState(String sqlState) {
        this.sqlState = sqlState;
    }

    /**
     * @return SUM_ERROR_RAISED
     */
    public Long getSumErrorRaised() {
        return sumErrorRaised;
    }

    /**
     * @param sumErrorRaised
     */
    public void setSumErrorRaised(Long sumErrorRaised) {
        this.sumErrorRaised = sumErrorRaised;
    }

    /**
     * @return SUM_ERROR_HANDLED
     */
    public Long getSumErrorHandled() {
        return sumErrorHandled;
    }

    /**
     * @param sumErrorHandled
     */
    public void setSumErrorHandled(Long sumErrorHandled) {
        this.sumErrorHandled = sumErrorHandled;
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
}