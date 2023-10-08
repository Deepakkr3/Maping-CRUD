package com.dev.ecommerce.IRepo;

import com.dev.ecommerce.model.Cource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ICourceRepo extends JpaRepository<Cource,String> {
}
