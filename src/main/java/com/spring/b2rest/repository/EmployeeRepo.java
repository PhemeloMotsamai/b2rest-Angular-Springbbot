package com.spring.b2rest.repository;

import com.spring.b2rest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {


    void deleteEmployeeById(Long id);

    // QUERY METHOD
    Optional findEmployeeById(Long id);

}

