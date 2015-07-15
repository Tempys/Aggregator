package com.dubovskiy.coreOracleEntity.entity;

import javax.persistence.*;

@Entity(name = "COUNTRIES")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String name;
    @ManyToOne
    private Region region;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
