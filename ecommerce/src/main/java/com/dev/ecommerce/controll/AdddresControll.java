package com.dev.ecommerce.controll;

import com.dev.ecommerce.Service.AddressService;
import com.dev.ecommerce.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdddresControll {
    @Autowired
    AddressService addressService;
    @PostMapping("address" )

    public String addAddress(@RequestBody List<Address> addresses)
    {
        return addressService.addAddress(addresses);
    }
    @GetMapping("address" )

    public List<Address> get(){
        return addressService.get();
    }
    @DeleteMapping("deleteAddress")
    public String deleteAddress(){
        return addressService.deleteAddress();
    }

}
