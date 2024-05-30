package com.se.riddaradb.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "FOLKLORE")
public class FolkloreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String description;

    String motifCode;

    @ManyToMany(mappedBy = "folkloreEntity")
    Set<SagaEntity> sagaEntity = new HashSet<>();

    protected FolkloreEntity() {
    }

    public FolkloreEntity(int id,
                          String name,
                          String description,
                          String motifCode) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.motifCode = motifCode;
    }

    public int getId() {
        return id;
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

    public Set<SagaEntity> getSagaEntity() {
        return sagaEntity;
    }

    public void setSagaEntity(Set<SagaEntity> sagaEntity) {
        this.sagaEntity = sagaEntity;
    }

    public void setId(int id) {
        this.id = id;


    }
}
