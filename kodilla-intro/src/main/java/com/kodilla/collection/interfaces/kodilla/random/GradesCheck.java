package com.kodilla.collection.interfaces.kodilla.random;

public class GradesCheck {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(3);
        grades.add(5);
        grades.add(2);
        grades.getLastGrade();
        grades.calculateAverage();
    }
}
