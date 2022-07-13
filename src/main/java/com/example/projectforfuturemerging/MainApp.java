package com.example.projectforfuturemerging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainApp {

    @GetMapping("lorem")
    public String lorem() {
        return "dolor sit";
    }
}

