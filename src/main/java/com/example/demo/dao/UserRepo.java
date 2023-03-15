package com.example.demo.dao;
import com.example.demo.model.User;

import java.util.List;

public interface UserRepo {
    public List<User> getUsers();

    public User getUserById(Long id);

    public Long saveUser(User user);

    public User updateUser(User user);

    public void deleteUser(Long id);
}
