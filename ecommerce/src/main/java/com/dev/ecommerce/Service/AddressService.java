package com.dev.ecommerce.Service;

import com.dev.ecommerce.IRepo.IAddressRepo;
import com.dev.ecommerce.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(List<Address> addresses) {
        iAddressRepo.saveAll(addresses);
        return "saved";
    }

    public List<Address> get() {
        return iAddressRepo.findAll();
    }

    public String deleteAddress() {
        iAddressRepo.deleteAll();
        return "deleted";
    }
}
