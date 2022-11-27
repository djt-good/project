package com.wz.domain;

import javax.persistence.*;

@Table(name = "session_connect_attrs")
public class SessionConnectAttrs {
    @Id
    @Column(name = "PROCESSLIST_ID")
    private Long processlistId;

    @Id
    @Column(name = "ATTR_NAME")
    private String attrName;

    @Column(name = "ATTR_VALUE")
    private String attrValue;

    @Column(name = "ORDINAL_POSITION")
    private Integer ordinalPosition;

    /**
     * @return PROCESSLIST_ID
     */
    public Long getProcesslistId() {
        return processlistId;
    }

    /**
     * @param processlistId
     */
    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
    }

    /**
     * @return ATTR_NAME
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * @param attrName
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    /**
     * @return ATTR_VALUE
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * @param attrValue
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * @return ORDINAL_POSITION
     */
    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    /**
     * @param ordinalPosition
     */
    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }
}