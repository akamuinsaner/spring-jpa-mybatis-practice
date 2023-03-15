package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void insertUser(User user);

    User findUserById(long id);

    List<User> findUsers();

    void updateUser(User user);
}
