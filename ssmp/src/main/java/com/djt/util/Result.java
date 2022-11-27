package com.djt.util;

import lombok.Data;

@Data
public class Result {
    private Boolean flag;
    private Object data;
    private Object msg;

    public Result(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public Result(Boolean flag) {
        this.flag = flag;
    }

    public Result() {
    }

    public Result(Boolean flag, Object data, Object msg) {
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }
}
