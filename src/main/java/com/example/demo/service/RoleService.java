package com.example.demo.service;

import com.example.demo.dao.RoleRepo;
import com.example.demo.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleRepo roleRepo;

    public Long saveRole(Long user_id, String name) {
        return roleRepo.saveRole(user_id, name);
    }

    public List<Role> getRoles() {
        return roleRepo.getRoles();
    }
}
