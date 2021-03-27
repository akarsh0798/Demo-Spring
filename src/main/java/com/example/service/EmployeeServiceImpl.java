package com.example.service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Employee getByIgg(int igg) {
        return employeeRepository.findByIgg(igg);
    }

    @Override
    public List<Employee> getAllbyName(String name) {
        return employeeRepository.findAllByFirstName(name);
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
}
