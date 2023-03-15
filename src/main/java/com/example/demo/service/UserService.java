package com.example.demo.service;

import com.example.demo.dao.UserRepo;
import com.example.demo.dao.impl.UserRepoImplMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    @Qualifier("userRepoImplJpa")
    private UserRepo userRepo;

    @Autowired
    private UserRepoImplMapper userRepoImplMapper;

    public List<User> getUsers() {
        return userRepo.getUsers();
    }

    public User getUserById(Long id) {
        return userRepo.getUserById(id);
    }

    public Long saveUser(User user) {
        return userRepo.saveUser(user);
    }

    public User updateUser(User user) {
        return userRepo.updateUser(user);
    }

    public void deleteUser(Long id) {
        userRepo.deleteUser(id);
    }

    public void insertUserWithMapper(User user) { userRepoImplMapper.insertUser(user); }

    public User findUserByIdWithMapper(Long id) { return userRepoImplMapper.findUserById(id); }

    public List<User> findUsersWithMapper() { return userRepoImplMapper.findUsers(); }

    public void updateUserWithMapper(User user) { userRepoImplMapper.updateUser(user); }
}
