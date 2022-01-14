package com.kodilla.random;

public class Grades2 {
    public static void main(String[] args) {
        double[] gradebook = {5, 4, 2, 5, 3};
        double sum = 0.0;
        int numberOfGrades = gradebook.length;

        for (int i = 0; i < gradebook.length; i++) {
            sum += gradebook[i];
        }

        double averageGrades = sum / numberOfGrades;

        System.out.println("Średnia ocen:" + " " + averageGrades);
    }
}


