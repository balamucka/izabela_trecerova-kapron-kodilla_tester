package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Nowy York"));
        flights.add(new Flight("Poznań", "Madryt"));
        flights.add(new Flight("Kraków", "Oslo"));
        flights.add(new Flight("Wrocław", "Londyn"));

        return flights;
    }
}