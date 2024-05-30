package com.se.riddaradb.mappers;

import com.se.riddaradb.dtos.PersonDto;
import com.se.riddaradb.dtos.PlaceDto;
import com.se.riddaradb.entities.PersonEntity;
import com.se.riddaradb.entities.PlaceEntity;
import com.se.riddaradb.entities.SagaEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PlaceMapper {

    public PlaceDto mapToDto(PlaceEntity placeEntity){
        PlaceDto placeDto = new PlaceDto(placeEntity.getId(), placeEntity.getName(), placeEntity.getType());

        placeDto.setPersonIds(placeEntity.getPersonEntity()
                .stream()
                .map(PersonEntity::getId)
                .collect(Collectors.toSet()));

        placeDto.setSagaIds(placeEntity.getSagaEntity()
                .stream()
                .map(SagaEntity::getId)
                .collect(Collectors.toSet()));

        return placeDto;
    }

    public PlaceEntity mapFromDto(PlaceDto placeDto){
        return new PlaceEntity(placeDto.getId(), placeDto.getName(), placeDto.getType());
    }
}
