package com.kodilla.collection.interfaces.kodilla.abstracts.homework;

public class Triangle extends Shape{

    public double a, b, c, h;

    public double SurfaceArea() {
        return a*h/2;
    }
    public double Perimeter() {
        return a+b+c;
    }
}
