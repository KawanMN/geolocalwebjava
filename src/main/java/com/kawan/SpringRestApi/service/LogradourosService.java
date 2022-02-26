package com.kawan.SpringRestApi.service;

import java.util.List;
import java.util.Optional;

import com.kawan.SpringRestApi.model.Logradouros;

public interface LogradourosService {

	Logradouros save(Logradouros logradouros);

    List<Logradouros> findAll();

    Optional<Logradouros> findById(String cd_logradouro);

    Logradouros update(Logradouros logradouros);

    void deleteById(String cd_logradouro);

}
