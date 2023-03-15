package com.example.demo.controller;

import com.example.demo.model.Role;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/getRoles")
    public List<Role> getRoles() {
        return roleService.getRoles();
    }

    @PostMapping("/saveRole")
    public Long saveRole(@RequestBody Map<String, Object> param) {
        Long user_id = ((Number) param.get("user_id")).longValue();
        String name = (String) param.get("name");
        return roleService.saveRole(user_id, name);
    }
}
