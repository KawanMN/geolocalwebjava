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

import com.kawan.SpringRestApi.model.Cidades;
import com.kawan.SpringRestApi.service.CidadesService;

@RestController
@RequestMapping("api/v1/cidades")
public class CidadesController {

    @Autowired
    private CidadesService cidadesService;

    @GetMapping
    public ResponseEntity<List<Cidades>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(cidadesService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cidades>> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(cidadesService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Cidades> create(@RequestBody Cidades cidades){
        return ResponseEntity.status(HttpStatus.CREATED).body(cidadesService.save(cidades));
    }

    @PutMapping
    public ResponseEntity<Cidades> update(@RequestBody Cidades cidades){
        return ResponseEntity.status(HttpStatus.OK).body(cidadesService.update(cidades));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
    	cidadesService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
