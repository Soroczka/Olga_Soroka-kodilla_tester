package com.kodilla.basic_assertion;

public class Calculator {

//    private int firstNumber;
//    private int secondNumber;
//
//    public Calculator(int firstNumber, int secondNumber) {
//        this.firstNumber = firstNumber;
//        this.secondNumber = secondNumber;
//    }

    public int sumOfTwoNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int subtractionOfTwoNumbers(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public double involution(double number, double power){
        return Math.pow(number, power);
    }
}
