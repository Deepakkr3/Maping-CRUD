package com.dev.ecommerce.IRepo;

import com.dev.ecommerce.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ILaptopRepo extends JpaRepository<Laptop,String> {
}
