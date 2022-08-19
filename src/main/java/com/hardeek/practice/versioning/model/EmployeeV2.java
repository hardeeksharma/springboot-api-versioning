package com.hardeek.practice.versioning.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeV2 {
    private String firstName;
    private String lastName;
    private int age;
}
