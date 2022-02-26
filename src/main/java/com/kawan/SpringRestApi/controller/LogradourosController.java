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

import com.kawan.SpringRestApi.model.Logradouros;
import com.kawan.SpringRestApi.service.LogradourosService;

@RestController
@RequestMapping("api/v1/logradouros")
public class LogradourosController {

    @Autowired
    private LogradourosService logradourosService;

    @GetMapping
    public ResponseEntity<List<Logradouros>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(logradourosService.findAll());
    }

    @GetMapping("/{cd_logradouro}")
    public ResponseEntity<Optional<Logradouros>> findById(@PathVariable String cd_logradouro){
        return ResponseEntity.status(HttpStatus.OK).body(logradourosService.findById(cd_logradouro));
    }

    @PostMapping
    public ResponseEntity<Logradouros> create(@RequestBody Logradouros logradouros){
        return ResponseEntity.status(HttpStatus.CREATED).body(logradourosService.save(logradouros));
    }

    @PutMapping
    public ResponseEntity<Logradouros> update(@RequestBody Logradouros logradouros){
        return ResponseEntity.status(HttpStatus.OK).body(logradourosService.update(logradouros));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String cd_logradouro){
    	logradourosService.deleteById(cd_logradouro);
        return ResponseEntity.status(HttpStatus.OK).build();	
    }

}
