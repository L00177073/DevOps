package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationPositiveTest {

    @Test
    public void testMultiplyPositiveNumbers() {
        Multiplication multiplication = new Multiplication();
        assertEquals(12, multiplication.multiply(3, 4));
    }
}
