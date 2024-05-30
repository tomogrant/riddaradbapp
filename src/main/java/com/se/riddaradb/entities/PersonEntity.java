package com.se.riddaradb.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PERSON")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String species;

    @ManyToMany(mappedBy = "personEntity")
    Set<PlaceEntity> placeEntity = new HashSet<>();

    @ManyToMany(mappedBy = "personEntity")
    Set<SagaEntity> sagaEntity = new HashSet<>();

    protected PersonEntity() {
    }

    public PersonEntity(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
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

    public Set<PlaceEntity> getPlaceEntity() {
        return placeEntity;
    }

    public void setPlaceEntity(Set<PlaceEntity> placeEntity) {
        this.placeEntity = placeEntity;
    }

    public Set<SagaEntity> getSagaEntity() {
        return sagaEntity;
    }

    public void setSagaEntity(Set<SagaEntity> sagaEntity) {
        this.sagaEntity = sagaEntity;
    }


}


