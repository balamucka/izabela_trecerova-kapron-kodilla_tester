package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();
        Principal larry = new Principal("Larry", "Ellison", "Mayflower Primary School");
        Principal mark = new Principal("Mark", "Page", "Courtland School");
        Principal bill = new Principal("Bill", "Brin", "Fox Primary School");

        School larrySchool = new School(35, 25,30, 29);
        School markSchool = new School(20, 15, 27, 19);
        School billSchool = new School(35, 32, 28, 29);

        schoolDirectory.put(larry, larrySchool);
        schoolDirectory.put(mark, markSchool);
        schoolDirectory.put(bill, billSchool);

        for(Map.Entry<Principal, School> principalEntry : schoolDirectory.entrySet())
        System.out.println(principalEntry.getKey().getLastname() + ", łączna liczba uczniów w szkole " + principalEntry.getValue().getSum());

    }
}
