package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTestSuite {

    private StringManipulator stringManipulator = new StringManipulator();

    //private static Stream<Arguments> provideStringsForTestingLength() {
//    private static Stream<Arguments> shouldCalculateStringLengthWithoutSpaces() {
//        return Stream.of(
//                Arguments.of("test", 4),
//                Arguments.of("OtHEr ", 5),
//                Arguments.of("E V e n t", 5),
//                Arguments.of("null ", 4),
//                Arguments.of("A", 1)
//        );
//    }

    @ParameterizedTest
   // @CsvSource(value = {"test,tset", "OtHEr,rehto", "EVent,tneve", "null,llun", "A,a"})
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringWithLowerCase(String input, String expected){
        assertEquals(expected, stringManipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    //@MethodSource(value = "provideStringsForTestingLength")
    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected){
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "..OtHEr :0", "E,V,e,n.t:3", "null :0", "A:0"}, delimiter = ':')
    public void shouldCountNumberOfCommas(String input, int expected) {
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }


}