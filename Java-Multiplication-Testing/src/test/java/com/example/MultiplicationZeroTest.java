package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationZeroTest {

    @Test
    public void testMultiplyByZero() {
        Multiplication multiplication = new Multiplication();
        assertEquals(0, multiplication.multiply(5, 0));
    }
}

