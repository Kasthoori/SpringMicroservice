package com.programmingmicro.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.programmingmicro.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
