package com.kawan.SpringRestApi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kawan.SpringRestApi.model.Cidades;

public interface CidadesRepository extends JpaRepository<Cidades, String> {

}
