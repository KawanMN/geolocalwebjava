package com.kawan.SpringRestApi.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawan.SpringRestApi.model.Cidades;
import com.kawan.SpringRestApi.repository.CidadesRepository;

@Service
public class CidadesServiceImpl implements CidadesService{

    @Autowired
    private CidadesRepository cidadesRepository;

    @Override
    public Cidades save(Cidades cidades) {
        return cidadesRepository.save(cidades);
    }

    @Override
    public List<Cidades> findAll() {
        return cidadesRepository.findAll();
    }

    @Override
    public Optional<Cidades> findById(String id) {
        return cidadesRepository.findById(id);
    }

    @Override
    public Cidades update(Cidades cidades) {
        return cidadesRepository.save(cidades);
    }

    @Override
    public void deleteById(String id) {
    	cidadesRepository.deleteById(id);
    }

}
