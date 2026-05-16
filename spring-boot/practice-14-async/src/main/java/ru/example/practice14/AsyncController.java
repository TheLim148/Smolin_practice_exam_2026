package ru.example.practice14;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    private final AsyncMessageService asyncMessageService;

    public AsyncController(AsyncMessageService asyncMessageService) {
        this.asyncMessageService = asyncMessageService;
    }

    @GetMapping("/async")
    public String startAsyncTask() {
        asyncMessageService.printMessageAfterDelay();
        return "Async task started. Check terminal after 2 seconds.";
    }
}
