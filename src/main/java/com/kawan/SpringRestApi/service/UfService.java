package com.kawan.SpringRestApi.service;

import java.util.List;
import java.util.Optional;

import com.kawan.SpringRestApi.model.Uf;

public interface UfService {

    Uf save(Uf uf);

    List<Uf> findAll();

    Optional<Uf> findById(Long id);

    Uf update(Uf uf);

    void deleteById(Long id);

}
