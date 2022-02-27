package com.example.foodforthought.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @GetMapping("/")
    public String index() {
        return "Index";
    }
    @GetMapping("/Aboutus")
    public String AboutUs() {
        return "AboutUs";
    }
    @GetMapping("/Beneficials")
    public String Beneficials() {
        return "Beneficials";
    }



}
