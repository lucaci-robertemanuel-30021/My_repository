package com.SCD.ProiectSCD.Employees;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    //////////////////////////////////////////////////////
    ////For Employee////
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    } //read all
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    } //read by id
    @PostMapping("/employee")
    public void createEmployee(@RequestBody Employee e){
       employeeService.createEmployee(e);
    } //create ~~

    @PutMapping("/employee/{id}")
    public void updateEmployee(@PathVariable Integer id, @RequestBody Employee e){employeeService.updateEmployee(id,e); } // put/modify ~

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Integer id){employeeService.deleteEmployeeById(id);} //delete by id ~~

    @DeleteMapping("/employee/deleteAll")
    public void deleteAllDepartments(){employeeService.deleteAllEmployees();} //deletes all ~~

    ///the  2 custom querries///
    @GetMapping("/employee/department/{departmentId}")
    public List<Employee> getEmployeesInDepartment(@PathVariable Integer departmentId) {
        return employeeService.getAllEmployeesFromDepartment(departmentId);
    }

    @GetMapping("/employee/managers/{departmentId}")
    public List<Employee> getManagersInDepartment(@PathVariable Integer departmentId) {
        return employeeService.getAllManagersFromDepartment(departmentId);
    }
}
