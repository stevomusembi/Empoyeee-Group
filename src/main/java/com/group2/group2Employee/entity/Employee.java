package com.group2.group2Employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
    private String firstName;
    private String  lastName;
    private String gender;
    @Column(unique = true)
    private int idNo;
    private String address;
    private String department;
    private int salary;




}

