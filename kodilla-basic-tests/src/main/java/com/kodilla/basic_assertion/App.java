package com.kodilla.basic_assertion;

public class App {

    public static void checkResult (int result, boolean correct){
        if (correct){
            System.out.println("Correct: "+result);
        } else {
            System.out.println("Not correct: "+result);
        }
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sumResult = calculator.sumOfTwoNumbers(5, 8);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        checkResult(sumResult, correct);

        int subResult = calculator.subtractionOfTwoNumbers(10, 2);
        boolean correctSub = ResultChecker.assertEquals(8, subResult);
        checkResult(subResult, correctSub);


    }
}
