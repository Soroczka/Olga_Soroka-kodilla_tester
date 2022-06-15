package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem{

    public Linux(int yearOfPublished) {
        super(yearOfPublished);
    }

    @Override
    public void turnOn() {
        System.out.println("Kali Linux 2021.1 is turining on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Kali Linux. Goodbye.");
    }
}
