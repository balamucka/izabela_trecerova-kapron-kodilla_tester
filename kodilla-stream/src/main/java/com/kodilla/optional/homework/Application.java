package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Karol", new Teacher("Jan Kowalski")));
        students.add(new Student("Basia", new Teacher(" ")));
        students.add(new Student("Pawel", new Teacher("Zdzislaw Beksinski")));
        students.add(new Student("Darek", new Teacher(" ")));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName =
                    optionalTeacher.orElse(new Teacher("<undefined>")).getName();

                System.out.println("Uczen: " + student.getName() + ", nauczyciel: " + teacherName);



        }


    }
}
