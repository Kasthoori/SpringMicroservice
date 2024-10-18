package com.dev.spring.service;

import org.springframework.stereotype.Service;

import com.dev.spring.dto.ProductRequest;
import com.dev.spring.model.Product;
import com.dev.spring.repository.ProductRepository;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Builder
@RequiredArgsConstructor
@Slf4j
public class ProductService {
	
	// To save products in database it need product repository class and inject it
	private final ProductRepository productRepository;
	
	public void createProduct(ProductRequest productRequest) {
		
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
		
		productRepository.save(product);
		log.info("Product Successfully Saved");
	}

}
