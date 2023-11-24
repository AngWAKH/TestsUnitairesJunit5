package com.wakhsas.testing;

public class Calculator {
    public double add(double a, double b){

        return a + b;
    }
    public double subtract(double a, double b){

        return a - b;
    }
    public double multiply(double a, double b){

        return a * b;
    }

    public int divide(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
