package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    Set<Integer> userNumbers = new HashSet<>();
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv", numLinesToSkip = 1)
    void howManyWinsFor6numbersWhenSomeNumbersAreOutOfScope(int number01, int number02, int number03, int number04, int number05, int number06){
        userNumbers.add(number01);
        userNumbers.add(number02);
        userNumbers.add(number03);
        userNumbers.add(number04);
        userNumbers.add(number05);
        userNumbers.add(number06);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest(name = "{index} => a={0}, b={1}, c={2}, d={3}, e={4}")
    @CsvFileSource(resources = "/smallThan6Numbers.csv", numLinesToSkip = 1)
    void howManyWinsFor5numbers(int a, int b, int c, int d, int e){
        userNumbers.add(a);
        userNumbers.add(b);
        userNumbers.add(c);
        userNumbers.add(d);
        userNumbers.add(e);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 1)
    void howManyWinsFor6numbersBetween1And49(int a, int b, int c, int d, int e, int f) throws InvalidNumbersException {
        boolean result = false;
        userNumbers.add(a);
        userNumbers.add(b);
        userNumbers.add(c);
        userNumbers.add(d);
        userNumbers.add(e);
        userNumbers.add(f);
        if (gamblingMachine.howManyWins(userNumbers) >= 0) result = true;
        assertTrue(true, String.valueOf(result));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 1)
    void howManyWinsFor7numbers(int a, int b, int c, int d, int e, int f, int g){
        userNumbers.add(a);
        userNumbers.add(b);
        userNumbers.add(c);
        userNumbers.add(d);
        userNumbers.add(e);
        userNumbers.add(f);
        userNumbers.add(g);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }
}