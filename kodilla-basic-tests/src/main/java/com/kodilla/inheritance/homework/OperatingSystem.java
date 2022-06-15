package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfPublished;

    public OperatingSystem(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void turnOn(){
        System.out.println("Turning on");
    }

    public void turnOff(){
        System.out.println("Shutting down");
    }
}
