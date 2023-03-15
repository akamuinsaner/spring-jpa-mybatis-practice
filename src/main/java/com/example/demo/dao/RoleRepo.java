package com.example.demo.dao;


import com.example.demo.model.Role;

import java.util.List;

public interface RoleRepo {

    public List<Role> getRoles();

    public Long saveRole(Long user_id, String name);
}
