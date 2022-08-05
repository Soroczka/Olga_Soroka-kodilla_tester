package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();
// k\.s@k\.kasia
    @ParameterizedTest
    @ValueSource(strings = {"t", "t@m", "FF", "#ammm", "QwE)",
            "   ", "12 ", "12 34", " 123", ""})
    void validateUsernameInUnexpectedForm(String text) {
        boolean result = userValidator.validateUsername(text);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"aY1", "111", "AAA", "AYZ", "_a.B-",
            "uhdughaiughguiha82572857945810512985718965_--_.", "0-9A_Z.za"})
    void validateExpectedUsername(String text) {
        boolean result = userValidator.validateUsername(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"s@b\\.c3\\.d", "k\\.s@k\\.a", "9_Aa-0\\.1_-aA@1-\\.a", "9_Aa-0\\.1_-aA@1-\\.aZaZaZ",
            "olga_s\\.-1@1-\\.aZaZaZ\\.sfffdd", "olga_s\\.-1@1-\\.a09\\.z", "s\\.a@b\\.c\\.d", "s\\.a@b\\.c", "s2@b2\\.d"})
    void validateExpectedEmail(String text) {
        boolean result = userValidator.validateEmail(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"olga.s@abc.com", " \\.a@b\\.c\\.d", "s \\.a@b\\.c\\.d", "s\\.a@b\\.2c", "s\\.a@b\\.c\\.d3"})
    void validateUnexpectedEmail(String text) {
        boolean result = userValidator.validateEmail(text);
        assertFalse(result);
    }
}