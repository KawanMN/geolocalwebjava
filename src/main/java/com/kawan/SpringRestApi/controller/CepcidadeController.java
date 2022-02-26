package com.kawan.SpringRestApi.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kawan.SpringRestApi.model.Cepcidade;
import com.kawan.SpringRestApi.service.CepcidadeService;

@RestController
@RequestMapping("api/v1/cepcidade")
public class CepcidadeController {

    @Autowired
    private CepcidadeService cepcidadeService;

    @GetMapping
    public ResponseEntity<List<Cepcidade>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(cepcidadeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cepcidade>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(cepcidadeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Cepcidade> create(@RequestBody Cepcidade cepcidade){
        return ResponseEntity.status(HttpStatus.CREATED).body(cepcidadeService.save(cepcidade));
    }

    @PutMapping
    public ResponseEntity<Cepcidade> update(@RequestBody Cepcidade cepcidade){
        return ResponseEntity.status(HttpStatus.OK).body(cepcidadeService.update(cepcidade));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
    	cepcidadeService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();	
    }

}
