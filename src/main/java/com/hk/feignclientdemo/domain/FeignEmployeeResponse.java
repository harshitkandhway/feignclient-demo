package com.hk.feignclientdemo.domain;

public class FeignEmployeeResponse {
    private String status;
    private Employee[] data;

    public Employee[] getData() {
        return data;
    }
}
