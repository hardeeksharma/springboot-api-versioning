package com.hardeek.practice.versioning.controller;

import com.hardeek.practice.versioning.model.EmployeeV1;
import com.hardeek.practice.versioning.model.EmployeeV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class URLVersionController {

    @GetMapping("/v1/employee")
    public EmployeeV1 getEmployeeV1(){
        return EmployeeV1.builder()
                .name("Hardeek Sharma")
                .age(28)
                .build();
    }

    @GetMapping("/v2/employee")
    public EmployeeV2 getEmployeeV2(){
        return EmployeeV2.builder()
                .firstName("Hardeek")
                .lastName("Sharma")
                .age(28)
                .build();
    }
}
