package com.se.riddaradb.repositories;

import com.se.riddaradb.entities.ObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRepository extends JpaRepository<ObjectEntity, Integer> {
}
