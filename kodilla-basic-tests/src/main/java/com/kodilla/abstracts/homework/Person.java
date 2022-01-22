package com.kodilla.abstracts.homework;

public class Person {

    public String firstName;
    public int age;
    public String job;

    public Person(String firstName, int age, String job) {
        super();
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void String (Job job) {
        System.out.println("Obowiązki:" + job.getResponsibilities());
    }

    public static void main(String[] args) {
        Person teacher = new Person("Anna", 29, "nauczyciel");
        Person seller = new Person("Piotr", 45, "sprzedawca");
        Person accountant = new Person("Iwona", 52, "księgowa");
        Person doctor = new Person("Dawid", 36, "lekarz");

    }
}

