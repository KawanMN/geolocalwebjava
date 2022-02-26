package com.kawan.SpringRestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawan.SpringRestApi.model.Logradouros;
import com.kawan.SpringRestApi.repository.LogradourosRepository;

@Service
public class LogradouroServiceImpl implements LogradourosService{

    @Autowired
    private LogradourosRepository logradouroRepository;

    @Override
    public Logradouros save(Logradouros logradouro) {
        return logradouroRepository.save(logradouro);
    }

    @Override
    public List<Logradouros> findAll() {
        return logradouroRepository.findAll();
    }

    @Override
    public Optional<Logradouros> findById(String cd_logradouro) {
        return logradouroRepository.findById(cd_logradouro);
    }

    @Override
    public Logradouros update(Logradouros logradouro) {
        return logradouroRepository.save(logradouro);
    }

    @Override
    public void deleteById(String cd_logradouro) {
    	logradouroRepository.deleteById(cd_logradouro);
    }

}
	