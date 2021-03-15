package com.example.service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public Employee getByName(String name) {
        return employeeRepository.findByFullName(name);
    }

    @Override
    public Employee getById(int id) {
        return employeeRepository.findByEmployeeId(id);
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
}
