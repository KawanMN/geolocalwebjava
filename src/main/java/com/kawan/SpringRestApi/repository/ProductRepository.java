package com.kawan.SpringRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kawan.SpringRestApi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
