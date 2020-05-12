package com.hk.feignclientdemo.service;

import com.hk.feignclientdemo.domain.FeignEmployeeResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://dummy.restapiexample.com/api/v1",name = "USER-CLIENT")
public interface EmployeeClient {
    @GetMapping("/employees")
    public FeignEmployeeResponse getUsers();
}
