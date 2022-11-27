package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "innodb_buffer_stats_by_schema")
public class InnodbBufferStatsBySchema {
    private Long pages;

    @Column(name = "pages_hashed")
    private Long pagesHashed;

    @Column(name = "pages_old")
    private Long pagesOld;

    @Column(name = "rows_cached")
    private BigDecimal rowsCached;

    @Column(name = "object_schema")
    private String objectSchema;

    private String allocated;

    private String data;

    /**
     * @return pages
     */
    public Long getPages() {
        return pages;
    }

    /**
     * @param pages
     */
    public void setPages(Long pages) {
        this.pages = pages;
    }

    /**
     * @return pages_hashed
     */
    public Long getPagesHashed() {
        return pagesHashed;
    }

    /**
     * @param pagesHashed
     */
    public void setPagesHashed(Long pagesHashed) {
        this.pagesHashed = pagesHashed;
    }

    /**
     * @return pages_old
     */
    public Long getPagesOld() {
        return pagesOld;
    }

    /**
     * @param pagesOld
     */
    public void setPagesOld(Long pagesOld) {
        this.pagesOld = pagesOld;
    }

    /**
     * @return rows_cached
     */
    public BigDecimal getRowsCached() {
        return rowsCached;
    }

    /**
     * @param rowsCached
     */
    public void setRowsCached(BigDecimal rowsCached) {
        this.rowsCached = rowsCached;
    }

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
     * @return allocated
     */
    public String getAllocated() {
        return allocated;
    }

    /**
     * @param allocated
     */
    public void setAllocated(String allocated) {
        this.allocated = allocated;
    }

    /**
     * @return data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }
}