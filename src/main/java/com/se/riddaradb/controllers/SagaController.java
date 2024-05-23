package com.se.riddaradb.controllers;

import com.se.riddaradb.dtos.SagaDto;
import com.se.riddaradb.services.SagaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class SagaController {

    final SagaService sagaService;
    public SagaController(SagaService sagaService) {
        this.sagaService = sagaService;
    }

    @GetMapping("/getsagas")
    Collection<SagaDto> getSagas(){
        return sagaService.getSagas();
    }

    @PostMapping("/postsaga")
    SagaDto postSagas(@RequestBody SagaDto sagaDto){
        return sagaService.saveSaga(sagaDto);
    }

    @PutMapping("/putsaga")
    SagaDto putSaga(@RequestBody SagaDto sagaDto){
        return sagaService.saveSaga(sagaDto);
    }

    @DeleteMapping("/deletesaga/{id}")
    void deleteSaga(@PathVariable int id){
        sagaService.deleteSagaById(id);
    }
}
