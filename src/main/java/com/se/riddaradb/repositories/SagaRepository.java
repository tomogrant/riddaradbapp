package com.se.riddaradb.repositories;

import com.se.riddaradb.entities.SagaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SagaRepository extends JpaRepository<SagaEntity, Integer> {
}
