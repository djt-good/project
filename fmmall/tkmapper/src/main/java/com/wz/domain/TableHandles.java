package com.wz.domain;

import javax.persistence.*;

@Table(name = "table_handles")
public class TableHandles {
    @Id
    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "OBJECT_TYPE")
    private String objectType;

    @Column(name = "OBJECT_SCHEMA")
    private String objectSchema;

    @Column(name = "OBJECT_NAME")
    private String objectName;

    @Column(name = "OWNER_THREAD_ID")
    private Long ownerThreadId;

    @Column(name = "OWNER_EVENT_ID")
    private Long ownerEventId;

    @Column(name = "INTERNAL_LOCK")
    private String internalLock;

    @Column(name = "EXTERNAL_LOCK")
    private String externalLock;

    /**
     * @return OBJECT_INSTANCE_BEGIN
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * @param objectInstanceBegin
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * @return OBJECT_TYPE
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * @param objectType
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * @return OBJECT_SCHEMA
     */
    public String getObjectSchema() {
        return objectSchema;
    }

    /**
     * @param objectSchema
     */
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    /**
     * @return OBJECT_NAME
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * @return OWNER_THREAD_ID
     */
    public Long getOwnerThreadId() {
        return ownerThreadId;
    }

    /**
     * @param ownerThreadId
     */
    public void setOwnerThreadId(Long ownerThreadId) {
        this.ownerThreadId = ownerThreadId;
    }

    /**
     * @return OWNER_EVENT_ID
     */
    public Long getOwnerEventId() {
        return ownerEventId;
    }

    /**
     * @param ownerEventId
     */
    public void setOwnerEventId(Long ownerEventId) {
        this.ownerEventId = ownerEventId;
    }

    /**
     * @return INTERNAL_LOCK
     */
    public String getInternalLock() {
        return internalLock;
    }

    /**
     * @param internalLock
     */
    public void setInternalLock(String internalLock) {
        this.internalLock = internalLock;
    }

    /**
     * @return EXTERNAL_LOCK
     */
    public String getExternalLock() {
        return externalLock;
    }

    /**
     * @param externalLock
     */
    public void setExternalLock(String externalLock) {
        this.externalLock = externalLock;
    }
}