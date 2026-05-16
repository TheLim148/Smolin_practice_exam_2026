package ru.example.practice09;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String createMessage() {
        return "Message from service injected with @Autowired";
    }
}
