package com.example.demo.dao.impl;

import com.example.demo.dao.UserRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserRepoImplJpa implements UserRepo {

    private EntityManager entityManager;

    public UserRepoImplJpa(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    public List<User> getUsers() {
        String jpql = "select u from User u";
        Query query = entityManager.createQuery(jpql, User.class);
        List<User> list = query.getResultList();
        return list;
    }

    @Override
    public User getUserById(Long id) {
        String jpql = "select u from User u where u.id = ?1";
        Query query = entityManager.createQuery(jpql, User.class);
        query.setParameter(1, id);
        List<User> users = query.getResultList();
        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Long saveUser(User user) {
        entityManager.persist(user);
        return user.getId();
    }

    @Override
    public User updateUser(User user) {
        entityManager.merge(user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}
