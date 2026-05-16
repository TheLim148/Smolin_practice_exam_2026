package ru.example.practice16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(AppProperties.class)
@SpringBootApplication
public class Practice16Application {
    public static void main(String[] args) {
        SpringApplication.run(Practice16Application.class, args);
    }
}
