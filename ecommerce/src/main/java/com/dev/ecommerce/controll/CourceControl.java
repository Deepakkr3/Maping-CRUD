package com.dev.ecommerce.controll;

import com.dev.ecommerce.Service.CourceService;
import com.dev.ecommerce.model.Cource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourceControl
{@Autowired
    CourceService courceService;
    @PostMapping("cource")
    public String addCource(@RequestBody List<Cource> cource){
        return courceService.addCource(cource);

    }
    @GetMapping("cources")
    public List<Cource> getCources(){
        return courceService.getCources();
    }
//    @DeleteMapping("delet")
//    public String deleteCource(){
//        return courceService.deleteCource();
//    }
}
