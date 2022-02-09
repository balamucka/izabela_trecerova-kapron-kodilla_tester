package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double averageAboveForty = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Srednia liczba postow dla uzytkownikow, ktorych wiek jest >= 40: " + averageAboveForty);

        double averageBelowForty = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Srednia liczba postow dla uzytkownikow, ktorych wiek jest < 40: " + averageBelowForty);

    }
}
