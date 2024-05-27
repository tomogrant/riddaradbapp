package com.se.riddaradb.services;

import com.se.riddaradb.dtos.SagaDto;
import com.se.riddaradb.mappers.SagaMapper;
import com.se.riddaradb.entities.SagaEntity;
import com.se.riddaradb.repositories.BibRepository;
import com.se.riddaradb.repositories.SagaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
public class SagaService {

    final SagaRepository sagaRepository;
    final BibRepository bibRepository;
    final SagaMapper sagaMapper;

    public SagaService(SagaRepository sagaRepository, BibRepository bibRepository, SagaMapper sagaMapper) {
        this.sagaRepository = sagaRepository;
        this.bibRepository = bibRepository;
        this.sagaMapper = sagaMapper;
    }

    public Collection<SagaDto> getSagas(){
        return sagaRepository.findAll()
                .stream()
                .map(sagaMapper::mapToDto)
                .toList();
    }

    public SagaDto saveSaga(SagaDto sagaDto){
        SagaEntity sagaEntity = sagaMapper.mapFromDto(sagaDto);
        sagaEntity.setBibEntity(new HashSet<>(bibRepository.findAllById(sagaDto.getBibIds())));
        return sagaMapper.mapToDto(sagaRepository.save(sagaEntity));
    }

    public void deleteSagaById(int id){
        sagaRepository.deleteById(id);
    }
}
