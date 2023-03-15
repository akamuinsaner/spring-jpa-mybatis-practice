package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable() Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/saveUser")
    public Long saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @PostMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/findUserByIdWithMapper")
    public User findUserByIdWithMapper(@RequestParam("id") Long id) {
        return userService.findUserByIdWithMapper(id);
    }

    @PostMapping("/insertUserWithMapper")
    public void insertUserWithMapper(@RequestBody User user) {
        userService.insertUserWithMapper(user);
    }

    @GetMapping("/findUsersWithMapper")
    public List<User> findUsersWithMapper() {
        return userService.findUsersWithMapper();
    }

    @PostMapping("/updateUserWithMapper")
    public void updateUserWithMapper(@RequestBody User user) {
        userService.updateUserWithMapper(user);
    }
}
