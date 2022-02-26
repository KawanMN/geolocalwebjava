package com.kawan.SpringRestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawan.SpringRestApi.model.Municipios;
import com.kawan.SpringRestApi.repository.MunicipiosRepository;

@Service
public class MunicipiosServiceImpl implements MunicipiosService{

    @Autowired
    private MunicipiosRepository municipiosRepository;

    @Override
    public Municipios save(Municipios municipios) {
        return municipiosRepository.save(municipios);
    }

    @Override
    public List<Municipios> findAll() {
        return municipiosRepository.findAll();
    }

    @Override
    public Optional<Municipios> findById(Long id) {
        return municipiosRepository.findById(id);
    }

    @Override
    public Municipios update(Municipios municipios) {
        return municipiosRepository.save(municipios);
    }

    @Override
    public void deleteById(Long id) {
    	municipiosRepository.deleteById(id);
    }

}
