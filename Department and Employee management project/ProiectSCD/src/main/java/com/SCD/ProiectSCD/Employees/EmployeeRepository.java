package com.SCD.ProiectSCD.Employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query(value = "SELECT * FROM Employee e WHERE e.department_id = :departmentId", nativeQuery = true)
    List<Employee> getAllEmployeesFromDepartment(@Param("departmentId") Integer departmentId);

    @Query(value = "SELECT * FROM Employee e WHERE e.department_id = :departmentId AND e.manager_id IS NULL", nativeQuery = true)
    List<Employee> getAllManagersFromDepartment(@Param("departmentId") Integer managerId);
}


