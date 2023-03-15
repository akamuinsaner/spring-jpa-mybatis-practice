package com.example.demo.dao.impl;

import com.example.demo.dao.PetRepo;
import com.example.demo.model.User;
import com.example.demo.model.Pet;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PetRepoImpl implements PetRepo {

    @Autowired
    EntityManager entityManager;

    @Override
    public long savePet(Long user_id, String name) {
        User user = entityManager.find(User.class, user_id);
        if (user == null) {
            throw new RuntimeException("用户不存在");
        } else {
            Pet pet = new Pet();
            pet.setName(name);
            pet.setUser(user);
            entityManager.persist(pet);
            return pet.getId();
        }
    }

    @Override
    public List<Pet> getPets() {
        String jpql = "select p from Pet p";
        Query query = entityManager.createQuery(jpql, Pet.class);
        return query.getResultList();
    }
}
