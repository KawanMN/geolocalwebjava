package com.kawan.SpringRestApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kawan.SpringRestApi.model.Uf;
import com.kawan.SpringRestApi.service.UfService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/uf")
public class UfController {

    @Autowired
    private UfService ufService;

    @GetMapping
    public ResponseEntity<List<Uf>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(ufService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Uf>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(ufService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Uf> create(@RequestBody Uf uf){
        return ResponseEntity.status(HttpStatus.CREATED).body(ufService.save(uf));
    }

    @PutMapping
    public ResponseEntity<Uf> update(@RequestBody Uf uf){
        return ResponseEntity.status(HttpStatus.OK).body(ufService.update(uf));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
    	ufService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
