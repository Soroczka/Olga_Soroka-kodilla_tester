package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldTurnOnLightsForCreatedCar(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCarForSeason");
        System.out.println(car.getCarType());
        //When
        boolean isLightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(20, 1));
        //Then
        Assertions.assertTrue(isLightsTurnedOn);
    }

    @Test
    public void shouldTurnOffLightsForCreatedCar(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCarForSeason");
        System.out.println(car.getCarType());
        //When
        boolean isLightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(6, 1));
        //Then
        Assertions.assertFalse(isLightsTurnedOn);
    }


    @Test
    public void shouldCreateRandomCarAndReturnItsType(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCarForSeason");
        //When
        //boolean isLightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(6, 1));
        String carType = car.getCarType();
        System.out.println(car.getCarType());
        //Then
        List<String> possibleCar = Arrays.asList("Sedan", "SUV", "Cabrio");
        Assertions.assertTrue(possibleCar.contains(carType));

    }

}
