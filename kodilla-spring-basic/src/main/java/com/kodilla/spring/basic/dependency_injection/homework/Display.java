package com.kodilla.spring.basic.dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void display(double value){
        System.out.println("Value: " + value);
    }
}
