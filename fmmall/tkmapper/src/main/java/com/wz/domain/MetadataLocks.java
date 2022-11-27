package com.wz.domain;

import javax.persistence.*;

@Table(name = "metadata_locks")
public class MetadataLocks {
    @Id
    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "OBJECT_TYPE")
    private String objectType;

    @Column(name = "OBJECT_SCHEMA")
    private String objectSchema;

    @Column(name = "OBJECT_NAME")
    private String objectName;

    @Column(name = "COLUMN_NAME")
    private String columnName;

    @Column(name = "LOCK_TYPE")
    private String lockType;

    @Column(name = "LOCK_DURATION")
    private String lockDuration;

    @Column(name = "LOCK_STATUS")
    private String lockStatus;

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "OWNER_THREAD_ID")
    private Long ownerThreadId;

    @Column(name = "OWNER_EVENT_ID")
    private Long ownerEventId;

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
     * @return COLUMN_NAME
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * @return LOCK_TYPE
     */
    public String getLockType() {
        return lockType;
    }

    /**
     * @param lockType
     */
    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    /**
     * @return LOCK_DURATION
     */
    public String getLockDuration() {
        return lockDuration;
    }

    /**
     * @param lockDuration
     */
    public void setLockDuration(String lockDuration) {
        this.lockDuration = lockDuration;
    }

    /**
     * @return LOCK_STATUS
     */
    public String getLockStatus() {
        return lockStatus;
    }

    /**
     * @param lockStatus
     */
    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    /**
     * @return SOURCE
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
}