package com.group2.group2Employee.repository;

import com.group2.group2Employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    String deleteByIdNo(int idNo);

    Employee findByDepartment(String department);

    Employee findByidNo(int idNo);
}
