package com.zdzhong.responsemodel;

public class ResponseData<T> {

    private Integer code;

    private T data;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public ResponseData<T> setData(T data) {
        this.data = data;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void ok() {
        this.code = 0;
        this.msg = "success";
    }
}
