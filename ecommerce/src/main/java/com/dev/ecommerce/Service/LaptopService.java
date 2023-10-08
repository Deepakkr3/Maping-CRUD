package com.dev.ecommerce.Service;

import com.dev.ecommerce.IRepo.ILaptopRepo;
import com.dev.ecommerce.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(List<Laptop> laptop) {
        laptopRepo.saveAll(laptop);
        return "added";
    }

    public List<Laptop> getLaptop() {
        return laptopRepo.findAll();
    }

    public String deleteLaptop() {
        laptopRepo.deleteAll();
        return "deleted";
    }
}
