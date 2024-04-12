package org.example;

public class Calculator {
    public double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) numerator / denominator;
    }
}
