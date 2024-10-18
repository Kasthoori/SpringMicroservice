package com.dev.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dev.spring.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
