package com.dubovskiy.coreoracle.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Misha on 15.07.2015.
 */
@Entity(name = "EMPLOYEES")
public class Employee {
    @Column(name = "FIRST_NAME")
    String firstName;
    @Column(name = "LAST_NAME")
    String LastName;
    @Column(name = "EMAIL")
    String email;
    @Column(name = "PHONE_NUMBER")
    String phoneNumber;
    @Column(name = "HIRE_DATE")
    Date hireDate;
    @OneToOne(mappedBy = "employee",
            cascade = CascadeType.ALL, orphanRemoval = true)
    Department department;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID")
    private long id;
    @ManyToOne
    @JoinColumn(name = "JOB_ID", referencedColumnName = "JOB_ID", nullable = false)
    private Job job;


}
