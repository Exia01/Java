package com.codingdojo.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BooksAPI {
   // this is creating a service
    private final BookService bookService;
    public BooksAPI(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/") //this is the main root
    public String index(Model model) { //creating a model
        List<Book> books = bookService.allBooks(); //using the find all service
        model.addAttribute("books", books); //passing the objects that we are receiving as books. 
        return "index";
//        return "/books/index.jsp"; // this is not needed since we are using index and we are also prepending the jsp "suffix"
    }
    
    @RequestMapping("/new") //this is the route the we will take us to the form page.
    public String newBook(@ModelAttribute("book") Book book) {
        return "new";
    }
    
    @RequestMapping(value="/books", method=RequestMethod.POST) //this is route that the form will hit to add books to the database
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "new";
        } else {
            bookService.createBook(book);
            return "redirect:/";
        }
    }

    //
    @GetMapping("/{id}") //find out by id parameter and details just one item.
	public String findOne(Model model,@PathVariable("id") Long id ) {
		model.addAttribute("book",bookService.findOne(id));
		return "deatils";
	}

    //API Routes

    // this is a post route.
    // this is passing the parameters to the book constructor // creates a book
    @RequestMapping(value = "/api/books", method = RequestMethod.POST)
    public Book create(@RequestParam(value = "title") String title, @RequestParam(value = "description") String desc,
            @RequestParam(value = "language") String lang, @RequestParam(value = "pages") int numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }

    //Update
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT) //the put method tells us this is an update.
    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") int numOfPages) {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }

    // this is the find all
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }

    // FindByID
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }

    // Delete
    @RequestMapping(value = "/api/books/{id}", method = RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }

}