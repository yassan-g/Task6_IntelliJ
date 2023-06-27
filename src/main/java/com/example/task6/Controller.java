package com.example.task6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class Controller {

    @GetMapping("/localtime")
    public LocalTime getLocalTime() {
        return LocalTime.now();
    }
}
