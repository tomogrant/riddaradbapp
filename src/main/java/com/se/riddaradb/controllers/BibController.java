package com.se.riddaradb.controllers;

import com.se.riddaradb.dtos.BibDto;
import com.se.riddaradb.services.BibService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class BibController {

    final BibService bibService;

    public BibController(BibService bibService) {
        this.bibService = bibService;
    }

    @GetMapping("/getbibentries")
    Collection<BibDto> getBibEntries(){
        return bibService.getBibEntries();
    }

    @PostMapping("/postbibentry")
    BibDto postBibEntry(@RequestBody @Valid BibDto bibDto){
        return bibService.saveBibEntry(bibDto);
    }

    @PutMapping("/putbibentry")
    BibDto putBibEntry(@RequestBody @Valid BibDto bibDto){
        return bibService.saveBibEntry(bibDto);
    }

    @DeleteMapping("/deletebibentry/{id}")
    void deleteSaga(@PathVariable int id){
        bibService.deleteBibEntryById(id);
    }
}
