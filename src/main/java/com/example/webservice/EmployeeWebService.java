package com.example.webservice;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1.0")
public class EmployeeWebService {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping(value="/add")
    public ResponseEntity<String> add(@RequestBody Employee employee){
        Employee employee1=employeeService.getByIgg(employee.getIgg());
        if(employee1!=null){
            return new ResponseEntity<String>("Employee Igg " + employee.getIgg() + " Already exist ",HttpStatus.BAD_REQUEST);
        }
         employeeService.save(employee);
         return new ResponseEntity<String>("Employee " + employee.getFirstName() + " Created Successfully ",HttpStatus.CREATED);
    }
    @GetMapping(value = "/getall/{name}")
    public ResponseEntity<List<Employee>> getall(@PathVariable String name){
        return new ResponseEntity<List<Employee>>(employeeService.getAllbyName(name), HttpStatus.OK);
    }
}
