package com.wz.domain;

import javax.persistence.*;

@Table(name = "schema_unused_indexes")
public class SchemaUnusedIndexes {
    @Column(name = "object_schema")
    private String objectSchema;

    @Column(name = "object_name")
    private String objectName;

    @Column(name = "index_name")
    private String indexName;

    /**
     * @return object_schema
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
     * @return object_name
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
     * @return index_name
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * @param indexName
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
}