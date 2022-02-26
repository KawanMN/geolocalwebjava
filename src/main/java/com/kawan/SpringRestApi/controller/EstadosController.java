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

import com.kawan.SpringRestApi.model.Estados;
import com.kawan.SpringRestApi.service.EstadosService;

@RestController
@RequestMapping("api/v1/estados")
public class EstadosController {

    @Autowired
    private EstadosService estadosService;

    @GetMapping
    public ResponseEntity<List<Estados>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(estadosService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Estados>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(estadosService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Estados> create(@RequestBody Estados estados){
        return ResponseEntity.status(HttpStatus.CREATED).body(estadosService.save(estados));
    }

    @PutMapping
    public ResponseEntity<Estados> update(@RequestBody Estados estados){
        return ResponseEntity.status(HttpStatus.OK).body(estadosService.update(estados));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
    	estadosService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
