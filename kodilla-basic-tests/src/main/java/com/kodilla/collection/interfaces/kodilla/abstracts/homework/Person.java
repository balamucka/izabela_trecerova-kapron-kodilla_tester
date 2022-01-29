package com.kodilla.collection.interfaces.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public String getFirstName() {
        return firstName;
    }

    public void displayFirstName() {
        System.out.print("Imię osoby: " + firstName + ", ");
    }

    public int getAge() {
        return age;
    }

    public void displayAge() {
        System.out.println("wiek osoby: " + age + ", ");
    }

    public Job getJob() {
        return job;
    }

    public void displayJob() {
        System.out.println("zawód osoby: " + job + ".");
    }


    public static void main(String[] args) {
        Person teacher2 = new Person("Anna", 30, new Teacher(3500, "Nauczanie"));
        teacher2.displayFirstName(); teacher2.displayJob();



        Person doctor2 = new Person("Patrycja", 28, new Doctor(1500, "leczenie"));
        doctor2.displayFirstName();
        doctor2.displayJob();


        Person accountant2 = new Person("Klara", 50, new Accountant(6500, "księgowanie"));
        accountant2.displayFirstName();
        accountant2.displayJob();


        Person seller2 = new Person("Beata", 43, new Seller(8000, "sprzedawanie"));
        seller2.displayFirstName();
        seller2.displayJob();

    }
}

