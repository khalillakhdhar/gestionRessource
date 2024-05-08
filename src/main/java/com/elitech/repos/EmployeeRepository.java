package com.elitech.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
