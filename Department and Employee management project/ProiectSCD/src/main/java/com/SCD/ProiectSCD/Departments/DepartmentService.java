package com.SCD.ProiectSCD.Departments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    public void createDepartment(Department d){
        departmentRepository.save(d);
    }

    public Optional<Department> findDepartmentById(Integer id){return departmentRepository.findById(id);}


    public Department updateDepartment(Integer id, Department d) {

        Department existingDepartment = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Could not find department with id: " + id));


        if (d.getDescription() != null) {
            existingDepartment.setDescription(d.getDescription());
        }

        if (d.getParentId() != null) {
            existingDepartment.setParentId(d.getParentId());
        }

        if (d.getParentDepartment() != null) {
            existingDepartment.setParentDepartment(d.getParentDepartment());
        }

        return departmentRepository.save(existingDepartment);
    }
   /* public Department updateDepartment(Integer id, Department d){

        Department existingDepartment = departmentRepository.findById(id).get();

        if (Objects.nonNull(d.getDescription())) {
            existingDepartment.setDescription(d.getDescription());
        }
        if (Objects.nonNull(d.getParentId())) {
            existingDepartment.setParentId(d.getParentId());
        }
        if (Objects.nonNull(d.getParentDepartment())){
            existingDepartment.setParentDepartment(d.getParentDepartment());
        }

        if(departmentRepository.existsById(id)){
            d.setId(id);
            return departmentRepository.save(d);
    }else
        throw  new RuntimeException("Could not find department with id: "+id);
    }*/

    public void deleteDepartmentById(Integer id){departmentRepository.deleteById(id);}

    public void deleteAllDepartments(){departmentRepository.deleteAll();}

    /////////////////////////////////////////

}

