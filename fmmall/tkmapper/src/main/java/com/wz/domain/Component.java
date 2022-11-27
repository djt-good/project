package com.wz.domain;

import javax.persistence.*;

public class Component {
    @Id
    @Column(name = "component_id")
    private Integer componentId;

    @Column(name = "component_group_id")
    private Integer componentGroupId;

    @Column(name = "component_urn")
    private String componentUrn;

    /**
     * @return component_id
     */
    public Integer getComponentId() {
        return componentId;
    }

    /**
     * @param componentId
     */
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    /**
     * @return component_group_id
     */
    public Integer getComponentGroupId() {
        return componentGroupId;
    }

    /**
     * @param componentGroupId
     */
    public void setComponentGroupId(Integer componentGroupId) {
        this.componentGroupId = componentGroupId;
    }

    /**
     * @return component_urn
     */
    public String getComponentUrn() {
        return componentUrn;
    }

    /**
     * @param componentUrn
     */
    public void setComponentUrn(String componentUrn) {
        this.componentUrn = componentUrn;
    }
}