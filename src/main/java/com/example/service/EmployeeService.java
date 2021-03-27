package com.example.service;

import com.example.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee getByName(String name);
    public Employee getById(int id);
    public Employee getByIgg(int igg);
    public List<Employee> getAllbyName(String name);
}
