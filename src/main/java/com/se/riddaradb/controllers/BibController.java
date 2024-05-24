package com.se.riddaradb.controllers;

import com.se.riddaradb.dtos.BibDto;
import com.se.riddaradb.services.BibService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class BibController {
//note
    final BibService bibService;

    public BibController(BibService bibService) {
        this.bibService = bibService;
    }

    @GetMapping("/getbibentries")
    Collection<BibDto> getBibEntries(){
        return bibService.getBibEntries();
    }

    @PostMapping("/postbibentry")
    BibDto postBibEntry(@RequestBody BibDto bibDto){
        return bibService.saveBibEntry(bibDto);
    }

    @PutMapping("/putbibentry")
    BibDto putBibEntry(@RequestBody BibDto bibDto){
        return bibService.saveBibEntry(bibDto);
    }

    @DeleteMapping("/deletebibentry/{id}")
    void deleteSaga(@PathVariable int id){
        bibService.deleteBibEntryById(id);
    }
}
