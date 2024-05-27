package com.se.riddaradb.dtos;

import java.util.HashSet;
import java.util.Set;

public class SagaDto {

    int id;
    String name;
    int date;
    Boolean isTranslated;
    Set<Integer> bibIds;

    public SagaDto(int id, String name, int date, Boolean isTranslated) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.isTranslated = isTranslated;
        bibIds = new HashSet<>();
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Boolean getTranslated() {
        return isTranslated;
    }

    public void setTranslated(Boolean isTranslated) {
        this.isTranslated = isTranslated;
    }

    public Set<Integer> getBibIds() {
        return bibIds;
    }

    public void setBibIds(Set<Integer> bibIds) {
        this.bibIds = bibIds;
    }
}
