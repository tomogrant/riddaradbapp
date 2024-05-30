package com.se.riddaradb.mappers;

import com.se.riddaradb.dtos.PersonDto;
import com.se.riddaradb.entities.PersonEntity;
import com.se.riddaradb.entities.PlaceEntity;
import com.se.riddaradb.entities.SagaEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PersonMapper {

    public PersonDto mapToDto(PersonEntity personEntity){
        PersonDto personDto = new PersonDto(personEntity.getId(), personEntity.getName(), personEntity.getSpecies());

        personDto.setPlaceIds(personEntity.getPlaceEntity()
                .stream()
                .map(PlaceEntity::getId)
                .collect(Collectors.toSet()));

        personDto.setSagaIds(personEntity.getSagaEntity()
                .stream()
                .map(SagaEntity::getId)
                .collect(Collectors.toSet()));

        return personDto;
    }

    public PersonEntity mapFromDto(PersonDto personDto){
        return new PersonEntity(personDto.getId(), personDto.getName(), personDto.getSpecies());
    }
}
