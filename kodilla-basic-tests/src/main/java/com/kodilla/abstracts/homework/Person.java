package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private String Job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.Job = job;
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

    public String getJob() {
        return Job;
    }

    public void displayJob() {
        System.out.println("zawód osoby: " + Job + ".");
    }


    public static void main(String[] args) {
        Person teacher2 = new Person("Anna", 30, "nauczycielka");
        teacher2.displayFirstName();  teacher2.displayJob();

        Teacher teacher = new Teacher(3500, "nauczanie");
        teacher.displayResponsibilities();

        Person doctor2 = new Person("Patrycja", 28, "lekarka");
        doctor2.displayFirstName(); doctor2.displayJob();

        Doctor doctor = new Doctor(15000, "leczenie");
        doctor.displayResponsibilities();

        Person accountant2 = new Person("Klara", 50, "księgowa");
        accountant2.displayFirstName(); accountant2.displayJob();

        Accountant accountant = new Accountant(6500, "księgowanie");
        accountant.displayResponsibilities();

        Person seller2 = new Person("Beata", 43, "sprzedawczyni");
        seller2.displayFirstName(); seller2.displayJob();

        Seller seller = new Seller(8000, "sprzedawanie");
        seller.displayResponsibilities();
    }
}

