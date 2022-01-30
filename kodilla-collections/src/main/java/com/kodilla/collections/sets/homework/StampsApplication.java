package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("znaczek z Hiszpanii", "2cm x 3cm", "tak"));
        stamps.add(new Stamp("znaczek z Danii", "1.5cm x 3.5cm", "nie"));
        stamps.add(new Stamp("Znaczek z USA", "3cm x 5cm", "tak"));
        stamps.add(new Stamp("znaczek z Hiszpanii", "2cm x 3cm", "tak"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
