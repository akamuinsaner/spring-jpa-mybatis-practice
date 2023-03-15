package com.example.demo.controller;

import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/saveAddress")
    public Long saveAddress(@RequestBody Map<String, Object> param) {
        if (param != null) {
            Long user_id = ((Number) param.get("user_id")).longValue();
            String street = (String) param.get("street");
            String city = (String) param.get("city");
            return addressService.saveAddress(user_id, street, city);
        } else {
            throw new RuntimeException("");
        }
    }
}
