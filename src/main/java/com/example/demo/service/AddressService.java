package com.example.demo.service;


import com.example.demo.dao.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public Long saveAddress(Long user_id, String street, String city) {
        return addressRepo.saveAddress(user_id, street, city);
    }
}
