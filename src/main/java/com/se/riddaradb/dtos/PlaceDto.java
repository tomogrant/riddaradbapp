package com.se.riddaradb.dtos;

import com.se.riddaradb.entities.PlaceEntity;

import java.util.HashSet;
import java.util.Set;

public class PlaceDto {

    int id;
    String name;
    PlaceEntity.Type type;
    Set<Integer> personIds;
    Set<Integer> sagaIds;

    public PlaceDto(int id, String name, PlaceEntity.Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
        sagaIds = new HashSet<>();
        personIds = new HashSet<>();
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

    public PlaceEntity.Type getType() {
        return type;
    }

    public void setType(PlaceEntity.Type type) {
        this.type = type;
    }

    public Set<Integer> getPersonIds() {
        return personIds;
    }

    public void setPersonIds(Set<Integer> personIds) {
        this.personIds = personIds;
    }

    public Set<Integer> getSagaIds() {
        return sagaIds;
    }

    public void setSagaIds(Set<Integer> sagaIds) {
        this.sagaIds = sagaIds;
    }
}
