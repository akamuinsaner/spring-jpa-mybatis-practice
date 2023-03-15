package com.example.demo.dao.impl;

import com.example.demo.dao.AddressRepo;
import com.example.demo.model.Address;
import com.example.demo.model.User;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AddressRepoImpl implements AddressRepo {

    @Autowired
    EntityManager entityManager;

    @Override
    public long saveAddress(Long user_id, String street, String city) {
        User user = entityManager.find(User.class, user_id);
        if (user == null) {
            throw new RuntimeException("用户不存在");
        } else {
            Address address = new Address();
            address.setStreet(street);
            address.setCity(city);
            address.setUser(user);
            entityManager.persist(address);
            user.setAddress(address);
            entityManager.merge(user);
            return address.getId();
        }
    }

    @Override
    public Address getAddressById(int id) {
        return new Address();
    }
}
