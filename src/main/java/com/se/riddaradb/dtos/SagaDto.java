package com.se.riddaradb.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.Set;

public class SagaDto {

    int id;
    String name;
    int date;
    Boolean isTranslated;
    Set<Integer> bibIds;
    Set<Integer> folkloreIds;
    Set<Integer> personIds;
    Set<Integer> placeIds;

    public SagaDto(int id, String name, int date, Boolean isTranslated) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.isTranslated = isTranslated;
        bibIds = new HashSet<>();
        folkloreIds = new HashSet<>();
        personIds = new HashSet<>();
        placeIds = new HashSet<>();
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

    public Boolean getIsTranslated() {
        return isTranslated;
    }

    public void setIsTranslated(Boolean isTranslated) {
        this.isTranslated = isTranslated;
    }

    public Set<Integer> getBibIds() {
        return bibIds;
    }

    public void setBibIds(Set<Integer> bibIds) {
        this.bibIds = bibIds;
    }

    public Set<Integer> getFolkloreIds() {
        return folkloreIds;
    }

    public void setFolkloreIds(Set<Integer> folkloreIds) {
        this.folkloreIds = folkloreIds;
    }

    public Set<Integer> getPersonIds() {
        return personIds;
    }

    public void setPersonIds(Set<Integer> personIds) {
        this.personIds = personIds;
    }

    public Set<Integer> getPlaceIds() {
        return placeIds;
    }

    public void setPlaceIds(Set<Integer> placeIds) {
        this.placeIds = placeIds;
    }
}
