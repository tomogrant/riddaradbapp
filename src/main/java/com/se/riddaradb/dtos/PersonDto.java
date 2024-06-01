package com.se.riddaradb.dtos;

import com.se.riddaradb.entities.PersonEntity;

import java.util.HashSet;
import java.util.Set;

public class PersonDto {

    int id;
    String name;
    PersonEntity.Species species;
    String realWorldRef;
    Set<Integer> placeIds;
    Set<Integer> sagaIds;

    public PersonDto(int id, String name, PersonEntity.Species species, String realWorldRef) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.realWorldRef = realWorldRef;
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

    public PersonEntity.Species getSpecies() {
        return species;
    }

    public void setSpecies(PersonEntity.Species species) {
        this.species = species;
    }

    public String getRealWorldRef() {
        return realWorldRef;
    }

    public void setRealWorldRef(String realWorldRef) {
        this.realWorldRef = realWorldRef;
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
