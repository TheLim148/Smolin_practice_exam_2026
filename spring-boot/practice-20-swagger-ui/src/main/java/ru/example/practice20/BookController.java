package ru.example.practice20;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Books", description = "Demo REST API for books")
@RestController
public class BookController {
    @Operation(summary = "Get all books")
    @GetMapping("/books")
    public List<Book> getBooks() {
        return List.of(
                new Book(1L, "Clean Code", "Robert Martin"),
                new Book(2L, "Effective Java", "Joshua Bloch"),
                new Book(3L, "Spring in Action", "Craig Walls")
        );
    }
}
