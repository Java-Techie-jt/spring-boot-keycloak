package com.javatechie.keycloak.repository;

import com.javatechie.keycloak.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
