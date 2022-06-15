package com.kodilla.abstracts.homework;

public class App {
    public static void main(String[] args) {
        ShapeCreator creator = new ShapeCreator();

        Shape circle = new Circle(10);
        creator.creatingSelectedShape(circle);
        double circleSurfaceArea  = circle.calculateSurfaceArea();
        System.out.println(circleSurfaceArea);
        System.out.println(circle.calculatePerimeter());

        Triangle triangle = new Triangle(5,2,4);
        creator.creatingSelectedShape(triangle);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateSurfaceArea());
        Triangle wrongTriangle = new Triangle(1, 5, 3);
        creator.creatingSelectedShape(wrongTriangle);
        System.out.println(wrongTriangle.calculatePerimeter());
        System.out.println(wrongTriangle.calculateSurfaceArea());

        Rectangle rectangle = new Rectangle(1,2);
        creator.creatingSelectedShape(rectangle);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateSurfaceArea());
    }
}
