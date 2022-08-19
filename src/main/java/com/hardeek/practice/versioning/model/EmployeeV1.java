package com.hardeek.practice.versioning.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeV1 {
    private String name;
    private int age;
}
