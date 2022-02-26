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

import com.kawan.SpringRestApi.model.Municipios;
import com.kawan.SpringRestApi.service.MunicipiosService;

@RestController
@RequestMapping("api/v1/municipios")
public class MunicipiosController {

    @Autowired
    private MunicipiosService municipiosService;

    @GetMapping
    public ResponseEntity<List<Municipios>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(municipiosService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Municipios>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(municipiosService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Municipios> create(@RequestBody Municipios municipios){
        return ResponseEntity.status(HttpStatus.CREATED).body(municipiosService.save(municipios));
    }

    @PutMapping
    public ResponseEntity<Municipios> update(@RequestBody Municipios municipios){
        return ResponseEntity.status(HttpStatus.OK).body(municipiosService.update(municipios));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
    	municipiosService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
