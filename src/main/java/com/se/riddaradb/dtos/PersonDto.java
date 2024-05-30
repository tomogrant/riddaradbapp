package com.se.riddaradb.dtos;

import java.util.HashSet;
import java.util.Set;

public class PersonDto {

    int id;
    String name;
    String species;
    Set<Integer> placeIds;
    Set<Integer> sagaIds;

    public PersonDto(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
        placeIds = new HashSet<>();
        sagaIds = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Set<Integer> getPlaceIds() {
        return placeIds;
    }

    public void setPlaceIds(Set<Integer> placeIds) {
        this.placeIds = placeIds;
    }

    public Set<Integer> getSagaIds() {
        return sagaIds;
    }

    public void setSagaIds(Set<Integer> sagaIds) {
        this.sagaIds = sagaIds;
    }
}
