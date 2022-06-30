package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Peugeot;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.homework.CarUtils.describeCar;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Opel(10));
        cars.add(new Ford(100));
        cars.add(new Peugeot(15));

        cars.remove(2);

        System.out.println(cars.size());
        for (Car car: cars){
            describeCar(car);
        }

        Car ford = new Ford(100);
        cars.remove(ford);

        System.out.println(cars.size());
        for (Car car: cars){
            describeCar(car);
        }

    }
}
