package com.cqupt.enums;

/**
 * Created by 罗浩 on 2017/11/8.
 */
public enum ResultEnum {
    UNKOWN_ERRRO(-1,"unknown-error"),
    FAIL(1,"fail"),
    SUCCESS(0,"success"),
    NO_PERMISSION(2,"no-permission")

    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
