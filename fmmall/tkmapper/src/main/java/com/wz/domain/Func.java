package com.wz.domain;

import javax.persistence.*;

public class Func {
    @Id
    private String name;

    private Boolean ret;

    private String dl;

    private String type;

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
     * @return ret
     */
    public Boolean getRet() {
        return ret;
    }

    /**
     * @param ret
     */
    public void setRet(Boolean ret) {
        this.ret = ret;
    }

    /**
     * @return dl
     */
    public String getDl() {
        return dl;
    }

    /**
     * @param dl
     */
    public void setDl(String dl) {
        this.dl = dl;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}