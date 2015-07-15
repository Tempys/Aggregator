package com.dubovskiy.coreOracleEntity.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "REGIONS")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "REGION_ID")
    private List<Country> countries;

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

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
