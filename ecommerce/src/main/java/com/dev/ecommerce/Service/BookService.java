package com.dev.ecommerce.Service;

import com.dev.ecommerce.IRepo.IBookRepo;
import com.dev.ecommerce.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public String addBook(List<Book> books) {
        bookRepo.saveAll(books);
        return "saved";
    }

    public List<Book> get() {
        return bookRepo.findAll();
    }

    public String deleteBook() {
        bookRepo.deleteAll();
        return "deleted";
    }
}
