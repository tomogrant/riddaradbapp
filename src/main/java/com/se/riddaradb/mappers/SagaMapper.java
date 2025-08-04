package com.se.riddaradb.mappers;

import com.se.riddaradb.dtos.SagaDto;
import com.se.riddaradb.entities.*;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class SagaMapper {

    public SagaDto mapToDto(SagaEntity sagaEntity){
        SagaDto sagaDto = new SagaDto(sagaEntity.getId(), sagaEntity.getName(), sagaEntity.getDescription(), sagaEntity.getDate(), sagaEntity.getIsTranslated());

        sagaDto.setBibIds(sagaEntity.getBibEntity()
                .stream()
                .map(BibEntity::getId)
                .collect(Collectors.toSet()));

        sagaDto.setFolkloreIds(sagaEntity.getFolkloreEntity()
                .stream()
                .map(FolkloreEntity::getId)
                .collect(Collectors.toSet()));

        sagaDto.setPersonIds(sagaEntity.getPersonEntity()
                .stream()
                .map(PersonEntity::getId)
                .collect(Collectors.toSet()));

        sagaDto.setPlaceIds(sagaEntity.getPlaceEntity()
                .stream()
                .map(PlaceEntity::getId)
                .collect(Collectors.toSet()));

        sagaDto.setObjectIds(sagaEntity.getObjectEntity()
                .stream()
                .map(ObjectEntity::getId)
                .collect(Collectors.toSet()));

        sagaDto.setMsIds(sagaEntity.getMsEntity()
                .stream()
                .map(MsEntity::getId)
                .collect(Collectors.toSet()));

        return sagaDto;
    }

    public SagaEntity mapFromDto(SagaDto sagaDto){
        return new SagaEntity(sagaDto.getId(), sagaDto.getName(), sagaDto.getDescription(), sagaDto.getDate(), sagaDto.getIsTranslated());
    }
}
