package com.kawan.SpringRestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawan.SpringRestApi.model.Cepcidade;
import com.kawan.SpringRestApi.repository.CepcidadeRepository;

@Service
public class CepcidadeServiceImpl implements CepcidadeService{

    @Autowired
    private CepcidadeRepository cepcidadeRepository;

    @Override
    public Cepcidade save(Cepcidade cepcidade) {
        return cepcidadeRepository.save(cepcidade);
    }

    @Override
    public List<Cepcidade> findAll() {
        return cepcidadeRepository.findAll();
    }

    @Override
    public Optional<Cepcidade> findById(Long id) {
        return cepcidadeRepository.findById(id);
    }

    @Override
    public Cepcidade update(Cepcidade cepcidade) {
        return cepcidadeRepository.save(cepcidade);
    }

    @Override
    public void deleteById(Long id) {
    	cepcidadeRepository.deleteById(id);	
    }

}
