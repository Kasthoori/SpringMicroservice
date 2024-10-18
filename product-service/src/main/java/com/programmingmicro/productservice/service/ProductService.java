package com.programmingmicro.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.programmingmicro.productservice.dto.ProductRequest;
import com.programmingmicro.productservice.dto.ProductResponse;
import com.programmingmicro.productservice.model.Product;
import com.programmingmicro.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
	
	private final ProductRepository productRepository = null;
	
	public void createProduct(ProductRequest productRequest) {
		
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
		
		productRepository.save(product);
		log.info("Product  {} is saved", product.getId());
		
	}

	public List<ProductResponse> getAllProducts() {
		// TODO Auto-generated method stub
		
		List<Product> products = productRepository.findAll();
		
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
