package com.SCD.ProiectSCD.Employees;

import com.SCD.ProiectSCD.Departments.Department;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
@Entity
public class Employee {

    @Id
    @Getter
    @Setter
    @GeneratedValue
    Integer id;
    @Column
    @Getter
    @Setter
    String name;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "departmentId", insertable = false, updatable = false)
    @Getter @Setter
    Department department;
    @Column(name = "departmentId")
    @Getter
    @Setter
    Integer departmentId;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "managerId", insertable = false, updatable = false)
    @Getter @Setter
    Employee manager;
    @Column(name = "managerId")
    @Getter
    @Setter
    Integer managerId;

    @Column
    @Getter
    @Setter
    String email;

}