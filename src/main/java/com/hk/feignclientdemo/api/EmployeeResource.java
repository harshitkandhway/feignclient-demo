package com.hk.feignclientdemo.api;

import com.hk.feignclientdemo.domain.Employee;
import com.hk.feignclientdemo.service.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping("/api")
public class EmployeeResource {

    @Autowired
    private EmployeeClient employeeClient;

    @GetMapping
    public ResponseEntity<List<Employee>> saveAll() {
        Employee[] retrievedEmployees = employeeClient.getUsers().getData();
        if (Objects.nonNull(retrievedEmployees))
            return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList(retrievedEmployees));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
