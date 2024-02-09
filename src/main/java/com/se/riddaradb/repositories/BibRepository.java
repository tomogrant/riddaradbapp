package com.se.riddaradb.repositories;

import com.se.riddaradb.entities.BibEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibRepository extends JpaRepository<BibEntity, Integer> {
}
