package com.group2.group2Employee.service;

import com.group2.group2Employee.entity.Employee;
import com.group2.group2Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).orElse(null);
    }
    public Employee findByDepartment(String department){
        return employeeRepository.findByDepartment(department);
    }
    public Employee findByIdNo(int idNo){
        return employeeRepository.findByidNo(idNo);
    }
    public String deleteEmployee(int idNo){
        employeeRepository.deleteByIdNo(idNo);
        return " Employee removed "+idNo;
    }
    public Employee updateEmployee(Employee employee){
        Employee existingEmployee=employeeRepository.findByidNo(employee.getIdNo());
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setAddress(employee.getAddress());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setGender(employee.getGender());
        existingEmployee.setSalary(employee.getSalary());
   return employeeRepository.save(existingEmployee);
    }
}
