package com.wz.domain;

import javax.persistence.*;

@Table(name = "user_defined_functions")
public class UserDefinedFunctions {
    @Id
    @Column(name = "UDF_NAME")
    private String udfName;

    @Column(name = "UDF_RETURN_TYPE")
    private String udfReturnType;

    @Column(name = "UDF_TYPE")
    private String udfType;

    @Column(name = "UDF_LIBRARY")
    private String udfLibrary;

    @Column(name = "UDF_USAGE_COUNT")
    private Long udfUsageCount;

    /**
     * @return UDF_NAME
     */
    public String getUdfName() {
        return udfName;
    }

    /**
     * @param udfName
     */
    public void setUdfName(String udfName) {
        this.udfName = udfName;
    }

    /**
     * @return UDF_RETURN_TYPE
     */
    public String getUdfReturnType() {
        return udfReturnType;
    }

    /**
     * @param udfReturnType
     */
    public void setUdfReturnType(String udfReturnType) {
        this.udfReturnType = udfReturnType;
    }

    /**
     * @return UDF_TYPE
     */
    public String getUdfType() {
        return udfType;
    }

    /**
     * @param udfType
     */
    public void setUdfType(String udfType) {
        this.udfType = udfType;
    }

    /**
     * @return UDF_LIBRARY
     */
    public String getUdfLibrary() {
        return udfLibrary;
    }

    /**
     * @param udfLibrary
     */
    public void setUdfLibrary(String udfLibrary) {
        this.udfLibrary = udfLibrary;
    }

    /**
     * @return UDF_USAGE_COUNT
     */
    public Long getUdfUsageCount() {
        return udfUsageCount;
    }

    /**
     * @param udfUsageCount
     */
    public void setUdfUsageCount(Long udfUsageCount) {
        this.udfUsageCount = udfUsageCount;
    }
}