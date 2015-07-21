package com.dubovskiy.coreoracle.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Misha on 15.07.2015.
 */
@Entity(name = "JOBS")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "JOB_ID")
    String id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "job")
    Set<Employee> employees;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "job")
    Set<JobHistory> jobHistories;
    @Column(name = "JOB_TITLE")
    String title;
    @Column(name = "MIN_SALARY")
    int minSalary;
    @Column(name = "MAX_SALARY")
    int maxSalary;

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<JobHistory> getJobHistories() {
        return jobHistories;
    }

    public void setJobHistories(Set<JobHistory> jobHistories) {
        this.jobHistories = jobHistories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }
}
