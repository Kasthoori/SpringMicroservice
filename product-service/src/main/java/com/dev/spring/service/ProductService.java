package com.dev.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.spring.dto.ProductRequest;
import com.dev.spring.dto.ProductResponse;
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
	
	
	//this is constructor injection
//	public ProductService(ProductRepository productRepository) {
//		super();
//		this.productRepository = productRepository;
//	}
	
	
	public void createProduct(ProductRequest productRequest) {
		
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
		
		productRepository.save(product);
		log.info("Product {} Successfully Saved", product.getId());
	}

	
	//To create another end point to retrieve product and show 
    // it needs another class product response like product request
		

	public List<ProductResponse> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.findAll();
		
		// products.stream().map(product -> mapToProductResponse).toList();
		// This can convert to Lambda function in Java
		return products.stream().map(this::mapToProductResponse).toList();
	}
	
	private ProductResponse mapToProductResponse(Product product) {
		
		return ProductResponse.builder()
				.id(product.getId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice())
				.build();
		
	}


	

}
