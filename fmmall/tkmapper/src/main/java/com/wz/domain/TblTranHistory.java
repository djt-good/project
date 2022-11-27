package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_tran_history")
public class TblTranHistory {
    @Id
    private String id;

    private String stage;

    private String money;

    @Column(name = "expected_date")
    private String expectedDate;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "tran_id")
    private String tranId;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * @param stage
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * @return money
     */
    public String getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(String money) {
        this.money = money;
    }

    /**
     * @return expected_date
     */
    public String getExpectedDate() {
        return expectedDate;
    }

    /**
     * @param expectedDate
     */
    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return tran_id
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * @param tranId
     */
    public void setTranId(String tranId) {
        this.tranId = tranId;
    }
}