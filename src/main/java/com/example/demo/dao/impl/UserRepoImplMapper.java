package com.example.demo.dao.impl;
import com.example.demo.model.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepoImplMapper {

    @Autowired
    private UserMapper userMapper;

    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    public User findUserById(Long id) {
        return userMapper.findUserById(id);
    }

    public List<User> findUsers() {
        return userMapper.findUsers();
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
