package ru.example.practice12;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        User user = new User("Ivan", 20, "ivan@example.com");

        try {
            String json = objectMapper.writeValueAsString(user);
            System.out.println("Serialized object:");
            System.out.println(json);

            User restoredUser = objectMapper.readValue(json, User.class);
            System.out.println();
            System.out.println("Deserialized object:");
            System.out.println(restoredUser);
        } catch (JsonProcessingException exception) {
            System.out.println("JSON error: " + exception.getMessage());
        }
    }
}
