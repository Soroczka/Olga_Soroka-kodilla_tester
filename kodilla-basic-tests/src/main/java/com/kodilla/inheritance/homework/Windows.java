package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int yearOfPublished) {
        super(yearOfPublished);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows. Loading...");
    }

    @Override
    public void turnOff() {
        System.out.println("Shutting down your windows...");
    }

}
