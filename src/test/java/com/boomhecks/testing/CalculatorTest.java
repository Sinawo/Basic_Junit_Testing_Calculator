package com.boomhecks.testing;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(22, calculator.add(4, 5, 6, 7));
        assertEquals(3, calculator.add(1, 2));
        assertEquals(0, calculator.add());
    }




    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-14, calculator.subtract(4, 5, 6, 7));
        assertEquals(-1, calculator.subtract(1, 2));
        assertEquals(0, calculator.subtract());
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(840, calculator.multiply(4, 5, 6, 7));
        assertEquals(2, calculator.multiply(1, 2));
        assertEquals(0, calculator.multiply());
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(0.09523809523809523, calculator.divide(4, 5, 6, 7), 0.0001);
        assertEquals(0.5, calculator.divide(1, 2), 0.0001);
        assertEquals(0, calculator.divide());
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }





}