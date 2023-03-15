package com.example.demo.dao;

import com.example.demo.model.Address;
import com.example.demo.model.Pet;

import java.util.List;

public interface PetRepo {

    public long savePet(Long user_id, String name);

    public List<Pet> getPets();

}
