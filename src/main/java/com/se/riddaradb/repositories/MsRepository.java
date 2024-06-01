package com.se.riddaradb.repositories;

import com.se.riddaradb.entities.MsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsRepository extends JpaRepository<MsEntity, Integer> {
}
