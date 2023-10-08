package com.dev.ecommerce.IRepo;

import com.dev.ecommerce.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IBookRepo extends JpaRepository<Book,String> {
}
