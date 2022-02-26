package com.kawan.SpringRestApi.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawan.SpringRestApi.model.Bairros;
import com.kawan.SpringRestApi.repository.BirrosRepository;

@Service
public class BairrosServiceImpl implements BairrosService{

    @Autowired
    private BirrosRepository bairrosRepository;

    @Override
    public Bairros save(Bairros bairros) {
        return bairrosRepository.save(bairros);
    }

    @Override
    public List<Bairros> findAll() {
        return bairrosRepository.findAll();
    }

    @Override
    public Optional<Bairros> findById(Long id) {
        return bairrosRepository.findById(id);
    }

    @Override
    public Bairros update(Bairros bairros) {
        return bairrosRepository.save(bairros);
    }

    @Override
    public void deleteById(Long id) {
    	bairrosRepository.deleteById(id);
    }

}
