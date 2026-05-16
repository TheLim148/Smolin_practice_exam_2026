package ru.example.practice15;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class ScheduledMessageService {
    @Scheduled(fixedRateString = "${app.message-rate-ms}")
    public void printMessage() {
        System.out.println("Scheduled message: " + LocalTime.now());
    }
}
