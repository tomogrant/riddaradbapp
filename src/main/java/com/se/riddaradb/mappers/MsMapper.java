package com.se.riddaradb.mappers;

import com.se.riddaradb.dtos.MsDto;
import com.se.riddaradb.dtos.ObjectDto;
import com.se.riddaradb.entities.MsEntity;
import com.se.riddaradb.entities.ObjectEntity;
import com.se.riddaradb.entities.SagaEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class MsMapper {

    public MsDto mapToDto(MsEntity msEntity){
        MsDto msDto = new MsDto(msEntity.getId(), msEntity.getName(), msEntity.getDescription(), msEntity.getShelfMark());

        msDto.setSagaIds(msEntity.getSagaEntity()
                .stream()
                .map(SagaEntity::getId)
                .collect(Collectors.toSet()));

        return msDto;
    }

    public MsEntity mapFromDto(MsDto msDto){
        return new MsEntity(msDto.getId(), msDto.getName(), msDto.getDescription(), msDto.getShelfMark());
    }
}
