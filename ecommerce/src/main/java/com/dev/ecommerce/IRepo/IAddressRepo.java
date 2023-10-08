package com.dev.ecommerce.IRepo;

import com.dev.ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IAddressRepo extends JpaRepository<Address,Long> {
}
