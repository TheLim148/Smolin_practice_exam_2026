package ru.example.practice18;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Practice 18");
        model.addAttribute("message", "MVC page rendered with Thymeleaf");
        model.addAttribute("items", List.of("Java", "Spring Boot", "Thymeleaf"));

        return "index";
    }
}
