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

import com.kawan.SpringRestApi.model.Bairros;
import com.kawan.SpringRestApi.service.BairrosService;

@RestController
@RequestMapping("api/v1/bairros")
public class BairrosController {

    @Autowired
    private BairrosService bairrosService;

    @GetMapping
    public ResponseEntity<List<Bairros>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(bairrosService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Bairros>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(bairrosService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Bairros> create(@RequestBody Bairros bairros){
        return ResponseEntity.status(HttpStatus.CREATED).body(bairrosService.save(bairros));
    }

    @PutMapping
    public ResponseEntity<Bairros> update(@RequestBody Bairros bairros){
        return ResponseEntity.status(HttpStatus.OK).body(bairrosService.update(bairros));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
    	bairrosService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
	