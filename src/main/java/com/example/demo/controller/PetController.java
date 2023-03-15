package com.example.demo.controller;

import com.example.demo.model.Pet;
import com.example.demo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    PetService petService;

    @PostMapping("/savePet")
    public Long savePet(@RequestBody Map<String, Object> param) {
        if (param != null) {
            Long user_id = ((Number) param.get("user_id")).longValue();
            String name = (String) param.get("name");
            return petService.savePet(user_id, name);
        } else {
            throw new RuntimeException("");
        }
    }

    @GetMapping("/getPets")
    public List<Pet> getPets() {
        return petService.getPets();
    }
}
