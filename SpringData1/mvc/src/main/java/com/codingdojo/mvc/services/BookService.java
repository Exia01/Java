package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    } // creates a service for us to access the database?

    // Find all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    // Find a book by it's Id
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    // Delete Book
    public void deleteBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            bookRepository.delete(optionalBook.get()); //book repository needs to be lower case.
        }
    }

    // Update book by it's ID
    public Book updateBook(Long id, String title, String desc, String lang, int numOfPages) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            optionalBook.get().setTitle(title);
            optionalBook.get().setDescription(desc);
            optionalBook.get().setLanguage(lang);
            optionalBook.get().setNumberOfPages(numOfPages);
            return bookRepository.save(optionalBook.get());
        } else {
            return null;
        }
    }
}


