package com.kodilla.collections.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Peugeot;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+1];

        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();

        for (Car car: cars)
            CarUtils.describeCar(car);

    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCar = random.nextInt(3);
        int a = getRandomSpeed(random);
        int b = getRandomSpeedInitialValue(random);

        if (drawnCar == 0) {
        Ford ford = new Ford(b);
        ford.increaseSpeed(a);
        return ford;
        }
        else if (drawnCar == 0) {
            Opel opel = new Opel(b);
            opel.increaseSpeed(a);
            return opel;
        }
        else {
            Peugeot peugeot = new Peugeot(b);
            peugeot.increaseSpeed(a);
            return peugeot;
        }

    }

    private static int getRandomSpeedInitialValue(Random random) {
        int randomInitialValue = random.nextInt(100)+ 1;
        return randomInitialValue;
    }

    private static int getRandomSpeed(Random random) {
        int randomSpeed = random.nextInt(100)+ 1;
        return randomSpeed;
    }
}
