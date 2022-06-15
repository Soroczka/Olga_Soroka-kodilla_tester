package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    private final double PI = 3.14159265359;
    private double r;

    public Circle (double r){
        super("Circle");
        this.r = r;
    }

    @Override
    public double calculateSurfaceArea() {
        return PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * r;
    }
}
