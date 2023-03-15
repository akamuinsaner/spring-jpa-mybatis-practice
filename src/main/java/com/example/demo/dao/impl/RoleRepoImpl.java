package com.example.demo.dao.impl;

import com.example.demo.dao.RoleRepo;
import com.example.demo.model.Role;
import com.example.demo.model.SysUserRole;
import com.example.demo.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
@Transactional
public class RoleRepoImpl implements RoleRepo {

    @Autowired
    EntityManager entityManager;

    @Override
    public Long saveRole(Long user_id, String name) {
        User user = entityManager.find(User.class, user_id);
        Role role = new Role();
        role.setName(name);
        entityManager.persist(role);
        Long role_id = role.getId();
        SysUserRole sysUserRole = new SysUserRole();
        sysUserRole.setRole_id(role_id);
        sysUserRole.setUser_id(user_id);
        entityManager.persist(sysUserRole);
        Set<Role> roles = user.getRoles();
        roles.add(role);
        user.setRoles(roles);
        entityManager.merge(user);
        return role_id;
    }

    @Override
    public List<Role> getRoles() {
        String jpql = "select r from Role r";
        Query query = entityManager.createQuery(jpql, Role.class);
        return query.getResultList();
    }
}
