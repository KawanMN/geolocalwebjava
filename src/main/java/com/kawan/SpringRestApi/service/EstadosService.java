package com.kawan.SpringRestApi.service;


import java.util.List;
import java.util.Optional;

import com.kawan.SpringRestApi.model.Estados;

public interface EstadosService {

	Estados save(Estados estados);

    List<Estados> findAll();	

    Optional<Estados> findById(Long id);

    Estados update(Estados estados);

    void deleteById(Long id);

}
