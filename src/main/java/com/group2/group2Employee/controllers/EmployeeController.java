package com.group2.group2Employee.controllers;

import com.group2.group2Employee.entity.Employee;
import com.group2.group2Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/Employees")
     public List<Employee> findEmployees(){
        return employeeService.getAllEmployees();
    }
}
