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
    @GetMapping("/EmployeeById/{id}")
    public Employee findEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("/EmployeeByDepartment/{department}")
    public Employee findEmployeeByDepartment(@PathVariable String department){
        return employeeService.findByDepartment(department);
    }
    @GetMapping("/EmployeeByidNo/{idNo}")
    public Employee findEmployeeByidNo(@PathVariable int idNo){
        return employeeService.findByIdNo(idNo);
    }
    @DeleteMapping("/deleteEmployee/{idNo}")
    public String deleteEmployee(@PathVariable int idNo){
        return employeeService.deleteEmployee(idNo);
    }
    @PutMapping("/updateEmployee/{idNo}")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
}
