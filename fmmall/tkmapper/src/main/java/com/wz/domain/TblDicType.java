package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_dic_type")
public class TblDicType {
    /**
     * 编码是主键，不能为空，不能含有中文。
     */
    @Id
    private String code;

    private String name;

    private String description;

    /**
     * 获取编码是主键，不能为空，不能含有中文。
     *
     * @return code - 编码是主键，不能为空，不能含有中文。
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码是主键，不能为空，不能含有中文。
     *
     * @param code 编码是主键，不能为空，不能含有中文。
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}