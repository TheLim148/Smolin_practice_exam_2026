package ru.example.practice14;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncMessageService {
    @Async
    public void printMessageAfterDelay() {
        try {
            Thread.sleep(2000);
            System.out.println("Async message after 2 seconds. Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.out.println("Async task was interrupted");
        }
    }
}
