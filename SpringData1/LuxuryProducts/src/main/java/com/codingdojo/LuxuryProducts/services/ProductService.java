package com.codingdojo.LuxuryProducts.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.codingdojo.LuxuryProducts.repositories.ProductRepository;
import com.codingdojo.LuxuryProducts.models.Product;



@Service
public class ProductService {
    private ProductRepository productRepository;
    
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    public ArrayList<Product> all() {
        return (ArrayList<Product>) productRepository.findAll();
    }
    
    public Product findOne(Long id) {
    	return productRepository.findById(id).get();
    }
    
    public void create(Product product) {
        productRepository.save(product);
    }
    
	public void destroy(Long id){
		productRepository.deleteById(id);
	}
    
    public void update(Product product) {
    	productRepository.save(product);
    }
}