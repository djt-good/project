package com.wz.domain;

import javax.persistence.*;

@Table(name = "performance_timers")
public class PerformanceTimers {
    @Column(name = "TIMER_NAME")
    private String timerName;

    @Column(name = "TIMER_FREQUENCY")
    private Long timerFrequency;

    @Column(name = "TIMER_RESOLUTION")
    private Long timerResolution;

    @Column(name = "TIMER_OVERHEAD")
    private Long timerOverhead;

    /**
     * @return TIMER_NAME
     */
    public String getTimerName() {
        return timerName;
    }

    /**
     * @param timerName
     */
    public void setTimerName(String timerName) {
        this.timerName = timerName;
    }

    /**
     * @return TIMER_FREQUENCY
     */
    public Long getTimerFrequency() {
        return timerFrequency;
    }

    /**
     * @param timerFrequency
     */
    public void setTimerFrequency(Long timerFrequency) {
        this.timerFrequency = timerFrequency;
    }

    /**
     * @return TIMER_RESOLUTION
     */
    public Long getTimerResolution() {
        return timerResolution;
    }

    /**
     * @param timerResolution
     */
    public void setTimerResolution(Long timerResolution) {
        this.timerResolution = timerResolution;
    }

    /**
     * @return TIMER_OVERHEAD
     */
    public Long getTimerOverhead() {
        return timerOverhead;
    }

    /**
     * @param timerOverhead
     */
    public void setTimerOverhead(Long timerOverhead) {
        this.timerOverhead = timerOverhead;
    }
}