package com.se.riddaradb.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SAGA")
public class SagaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int date;

    Boolean isTranslated;

    @ManyToMany()
    @JoinTable(name = "saga-bib",
            joinColumns = @JoinColumn(name = "saga_id"),
            inverseJoinColumns = @JoinColumn(name = "bib_id"))
    Set<BibEntity> bibEntity = new HashSet<>();

    @ManyToMany()
    @JoinTable(name = "saga-folklore",
            joinColumns = @JoinColumn(name = "saga_id"),
            inverseJoinColumns = @JoinColumn(name = "folklore_id"))
    Set<FolkloreEntity> folkloreEntity = new HashSet<>();

    @ManyToMany()
    @JoinTable(name = "saga-person",
            joinColumns = @JoinColumn(name = "saga_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id"))
    Set<PersonEntity> personEntity = new HashSet<>();

    @ManyToMany()
    @JoinTable(name = "saga-place",
            joinColumns = @JoinColumn(name = "saga_id"),
            inverseJoinColumns = @JoinColumn(name = "place_id"))
    Set<PlaceEntity> placeEntity = new HashSet<>();

    protected SagaEntity() {
    }

    public SagaEntity(int id, String name, int date, Boolean isTranslated) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.isTranslated = isTranslated;
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

    public Set<BibEntity> getBibEntity() {
        return bibEntity;
    }

    public void setBibEntity(Set<BibEntity> bibEntity) {
        this.bibEntity = bibEntity;
    }

    public Set<FolkloreEntity> getFolkloreEntity() {
        return folkloreEntity;
    }

    public void setFolkloreEntity(Set<FolkloreEntity> folkloreEntity) {
        this.folkloreEntity = folkloreEntity;
    }

    public Set<PersonEntity> getPersonEntity() {
        return personEntity;
    }

    public void setPersonEntity(Set<PersonEntity> personEntity) {
        this.personEntity = personEntity;
    }

    public Set<PlaceEntity> getPlaceEntity() {
        return placeEntity;
    }

    public void setPlaceEntity(Set<PlaceEntity> placeEntity) {
        this.placeEntity = placeEntity;
    }
}
