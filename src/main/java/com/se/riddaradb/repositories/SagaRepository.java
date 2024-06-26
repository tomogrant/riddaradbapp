package com.se.riddaradb.repositories;

import com.se.riddaradb.entities.SagaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface SagaRepository extends JpaRepository<SagaEntity, Integer> {
}
