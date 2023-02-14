package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public Controller() {
    }
    @GetMapping(path = "/get")
    public String getTwoHundred(){
        return "500";
    }
}
