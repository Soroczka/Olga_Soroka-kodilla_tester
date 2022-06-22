package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void doRace(Car car){
        car.increaseSpeed(10);
        car.increaseSpeed(50);
        car.decreaseSpeed(30);
        car.increaseSpeed(40);
        car.decreaseSpeed(10);
        System.out.println("Actual speed: "+car.getSpeed());
    }

    public static void main(String[] args) {
        Car ford = new Ford(0);
        Car opel = new Opel(50);
        Car peugeot = new Peugeot(100);

        doRace(ford);
        doRace(opel);
        doRace(peugeot);
    }
}
