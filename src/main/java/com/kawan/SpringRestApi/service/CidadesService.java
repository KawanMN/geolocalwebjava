package com.kawan.SpringRestApi.service;



import java.util.List;
import java.util.Optional;

import com.kawan.SpringRestApi.model.Cidades;

public interface CidadesService {

	Cidades save(Cidades cidades);

    List<Cidades> findAll();

    Optional<Cidades> findById(String id);

    Cidades update(Cidades cidades);

    void deleteById(String id);

}
