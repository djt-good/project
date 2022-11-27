package com.wz.domain;

import javax.persistence.*;

@Table(name = "cond_instances")
public class CondInstances {
    @Id
    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "NAME")
    private String name;

    /**
     * @return OBJECT_INSTANCE_BEGIN
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * @param objectInstanceBegin
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * @return NAME
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