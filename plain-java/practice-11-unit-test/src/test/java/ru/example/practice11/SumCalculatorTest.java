package ru.example.practice11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumCalculatorTest {
    private final SumCalculator calculator = new SumCalculator();

    @Test
    void shouldReturnPositiveSum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    void shouldReturnNegativeSum() {
        assertEquals(-5, calculator.sum(-2, -3));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, calculator.sum(-5, 5));
    }
}
