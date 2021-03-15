package com.example.webservice;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1.0")
public class EmployeeWebService {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping(value="/add")
    public Employee add(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
}
