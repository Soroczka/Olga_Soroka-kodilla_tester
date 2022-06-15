package com.kodilla.abstracts.homework;

public abstract class Shape {

    private String shapeName;

    public String getShapeName() {
        return shapeName;
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double calculateSurfaceArea();

    public abstract double calculatePerimeter();



}
