package com.kodilla.collections.interfaces.kodilla.random;

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
        String Colours = null;

        boolean isValid=false;
        while (!isValid) {
            System.out.println("Proszę podać pierwszą literę koloru:");
            Colours = scanner.nextLine().trim().toUpperCase();
            for (ColoursName c:ColoursName.values()) {
                if (c.name().equals(Colours)) {
                    isValid = true;
                }
            }
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