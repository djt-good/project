package com.wz.domain;

import javax.persistence.*;

@Table(name = "help_category")
public class HelpCategory {
    @Id
    @Column(name = "help_category_id")
    private Short helpCategoryId;

    private String name;

    @Column(name = "parent_category_id")
    private Short parentCategoryId;

    private String url;

    /**
     * @return help_category_id
     */
    public Short getHelpCategoryId() {
        return helpCategoryId;
    }

    /**
     * @param helpCategoryId
     */
    public void setHelpCategoryId(Short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
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
     * @return parent_category_id
     */
    public Short getParentCategoryId() {
        return parentCategoryId;
    }

    /**
     * @param parentCategoryId
     */
    public void setParentCategoryId(Short parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}