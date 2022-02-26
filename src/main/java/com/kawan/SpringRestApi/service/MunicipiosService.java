package com.kawan.SpringRestApi.service;

import java.util.List;
import java.util.Optional;

import com.kawan.SpringRestApi.model.Municipios;

public interface MunicipiosService {

    Municipios save(Municipios municipios);

    List<Municipios> findAll();

    Optional<Municipios> findById(Long id);

    Municipios update(Municipios municipios);

    void deleteById(Long id);

}
