package com.kawan.SpringRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kawan.SpringRestApi.model.Logradouros;

public interface LogradourosRepository extends JpaRepository<Logradouros, String> {

}
