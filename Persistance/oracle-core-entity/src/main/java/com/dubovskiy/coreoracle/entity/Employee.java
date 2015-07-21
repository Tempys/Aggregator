package com.dubovskiy.coreoracle.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Misha on 15.07.2015.
 */
@Entity(name = "EMPLOYEES")
public class Employee {
    String firstName;
    String LastName;
    String email;
    String phoneNumber;
    Date hireDate;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID")
    private long id;
    @ManyToOne
    @JoinColumn(name = "JOB_ID", referencedColumnName = "JOB_ID", nullable = false)
    private Job job;


}
