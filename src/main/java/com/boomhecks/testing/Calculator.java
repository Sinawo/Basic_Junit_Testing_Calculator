package com.boomhecks.testing;

public class Calculator {

    // Addition method
    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Subtraction method
    public int subtract(int... numbers) {
        if (numbers.length == 0) return 0;
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    // Multiplication method
    public int multiply(int... numbers) {
        if (numbers.length == 0) return 0;
        int result = 1;
        for (int number : numbers) {
            result = result * number;
        }
        return result;
    }

    // Division method
    public double divide(double... numbers) {
        if (numbers.length == 0) return 0;
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            result /= numbers[i];
        }
        return result;
    }
}

