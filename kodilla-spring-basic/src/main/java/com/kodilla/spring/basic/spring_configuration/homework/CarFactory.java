package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Cat;
import com.kodilla.spring.basic.spring_configuration.Dog;
import com.kodilla.spring.basic.spring_configuration.Duck;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

import static com.kodilla.spring.basic.spring_configuration.homework.Season.*;

@Configuration
public class CarFactory {

    public static Season season;

    private static Enum generateSeason(){
        Random generator = new Random();
        int chosen = generator.nextInt(4);
        if (chosen == 0){
            season = Spring;
        } else if (chosen == 1){
            season = Summer;
        } else if (chosen == 2){
            season = Autumn;
        }
        else season = Winter;
        System.out.println("Generated season: " +season);
        return season;
    }


    @Bean
    public Car selectCarForSeason(){
        Car car;
        generateSeason();
        if (Summer.equals(season)) {
            car = new Cabrio();
            return car;
        } else if (Winter.equals(season)){
            car = new SUV();
            return car;
        } else {
            car = new Sedan();
            return car;
        }
    }


}
