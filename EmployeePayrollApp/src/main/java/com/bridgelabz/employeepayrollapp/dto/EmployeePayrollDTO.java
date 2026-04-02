package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EmployeePayrollDTO {

    @NotBlank(message = "Employee name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    public String name;

    public long salary;

    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "name=" + name + ":salary=" + salary;
    }
}
