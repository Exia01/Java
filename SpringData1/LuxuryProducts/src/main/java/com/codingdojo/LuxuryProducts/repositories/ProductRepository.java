package com.codingdojo.LuxuryProducts.repositories;

import java.awt.print.Book;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.LuxuryProducts.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	// this method retrieves all the books from the database
    List<Product> findAll();
    // this method find a book by their description
    List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
}