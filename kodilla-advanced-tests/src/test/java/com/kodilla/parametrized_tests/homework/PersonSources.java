package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> providePersonObjectsForTestingBMI(){
        return Stream.of(
                Arguments.of(new Person(1.7, 40), "Very severely underweight"),
                Arguments.of(new Person(1.6, 39), "Severely underweight"),
                Arguments.of(new Person(1.52, 42), "Underweight"),
                Arguments.of(new Person(1.73, 60), "Normal (healthy weight)"),
                Arguments.of(new Person(1.8, 78), "Normal (healthy weight)"),
                Arguments.of(new Person(1.7, 75),"Overweight"),
                Arguments.of(new Person(1.6, 80),"Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.63, 94),"Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.64, 110),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.67, 122),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.64, 126),"Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.59, 129),"Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.78, 200),"Obese Class VI (Hyper Obese)")
        );
    }
}
