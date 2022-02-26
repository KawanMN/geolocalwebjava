package com.kawan.SpringRestApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawan.SpringRestApi.model.Uf;
import com.kawan.SpringRestApi.repository.UfRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UfServiceImpl implements UfService{

    @Autowired
    private UfRepository ufRepository;

    @Override
    public Uf save(Uf uf) {
        return ufRepository.save(uf);
    }

    @Override
    public List<Uf> findAll() {
        return ufRepository.findAll();
    }

    @Override
    public Optional<Uf> findById(Long id) {
        return ufRepository.findById(id);
    }

    @Override
    public Uf update(Uf uf) {
        return ufRepository.save(uf);
    }

    @Override
    public void deleteById(Long id) {
    	ufRepository.deleteById(id);
    }

}
