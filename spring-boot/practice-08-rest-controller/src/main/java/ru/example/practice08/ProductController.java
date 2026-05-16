package ru.example.practice08;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<Product> getProducts() {
        return List.of(
                new Product(1L, "Keyboard", 2500),
                new Product(2L, "Mouse", 1200),
                new Product(3L, "Monitor", 15000)
        );
    }
}
