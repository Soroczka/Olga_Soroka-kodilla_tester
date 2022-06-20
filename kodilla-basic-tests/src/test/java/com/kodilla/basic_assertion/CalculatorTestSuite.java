package com.kodilla.basic_assertion;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {

    @BeforeAll
    public static void beforeTests(){
        System.out.println("Tests started.");
    }

    @AfterAll
    public static void afterTests(){
        System.out.println("Tests completed.");
    }


    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sumOfTwoNumbers(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int subResult = calculator.subtractionOfTwoNumbers(10, 5);
        assertEquals(5, subResult);
    }

    @Test
    public void testInvolutionWhenPow0(){
        Calculator calculator = new Calculator();
        double powResult = calculator.involution(10,0);
        assertEquals(1, powResult);
    }

    @Test
    public void testInvolutionWhenPowIsMinus(){
        Calculator calculator = new Calculator();
        double powResult = calculator.involution(10.1, -2);
        assertEquals(0.01, powResult, 0.001);
    }

    @Test
    public void testInvolutionWhenPowIsPlus(){
        Calculator calculator = new Calculator();
        double powResult = calculator.involution(10.1, 2.2);
        assertEquals(162, powResult, 0.1);
    }

}
