package com.jap.calculator;

public class MathematicalCalculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        int division = 0;
        try {
            division = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("e " + e);
        }
        return division;
    }

    public int modulo(int num1, int num2) {
        return num1 % num2;
    }
}
