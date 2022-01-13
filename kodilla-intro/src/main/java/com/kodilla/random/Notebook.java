package com.kodilla.random;

public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight == "600g") {
            System.out.println("This notebook is light.");
        } else if (this.weight == "700g" || this.weight == "2000g") {
            System.out.print("The weight is not too heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.year > 2012 && this.year < 2022 || this.price > 1000 && this.price < 1400) {
            System.out.println("This notebook is new and the price is good.");
        } else if (this.year > 2000 && this.year < 2011 || this.price > 1500 && this.price < 2000) {
            System.out.println("This notebook is not old and the price is good.");
        } else {
            System.out.println("This notebook is old and the price is expensive.");
        }

    }

}


