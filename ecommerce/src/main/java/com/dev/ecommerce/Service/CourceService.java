package com.dev.ecommerce.Service;

import com.dev.ecommerce.IRepo.ICourceRepo;
import com.dev.ecommerce.model.Cource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourceService {
    @Autowired
    ICourceRepo courceRepo;

    public String addCource(List<Cource> cource) {
        courceRepo.saveAll(cource);
        return "added";
    }

    public List<Cource> getCources() {
        return courceRepo.findAll();
    }

//    public String deleteCource() {
//        courceRepo.deleteAll();
//        return "deleted";
//    }
}
