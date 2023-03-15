package com.example.demo.dao;

import com.example.demo.model.Address;

public interface AddressRepo {

    public long saveAddress(Long user_id, String streetadd, String city);

    public Address getAddressById(int id);
}
