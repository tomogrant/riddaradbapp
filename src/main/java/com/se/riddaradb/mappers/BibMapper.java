package com.se.riddaradb.mappers;

import com.se.riddaradb.dtos.BibDto;
import com.se.riddaradb.entities.BibEntity;
import org.springframework.stereotype.Service;

@Service
public class BibMapper {

    public BibDto mapToDto(BibEntity bibEntity){
        return new BibDto(bibEntity.getId(), bibEntity.getAuthors(), bibEntity.getTitle(),
                bibEntity.getPlaceOfPublication(), bibEntity.getPublisher(),
                bibEntity.getPublicationDate(), bibEntity.getPageNumbers());
    }

    public BibEntity mapFromDto(BibDto bibDto){
        return new BibEntity(bibDto.getId(), bibDto.getAuthors(), bibDto.getTitle(),
                bibDto.getPlaceOfPublication(), bibDto.getPublisher(),
                bibDto.getPublicationDate(), bibDto.getPageNumbers());
    }
}
