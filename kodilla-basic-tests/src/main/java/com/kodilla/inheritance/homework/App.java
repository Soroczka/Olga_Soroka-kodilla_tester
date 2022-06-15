package com.kodilla.inheritance.homework;

public class App {
    public static void main(String[] args) {
        Windows windows10 = new Windows(2015);
        Linux kaliLinux = new Linux(2021);
        System.out.println(kaliLinux.getYearOfPublished());
        kaliLinux.turnOn();
        windows10.turnOn();
        System.out.println(windows10.getYearOfPublished());
        kaliLinux.turnOff();
        windows10.turnOff();
    }

}
