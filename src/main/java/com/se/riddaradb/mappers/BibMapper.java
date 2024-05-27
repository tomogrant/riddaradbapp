package com.se.riddaradb.mappers;

import com.se.riddaradb.dtos.BibDto;
import com.se.riddaradb.entities.BibEntity;
import com.se.riddaradb.entities.SagaEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class BibMapper {

    public BibDto mapToDto(BibEntity bibEntity){
        BibDto bibDto = new BibDto(bibEntity.getId(),
                bibEntity.getAuthors(),
                bibEntity.getTitle(),
                bibEntity.getEditors(),
                bibEntity.getBook(),
                bibEntity.getBookSeries(),
                bibEntity.getNumOfVolumes(),
                bibEntity.getPlaceOfPublication(),
                bibEntity.getPublisher(),
                bibEntity.getPublicationYear(),
                bibEntity.getPageNumbers());

        bibDto.setSagaIds(bibEntity.getSagaEntity()
                .stream()
                .map(SagaEntity::getId)
                .collect(Collectors.toSet()));

        return bibDto;
    }

    public BibEntity mapFromDto(BibDto bibDto){
        return new BibEntity(bibDto.getId(),
                bibDto.getAuthors(),
                bibDto.getTitle(),
                bibDto.getEditors(),
                bibDto.getBook(),
                bibDto.getBookSeries(),
                bibDto.getNumOfVolumes(),
                bibDto.getPlaceOfPublication(),
                bibDto.getPublisher(),
                bibDto.getPublicationYear(),
                bibDto.getPageNumbers());
    }
}
