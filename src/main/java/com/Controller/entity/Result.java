package com.Controller.entity;

public class Result {

    /**
     * 返回消息
     */
    private String message;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 返回数据对象
     */
    private Object data;

    /**
     * 返回结果数目
     */
    private Integer count;

    public Result() {
    }

    public Result(String message, Integer code, Object data, Integer count) {
        this.message = message;
        this.code = code;
        this.data = data;
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
