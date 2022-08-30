package com.jap.calculator;

public class ScientificCalculator {

    public static void main(String[] args) {
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        try {
            scientificCalculator.cielOfANumber(10);
        } catch (CalculatorException e) {
            throw new RuntimeException(e);
        }
        //Call all the methods one by one and surround them by try and respective catch blocks.
        double ceil = 0;
        double floor = 0;
        long power = 0;
        double sqrt = 0;
        try {
            ceil = scientificCalculator.cielOfANumber(098.5f);
            floor = scientificCalculator.floorOfANumber(8.7f);
            power = scientificCalculator.power(6,2);
            sqrt = scientificCalculator.squareRoot(-9);
        } catch (CalculatorException e) {
            System.out.println("e = " + e);
        }
        System.out.println("ceil = " + ceil);
        System.out.println("floor = " + floor);
        System.out.println("power = " + power);
        System.out.println("sqrt = " + sqrt);
    }

    public double cielOfANumber(float num) throws CalculatorException {
        //check if num is equal to or less than 0 than throw the userdefined exception with proper message
        //or else call ceil method of Math class and return the value
        if (num == 0 || num < 0) {
            throw new CalculatorException("Number cant be zero or less then zoro");
        }

        return (int)num +1;
    }

    public double floorOfANumber(float num) throws CalculatorException {
        //check if num is equal to or less than 0 than throw the userdefined exception with proper message
        //or else call floor method of Math class and return the value
        if(num == 0 || num < 0){
            throw  new CalculatorException("Number can't be zero or less than zero");
        }
        return (int)num;
    }

    public long power(int num1, int num2) throws CalculatorException {
        //if num1 is less than num2 than throw the userdefined exception with proper message
        //else use Math pow method and return the value
        if(num1 < num2){
            throw new CalculatorException("Num1 can't be less than num2");
        }
        return (long) Math.pow(num1,num2);
    }

    public double squareRoot(int num) throws CalculatorException {
        //check if num is equal to or less than 0 than throw the userdefined exception with proper message
        //or else call sqrt method of Math class and return the value
        if(num == 0 || num < 0){
            throw new CalculatorException("Number can't be zero or less than zero");
        }
        return Math.sqrt(num);
    }
}
