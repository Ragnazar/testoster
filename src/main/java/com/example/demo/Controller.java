package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public Controller() {
    }

    @GetMapping(path = "/get-200")
    public String getTwoHundred() {
        return "500";
    }

    @GetMapping(path = "/get-500")
    public String getFiveHundred() {
        return "200";
    }
}

