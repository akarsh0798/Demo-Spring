package com.example.repository;

import com.example.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    public Employee findByEmployeeId(int id);
    public Employee findByFullName(String name);
    public  Employee findByIgg(int igg);
    public List<Employee> findAllByFirstName(String name);
}
