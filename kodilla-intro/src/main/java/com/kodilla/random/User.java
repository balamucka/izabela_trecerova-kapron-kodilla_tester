package com.kodilla.random;


public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getUserAge() {
        int userAge = age;
        return userAge;
    }

    public String getName() {
        String userName = name;
        return userName;
    }


    public static void main(String[] args) {
        User anna = new User("Anna", 45);
        User karol = new User("Karol", 21);
        User michal = new User("Michal", 34);
        User ola = new User("Ola", 10);
        User hanna = new User("Hanna", 56);
        User[] users = {anna, karol, michal, ola, hanna};

        int numberOfElements = users.length;
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        result = result / users.length;
        System.out.println(result);

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < result)
                System.out.println(users[i].name);
            else {
            }
        }
    }

}








