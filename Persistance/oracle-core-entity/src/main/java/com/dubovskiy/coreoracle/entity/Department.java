package com.dubovskiy.coreoracle.entity;

import javax.persistence.*;

/**
 * Created by Misha on 15.07.2015.
 */
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DEPARTMENT_ID")
    int id;
    @Column(name = "DEPARTMENT_NAME")
    String name;
    @ManyToOne
    @JoinColumn(name = "LOCATION_ID", referencedColumnName = "LOCATION_ID", nullable = false)
    Location location;


}
