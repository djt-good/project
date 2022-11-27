package com.wz.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "x$innodb_buffer_stats_by_schema")
public class XInnodbBufferStatsBySchema {
    private BigDecimal allocated;

    private BigDecimal data;

    private Long pages;

    @Column(name = "pages_hashed")
    private Long pagesHashed;

    @Column(name = "pages_old")
    private Long pagesOld;

    @Column(name = "rows_cached")
    private BigDecimal rowsCached;

    @Column(name = "object_schema")
    private String objectSchema;

    /**
     * @return allocated
     */
    public BigDecimal getAllocated() {
        return allocated;
    }

    /**
     * @param allocated
     */
    public void setAllocated(BigDecimal allocated) {
        this.allocated = allocated;
    }

    /**
     * @return data
     */
    public BigDecimal getData() {
        return data;
    }

    /**
     * @param data
     */
    public void setData(BigDecimal data) {
        this.data = data;
    }

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
}