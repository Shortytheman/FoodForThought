package com.example.foodforthought.controller;

import com.example.foodforthought.service.FoodForThoughtService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    FoodForThoughtService foodForThoughtService;

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/aboutus")
    public String aboutus() {
        return "aboutUs";
    }
    @GetMapping("/beneficials")
    public String beneficials() {
        return "beneficials";
    }
    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}
