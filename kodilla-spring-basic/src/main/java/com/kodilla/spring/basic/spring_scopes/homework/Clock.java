package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    private LocalTime time;
    public Clock() {
        time = LocalTime.now();
        System.out.println(time);
    }
}
