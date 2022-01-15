package com.kodilla.random;

import java.util.ArrayList;

public class Grades {
    private int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {

        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(3);

        int lastGrade = list.get(list.size() - 1);
        return lastGrade;
    }

    public double calculateAverage() {
        double[] gradebook = {5, 4, 2, 5, 3};
        double sum = 0.0;
        int numberOfGrades = gradebook.length;

        for (int i = 0; i < gradebook.length; i++) {
            sum += gradebook[i];
        }

        double averageGrades = sum / numberOfGrades;
        return averageGrades;
    }

}










