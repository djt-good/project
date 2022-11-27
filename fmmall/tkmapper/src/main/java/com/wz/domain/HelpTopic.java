package com.wz.domain;

import javax.persistence.*;

@Table(name = "help_topic")
public class HelpTopic {
    @Id
    @Column(name = "help_topic_id")
    private Integer helpTopicId;

    private String name;

    @Column(name = "help_category_id")
    private Short helpCategoryId;

    private String description;

    private String example;

    private String url;

    /**
     * @return help_topic_id
     */
    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    /**
     * @param helpTopicId
     */
    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
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

    /**
     * @return example
     */
    public String getExample() {
        return example;
    }

    /**
     * @param example
     */
    public void setExample(String example) {
        this.example = example;
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