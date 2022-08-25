package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SUV implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = time.format(myFormatObj);

        if ((LocalTime.parse(formattedTime)).isAfter(LocalTime.of(20, 0))) {
            return true;
        } else if ((LocalTime.parse(formattedTime)).isBefore(LocalTime.of(6, 0))){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
