package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class demoController {

    @GetMapping("/{id}")
    public String getDemo(@PathVariable String id) {
        return "demo-" + id;
    }
    @GetMapping("/list")
    public String getDemoList() {
        return "demos";
    }


}
