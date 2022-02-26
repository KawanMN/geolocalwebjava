package com.kawan.SpringRestApi.service;

import java.util.List;
import java.util.Optional;

import com.kawan.SpringRestApi.model.Bairros;


public interface BairrosService {

	Bairros save(Bairros bairros);

    List<Bairros> findAll();

    Optional<Bairros> findById(Long id);

    Bairros update(Bairros bairros);

    void deleteById(Long id);

}
