package com.queries.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.queries.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Custom native query method to find employees by department
    @Query(value = "SELECT * FROM Employee e WHERE e.department = :department", nativeQuery = true)
    List<Employee> findByDepartment(@Param("department") String department);
}
