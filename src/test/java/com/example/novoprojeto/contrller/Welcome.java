package com.example.novoprojeto.contrller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Welcome {

    @GetMapping
    public String welcome(){
        return "Seja bem vindo! welcome";
    }
}
