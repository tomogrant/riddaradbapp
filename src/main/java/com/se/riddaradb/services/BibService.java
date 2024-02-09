package com.se.riddaradb.services;

import com.se.riddaradb.dtos.BibDto;
import com.se.riddaradb.mappers.BibMapper;
import com.se.riddaradb.entities.BibEntity;
import com.se.riddaradb.repositories.BibRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BibService {

    final BibRepository bibRepository;
    final BibMapper bibMapper;

    public BibService(BibRepository bibRepository, BibMapper bibMapper) {
        this.bibRepository = bibRepository;
        this.bibMapper = bibMapper;
    }

    public Collection<BibDto> getBibEntries(){
        return bibRepository.findAll()
                .stream()
                .map(bibMapper::mapToDto)
                .toList();
    }

    public BibDto saveBibEntry(BibDto bibDto){
        BibEntity bibEntity = bibMapper.mapFromDto(bibDto);
        return bibMapper.mapToDto(bibRepository.save(bibEntity));
    }

    public void deleteBibEntryById(int id){
        bibRepository.deleteById(id);
    }
}
