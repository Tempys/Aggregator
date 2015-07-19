package com.dubovskiy.coreOracleEntity.entity;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "REGIONS")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REGION_ID")
    private long id;
    @Column(name = "REGION_NAME")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "region")
    private Set<Country> countries;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }
}
