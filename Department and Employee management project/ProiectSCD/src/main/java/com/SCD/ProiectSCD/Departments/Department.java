package com.SCD.ProiectSCD.Departments;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
public class Department {

    @Id
    @Getter @Setter
    @GeneratedValue
    Integer id;

    @Column
    @Getter @Setter
    String description;

    @Column(name = "parentId")
    @Getter @Setter
    Integer parentId;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "parentId", insertable = false, updatable = false)
    @Getter @Setter
    Department parentDepartment;

}
