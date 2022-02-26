package com.kawan.SpringRestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawan.SpringRestApi.model.Estados;
import com.kawan.SpringRestApi.repository.EstadosRepository;

@Service
public class EstadosServiceImpl implements EstadosService{

    @Autowired
    private EstadosRepository estadosRepository;

    @Override
    public Estados save(Estados estados) {
        return estadosRepository.save(estados);
    }

    @Override
    public List<Estados> findAll() {
        return estadosRepository.findAll();
    }

    @Override
    public Optional<Estados> findById(Long id) {
        return estadosRepository.findById(id);
    }

    @Override
    public Estados update(Estados estados) {
        return estadosRepository.save(estados);
    }

    @Override
    public void deleteById(Long id) {
    	estadosRepository.deleteById(id);
    }

}
