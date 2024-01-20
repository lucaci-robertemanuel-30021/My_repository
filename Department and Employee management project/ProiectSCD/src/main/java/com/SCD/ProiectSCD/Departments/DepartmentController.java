package com.SCD.ProiectSCD.Departments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello boiii";
    }

    @GetMapping("/department")
    public List<Department> getAllDepartments(){
       return departmentService.getAllDepartments();
    } //read all ~~

    @GetMapping("/department/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Integer id){return departmentService.findDepartmentById(id);} //read one by id ~~

    @PostMapping("/department")
    public void createDepartment(@RequestBody Department d){
        departmentService.createDepartment(d);
    } //create ~~

    @PutMapping("/department/{id}")
    public void updateDepartment(@PathVariable Integer id, @RequestBody Department d){departmentService.updateDepartment(id,d); } // put/modify ~~

    @DeleteMapping("/department/{id}")
    public void deleteDepartment(@PathVariable Integer id){departmentService.deleteDepartmentById(id);} //delete by id ~~

    @DeleteMapping("/department/deleteAll")
    public void deleteAllDepartments(){departmentService.deleteAllDepartments();} //deletes all ~~

}
