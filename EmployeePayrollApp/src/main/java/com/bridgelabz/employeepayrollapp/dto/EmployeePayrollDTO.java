package com.bridgelabz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.ToString;

public @ToString class EmployeePayrollDTO {

    @NotBlank(message = "Employee name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    public String name;

    public long salary;
    public String gender;
    public LocalDate startDate;
    public String note;
    public String profilePic;
    public List<String> department;

    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
}
