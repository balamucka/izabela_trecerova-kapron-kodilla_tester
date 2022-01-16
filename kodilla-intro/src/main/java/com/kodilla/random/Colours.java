package com.kodilla.random;

import java.util.Scanner;

public class Colours {

    enum ColoursName {
        N, /* Niebieski */
        P, /* Pomarańczowy */
        C, /* Czerwony */
        B, /* Biały */

    }

    public static String getColoursName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać pierwszą literę koloru:");
        String Colours = scanner.nextLine().trim().toUpperCase();
        if (Colours.contains(Colours)){

        }else {
            System.out.println("Zły kolor. Proszę wybrać jeszcze raz.");
        }
        return Colours;
    }

    public static void main(String[] args) {
        ColoursName Colours = ColoursName.valueOf(getColoursName());
        switch (Colours) {
            case N:
                System.out.println("Niebieski");
                break;
            case P:
                System.out.println("Pomarańczowy");
                break;
            case C:
                System.out.println("Czerwony");
                break;
            case B:
                System.out.println("Biały");
                break;
        }
    }
}