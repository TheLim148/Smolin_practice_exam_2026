package ru.example.practice15;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/")
    public String index() {
        return "Scheduled task is running. Check terminal every 5 seconds.";
    }
}
