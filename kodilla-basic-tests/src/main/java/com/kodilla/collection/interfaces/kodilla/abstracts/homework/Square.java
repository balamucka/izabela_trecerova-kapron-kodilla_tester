package com.kodilla.collection.interfaces.kodilla.abstracts.homework;

public class Square extends Shape {

    public double a;
    public double SurfaceArea() {
        return a*a;
    }

    public double Perimeter() {
        return 4*a;
    }
}
