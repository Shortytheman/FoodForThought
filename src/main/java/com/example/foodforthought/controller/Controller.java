package com.example.foodforthought.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

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
    @GetMapping("/signup/terms")
    public String terms() {
        return "terms";
    }
}
