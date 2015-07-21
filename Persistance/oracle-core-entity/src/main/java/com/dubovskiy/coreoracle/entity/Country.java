package com.dubovskiy.coreoracle.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "COUNTRIES")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
    Set<Location> locations;
    @ManyToOne
    private Region region;

    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }

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
