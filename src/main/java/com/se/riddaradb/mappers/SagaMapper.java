package com.se.riddaradb.mappers;

import com.se.riddaradb.dtos.SagaDto;
import com.se.riddaradb.entities.SagaEntity;
import org.springframework.stereotype.Service;

@Service
public class SagaMapper {

    public SagaDto mapToDto(SagaEntity sagaEntity){
        return new SagaDto(sagaEntity.getId(), sagaEntity.getName(), sagaEntity.getDate());
    }

    public SagaEntity mapFromDto(SagaDto sagaDto){
        return new SagaEntity(sagaDto.getId(), sagaDto.getName(), sagaDto.getDate());
    }
}
