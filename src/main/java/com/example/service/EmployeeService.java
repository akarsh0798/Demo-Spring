package com.example.service;

import com.example.model.Employee;
import org.springframework.stereotype.Service;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee getByName(String name);
    public Employee getById(int id);

}
