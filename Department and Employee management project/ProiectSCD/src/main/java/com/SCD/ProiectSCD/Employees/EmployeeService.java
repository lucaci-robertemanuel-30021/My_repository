package com.SCD.ProiectSCD.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {
    ////CRUD Employee////
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).get();
    }

    public void createEmployee(Employee e){
        employeeRepository.save(e);
    }

    public Employee updateEmployee(Integer id, Employee updatedEmployee) {

        if (employeeRepository.existsById(id)) {


            Employee existingEmployee = employeeRepository.findById(id).get();


            updatedEmployee.setId(id);


            if (updatedEmployee.getName() != null) {
                existingEmployee.setName(updatedEmployee.getName());
            }
            if (updatedEmployee.getEmail() != null) {
                existingEmployee.setEmail(updatedEmployee.getEmail());
            }
            if (updatedEmployee.getManagerId() != null) {
                existingEmployee.setManagerId(updatedEmployee.getManagerId());
            }
            if (updatedEmployee.getManager() != null) {
                existingEmployee.setManager(updatedEmployee.getManager());
            }
            if (updatedEmployee.getDepartment() != null) {
                existingEmployee.setDepartment(updatedEmployee.getDepartment());
            }
            if (updatedEmployee.getDepartmentId() != null) {
                existingEmployee.setDepartmentId(updatedEmployee.getDepartmentId());
            }

            return employeeRepository.save(existingEmployee);
        } else {
            throw new RuntimeException("Could not find employee with id: " + id);
        }
    }
   /* public Employee updateEmployee(Integer id, Employee e){

        if(employeeRepository.existsById(id)){

            Employee existingEmployee = employeeRepository.findById(id).get();

            e.setId(id);

            if (Objects.nonNull(e.getName())) {
                existingEmployee.setName(e.getName());
            }
            if (Objects.nonNull(e.getEmail())) {
                existingEmployee.setEmail(e.getEmail());
            }
            if (Objects.nonNull(e.getManagerId())){
                existingEmployee.setManagerId(e.getManagerId());
            }
            if (Objects.nonNull(e.getManager())){
                existingEmployee.setManager(e.getManager());
            }
            if (Objects.nonNull(e.getDepartment())){
                existingEmployee.setDepartment(e.getDepartment());
            }
            if (Objects.nonNull(e.getDepartmentId())){
                existingEmployee.setDepartmentId(e.getDepartmentId());
            }

            return employeeRepository.save(e);
        }else
            throw  new RuntimeException("Could not find employee with id: "+id);
    }*/

    public void deleteEmployeeById(Integer id){employeeRepository.deleteById(id);}

    public void deleteAllEmployees(){employeeRepository.deleteAll();}

    //////////////////////////////
    //for the 2 custom querries//
    public List<Employee> getAllEmployeesFromDepartment(Integer departmentId) {
        return employeeRepository.getAllEmployeesFromDepartment(departmentId);
    }
    public List<Employee> getAllManagersFromDepartment(Integer departmentId) {
        return employeeRepository.getAllManagersFromDepartment(departmentId);
    }

}
