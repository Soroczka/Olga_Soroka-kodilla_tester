package com.kodilla.abstracts.homework;

public class Triangle extends Shape{


    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c){
        super("Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean checkIsPossibleToBuildTriangle(){
        if (a > b && a > c && b + c >a){
            return true;
        } else if (b > a && b > c && a + c > b){
            return true;
        } else if (c > a && c > b && a + b > c){
            return true;
        } else {
            return false;
        }
    }

    private double checkBaseOfTriangle(){
        if (a + b >= c ){
            return c;
        } else if (a + c >= b) {
            return b;
        } else return a;

    }
    /*
    dla podstawy trójkąta c:
    h = a + c1
    h = b + c2
    c1 + c2 = c
    c1 = c - c2;
    a + c1 = b + c2
    a + c - c2 = b + c2
    a + c - b = 2c2
    (a + c - b)/2 = c2
    c1 = c - c2

     */
    private double calculateH(){
        double baseOfTriangle = checkBaseOfTriangle();
        if (a == b || b == c || a == c){
            //dla trójkąta równobocznego lub równoramiennego
            this.h = baseOfTriangle * Math.sqrt(3) / 2;
        } else {
            //dla trójkąta równoramiennego, którego podstawą jest najdłuższy z trzech boków
            double sideA = 0;
            double sideB = 0;
            double c1;
            double c2;
            if (baseOfTriangle == c){
                sideA = a;
                sideB = b;
            } else if (baseOfTriangle == a){
                sideA = b;
                sideB = c;
            } else if (baseOfTriangle == b){
                sideA = a;
                sideB = c;
            }
            c2 = (sideA + sideB - c) / 2;
            c1 = c - c2;
            this.h = Math.round(Math.sqrt(c1*c2));
        }
        return this.h;
    }
    @Override
    public double calculateSurfaceArea() {
        double baseOfTriangle = checkBaseOfTriangle();
        if (checkIsPossibleToBuildTriangle()){
            h = calculateH();
            return (baseOfTriangle * h) / 2;
        } else return 0;

    }

    @Override
    public double calculatePerimeter() {
        if (checkIsPossibleToBuildTriangle()) {
            return a + b + c;
        }
        else return 0;
    }

}
