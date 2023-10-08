package com.dev.ecommerce.controll;

import com.dev.ecommerce.Service.LaptopService;
import com.dev.ecommerce.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopControll {
    @Autowired
    LaptopService laptopService;
    @PostMapping("laptop")
    public String addLaptop(@RequestBody List<Laptop> laptop){
        return laptopService.addLaptop(laptop);
    }
    @GetMapping("laptop")
    public List<Laptop> getLaptop(){
        return laptopService.getLaptop();
    }
    @DeleteMapping("laptop")
    public String deleteLaptop(){
        return laptopService.deleteLaptop();
    }
}
