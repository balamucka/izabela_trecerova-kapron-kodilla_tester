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
        int grade = grades[9];
        System.out.println(grades[9]);
    }

    public void calculateAverage() {
        int sum = 0.0;
        int numberOfGrades = grades.length;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        int average = sum / numberOfGrades;
        System.out.println(average);
    }

}









