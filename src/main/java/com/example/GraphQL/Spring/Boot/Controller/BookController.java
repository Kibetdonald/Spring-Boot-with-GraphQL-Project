package com.example.GraphQL.Spring.Boot.Controller;

import com.example.GraphQL.Spring.Boot.Models.Book;
import com.example.GraphQL.Spring.Boot.Repository.BookRepository;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @SchemaMapping(typeName = "Query", value = "allbooks")
    public List<Book> fetchAllBooks(){
   return bookRepository.findAll();
    }
}
