package com.wz.domain;

import javax.persistence.*;

@Table(name = "help_keyword")
public class HelpKeyword {
    @Id
    @Column(name = "help_keyword_id")
    private Integer helpKeywordId;

    private String name;

    /**
     * @return help_keyword_id
     */
    public Integer getHelpKeywordId() {
        return helpKeywordId;
    }

    /**
     * @param helpKeywordId
     */
    public void setHelpKeywordId(Integer helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
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
}