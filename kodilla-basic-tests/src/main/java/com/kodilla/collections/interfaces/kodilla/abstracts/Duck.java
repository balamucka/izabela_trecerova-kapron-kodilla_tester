package com.kodilla.collections.interfaces.kodilla.abstracts;

public class Duck extends Animal {

    public Duck() {
        super(2);
    }

    @Override
    public  void giveVoice() {
        System.out.println("Quack");
    }
}
