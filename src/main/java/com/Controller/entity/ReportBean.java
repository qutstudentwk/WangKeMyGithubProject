package com.Controller.entity;

public class ReportBean {

    /**
     * 存放学院名
     */
    private String name;

    /**
     * 存放报表数或值
     */
    private Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
