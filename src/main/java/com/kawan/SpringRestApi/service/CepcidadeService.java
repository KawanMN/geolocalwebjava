package com.kawan.SpringRestApi.service;


import java.util.List;
import java.util.Optional;

import com.kawan.SpringRestApi.model.Cepcidade;

public interface CepcidadeService {

	Cepcidade save(Cepcidade cepcidade);

    List<Cepcidade> findAll();

    Optional<Cepcidade> findById(Long id);

    Cepcidade update(Cepcidade cepcidade);

    void deleteById(Long id);	

}
