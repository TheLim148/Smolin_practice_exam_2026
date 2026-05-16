package ru.example.practice13;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping("/public")
    public String publicPage() {
        return "Public page is available without login";
    }

    @GetMapping("/private")
    public String privatePage() {
        return "Private page is available only after login";
    }
}
