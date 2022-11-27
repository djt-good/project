package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_dic_value")
public class TblDicValue {
    /**
     * 主键，采用UUID
     */
    @Id
    private String id;

    /**
     * 不能为空，并且要求同一个字典类型下字典值不能重复，具有唯一性。
     */
    private String value;

    /**
     * 可以为空
     */
    private String text;

    /**
     * 可以为空，但不为空的时候，要求必须是正整数
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 外键
     */
    @Column(name = "type_code")
    private String typeCode;

    /**
     * 获取主键，采用UUID
     *
     * @return id - 主键，采用UUID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键，采用UUID
     *
     * @param id 主键，采用UUID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取不能为空，并且要求同一个字典类型下字典值不能重复，具有唯一性。
     *
     * @return value - 不能为空，并且要求同一个字典类型下字典值不能重复，具有唯一性。
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置不能为空，并且要求同一个字典类型下字典值不能重复，具有唯一性。
     *
     * @param value 不能为空，并且要求同一个字典类型下字典值不能重复，具有唯一性。
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取可以为空
     *
     * @return text - 可以为空
     */
    public String getText() {
        return text;
    }

    /**
     * 设置可以为空
     *
     * @param text 可以为空
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取可以为空，但不为空的时候，要求必须是正整数
     *
     * @return order_no - 可以为空，但不为空的时候，要求必须是正整数
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置可以为空，但不为空的时候，要求必须是正整数
     *
     * @param orderNo 可以为空，但不为空的时候，要求必须是正整数
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取外键
     *
     * @return type_code - 外键
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * 设置外键
     *
     * @param typeCode 外键
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
}