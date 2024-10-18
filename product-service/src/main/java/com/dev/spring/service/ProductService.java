package com.dev.spring.service;

import org.springframework.stereotype.Service;

import com.dev.spring.dto.ProductRequest;
import com.dev.spring.model.Product;

import lombok.Builder;

@Service
@Builder
public class ProductService {
	
	public void createProduct(ProductRequest productRequest) {
		
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
	}

}
