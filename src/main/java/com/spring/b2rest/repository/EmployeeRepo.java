package com.spring.b2rest.repository;

import com.spring.b2rest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}

