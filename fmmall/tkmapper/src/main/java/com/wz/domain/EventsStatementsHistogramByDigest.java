package com.wz.domain;

import javax.persistence.*;

@Table(name = "events_statements_histogram_by_digest")
public class EventsStatementsHistogramByDigest {
    @Column(name = "SCHEMA_NAME")
    private String schemaName;

    @Column(name = "DIGEST")
    private String digest;

    @Column(name = "BUCKET_NUMBER")
    private Integer bucketNumber;

    @Column(name = "BUCKET_TIMER_LOW")
    private Long bucketTimerLow;

    @Column(name = "BUCKET_TIMER_HIGH")
    private Long bucketTimerHigh;

    @Column(name = "COUNT_BUCKET")
    private Long countBucket;

    @Column(name = "COUNT_BUCKET_AND_LOWER")
    private Long countBucketAndLower;

    @Column(name = "BUCKET_QUANTILE")
    private Double bucketQuantile;

    /**
     * @return SCHEMA_NAME
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * @param schemaName
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * @return DIGEST
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
     * @return BUCKET_NUMBER
     */
    public Integer getBucketNumber() {
        return bucketNumber;
    }

    /**
     * @param bucketNumber
     */
    public void setBucketNumber(Integer bucketNumber) {
        this.bucketNumber = bucketNumber;
    }

    /**
     * @return BUCKET_TIMER_LOW
     */
    public Long getBucketTimerLow() {
        return bucketTimerLow;
    }

    /**
     * @param bucketTimerLow
     */
    public void setBucketTimerLow(Long bucketTimerLow) {
        this.bucketTimerLow = bucketTimerLow;
    }

    /**
     * @return BUCKET_TIMER_HIGH
     */
    public Long getBucketTimerHigh() {
        return bucketTimerHigh;
    }

    /**
     * @param bucketTimerHigh
     */
    public void setBucketTimerHigh(Long bucketTimerHigh) {
        this.bucketTimerHigh = bucketTimerHigh;
    }

    /**
     * @return COUNT_BUCKET
     */
    public Long getCountBucket() {
        return countBucket;
    }

    /**
     * @param countBucket
     */
    public void setCountBucket(Long countBucket) {
        this.countBucket = countBucket;
    }

    /**
     * @return COUNT_BUCKET_AND_LOWER
     */
    public Long getCountBucketAndLower() {
        return countBucketAndLower;
    }

    /**
     * @param countBucketAndLower
     */
    public void setCountBucketAndLower(Long countBucketAndLower) {
        this.countBucketAndLower = countBucketAndLower;
    }

    /**
     * @return BUCKET_QUANTILE
     */
    public Double getBucketQuantile() {
        return bucketQuantile;
    }

    /**
     * @param bucketQuantile
     */
    public void setBucketQuantile(Double bucketQuantile) {
        this.bucketQuantile = bucketQuantile;
    }
}