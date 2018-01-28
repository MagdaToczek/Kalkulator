package com.kodilla.kalkulator;

public class Calculator {
    private double a;
    private double b;

    public double sum(double a, double b) {
        return a + b;
    }

    public double difference(double a, double b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2.5, 3.6));
        System.out.println(calculator.difference(5.5, 3.6));
    }
}
