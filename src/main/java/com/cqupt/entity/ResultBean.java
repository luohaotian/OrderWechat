package com.cqupt.entity;


import com.cqupt.enums.ResultEnum;

import java.io.Serializable;

/**
 * Created by 罗浩 on 2017/9/21.
 */

public class ResultBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public  static  final int SUCCEESS = 0;

    public static final int FAIL = 1;

    public static final int NO_PERMISSION = 2;

    private String msg = "success";

    private int code = SUCCEESS;

    private T data;

    public ResultBean(){
        super();
    }

    public ResultBean(T data){
        super();
        this.data = data;
    }

    public ResultBean(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.data = data;
    }

    public ResultBean(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = FAIL;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static int getSUCCEESS() {
        return SUCCEESS;
    }

    public static int getFAIL() {
        return FAIL;
    }

    public static int getNoPermission() {
        return NO_PERMISSION;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }

    public static void main(String[] args) {
        ResultBean resultBean = null;
        System.out.println(resultBean.toString());
    }
}
