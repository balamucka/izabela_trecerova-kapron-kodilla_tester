package com.kodilla.random;

import java.util.ArrayList;

public class Grades3 {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(3);

        int last = list.get(list.size() - 1);

        System.out.println("Ostatnia ocena:" + last);
    }
}
