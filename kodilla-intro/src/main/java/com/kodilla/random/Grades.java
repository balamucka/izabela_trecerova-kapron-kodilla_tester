package com.kodilla.random;

public class Grades {
    private int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 5;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

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




