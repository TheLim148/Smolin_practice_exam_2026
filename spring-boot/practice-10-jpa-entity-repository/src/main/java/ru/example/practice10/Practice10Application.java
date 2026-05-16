package ru.example.practice10;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Practice10Application {
    public static void main(String[] args) {
        SpringApplication.run(Practice10Application.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product("Keyboard", 2500));
            productRepository.save(new Product("Mouse", 1200));
            productRepository.save(new Product("Monitor", 15000));
        };
    }
}
