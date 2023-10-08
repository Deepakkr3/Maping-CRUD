package com.dev.ecommerce.controll;

import com.dev.ecommerce.Service.BookService;
import com.dev.ecommerce.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookControll {
    @Autowired
    BookService BookService;
    @PostMapping("book" )
    public String addBook(@RequestBody List<Book> books){
        return BookService.addBook(books);
    }
    @GetMapping("books")
    public List<Book> getBooks(){
        return BookService.get();
    }
    @DeleteMapping("delete")
    public String deleteBook(){
        return BookService.deleteBook();
    }
}
