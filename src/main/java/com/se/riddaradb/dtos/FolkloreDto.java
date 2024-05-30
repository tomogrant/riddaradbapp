package com.se.riddaradb.dtos;

import java.util.HashSet;
import java.util.Set;

public class FolkloreDto {

    int id;
    String name;
    String description;
    String motifCode;
    Set<Integer> sagaIds;

    public FolkloreDto(int id, String name, String description, String motifCode) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.motifCode = motifCode;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMotifCode() {
        return motifCode;
    }

    public void setMotifCode(String motifCode) {
        this.motifCode = motifCode;
    }

    public Set<Integer> getSagaIds() {
        return sagaIds;
    }

    public void setSagaIds(Set<Integer> sagaIds) {
        this.sagaIds = sagaIds;
    }
}
