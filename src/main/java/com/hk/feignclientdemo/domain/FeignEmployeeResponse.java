package com.hk.feignclientdemo.domain;

public class FeignEmployeeResponse {
    private String status;
    private Employee[] data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee[] getData() {
        return data;
    }

    public void setData(Employee[] data) {
        this.data = data;
    }

    public FeignEmployeeResponse() {
    }
}
