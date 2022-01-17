package com.kodilla.random;


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
        int grade = grades[size-1];
        System.out.println(grades[size-1]);
        return grade;
    }

    public void calculateAverage() {
        double sum = 0.0;
        int numberOfGrades = size;

        for (int i = 0; i < size; i++) {
            sum += grades[i];
        }
        double average = sum / numberOfGrades;
        System.out.println(average);
    }

}









