package com.se.riddaradb.mappers;

import com.se.riddaradb.dtos.FolkloreDto;
import com.se.riddaradb.dtos.ObjectDto;
import com.se.riddaradb.entities.FolkloreEntity;
import com.se.riddaradb.entities.ObjectEntity;
import com.se.riddaradb.entities.SagaEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ObjectMapper {

    public ObjectDto mapToDto(ObjectEntity objectEntity){
        ObjectDto objectDto = new ObjectDto(objectEntity.getId(), objectEntity.getName(), objectEntity.getDescription(), objectEntity.getType());

        objectDto.setSagaIds(objectEntity.getSagaEntity()
                .stream()
                .map(SagaEntity::getId)
                .collect(Collectors.toSet()));

        return objectDto;
    }

    public ObjectEntity mapFromDto(ObjectDto objectDto){
        return new ObjectEntity(objectDto.getId(), objectDto.getName(), objectDto.getDescription(), objectDto.getType());
    }
}
