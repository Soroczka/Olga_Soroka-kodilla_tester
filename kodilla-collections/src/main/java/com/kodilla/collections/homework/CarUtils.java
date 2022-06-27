package com.kodilla.collections.homework;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Peugeot;

public class CarUtils {
    public static void describeCar (Car car){
        System.out.println();
        System.out.println("Car model: " + getCarName(car));
        System.out.println("Car actual speed: "+car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Peugeot)
            return "Peugeot";
        else
            return "Unknown car name";
    }
}
