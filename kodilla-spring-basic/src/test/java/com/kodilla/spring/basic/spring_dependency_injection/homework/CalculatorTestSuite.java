package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.homework.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldDisplayResultOfSum(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(5.789123, 10.9871234);
        Assertions.assertEquals(16.776, result, 0.001);
    }

    @Test
    public void shouldDisplayResultOfSubtraction(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(5.9876, 0.123);
        Assertions.assertEquals(5.865, result, 0.001);
    }

    @Test
    public void shouldDisplayResultOfMultiply(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(53.33, 7.77);
        Assertions.assertEquals(414.374, result, 0.001);
    }

    @Test
    public void shouldDisplayResultOfDivision(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(4.99, 1.5);
        Assertions.assertEquals(3.327, result, 0.001);
    }
}
