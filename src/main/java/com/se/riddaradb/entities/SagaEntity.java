package com.se.riddaradb.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

//INSERT INTO SAGA
//VALUES (1, 1300, 'text');

@Entity
@Table(name = "SAGA")
public class SagaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int date;

    Boolean isTranslated;

    @ManyToMany
    @JoinTable(name = "bib_saga",
            joinColumns = @JoinColumn(name = "saga_id"),
            inverseJoinColumns = @JoinColumn(name = "bib_id"))
    Set<BibEntity> bibEntity = new HashSet<>();

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

    public Boolean getTranslated() {
        return isTranslated;
    }

    public void setTranslated(Boolean isTranslated) {
        this.isTranslated = isTranslated;
    }

    public Set<BibEntity> getBibEntity() {
        return bibEntity;
    }

    public void setBibEntity(Set<BibEntity> bibEntity) {
        this.bibEntity = bibEntity;
    }
}
