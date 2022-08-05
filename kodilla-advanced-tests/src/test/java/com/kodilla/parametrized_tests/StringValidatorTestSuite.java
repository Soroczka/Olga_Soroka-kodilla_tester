package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {

    private StringValidator validator = new StringValidator();
    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringIsBlank(String text){
        assertTrue(validator.isBlank(text));
    }

//    @ParameterizedTest
//    @NullSource
//    public void shouldReturnTrueIfStringIsNull(String text) {
//        assertTrue(validator.isBlank(text));
//    }
//
//    @ParameterizedTest
//    @EmptySource
//    public void shouldReturnTrueIfStringIsEmpty(String text) {
//        assertTrue(validator.isBlank(text));
//    }

    //zamiast powyższych dwóch mozna dac
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsNullOrEmpty(String text){
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }
}