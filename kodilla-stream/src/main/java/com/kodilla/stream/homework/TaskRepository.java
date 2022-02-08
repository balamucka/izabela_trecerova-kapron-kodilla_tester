package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("przygotowanie raportu", LocalDate.of(2022, 2, 2), LocalDate.of(2022, 2, 4)));
        tasks.add(new Task("sprawdzic email",LocalDate.of(2022, 2, 9), LocalDate.of(2022, 2, 10)));
        tasks.add(new Task("isc na spotkanie", LocalDate.of(2022, 2, 15), LocalDate.of(2022,2, 16)));
        return tasks;
    }
}
