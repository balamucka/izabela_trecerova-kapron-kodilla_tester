package com.kodilla.collections.adv.immutable.special.homework;

import com.kodilla.collections.adv.immutable.Book;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = new Book("Michaił Bułhakow", "Mistrz i Małgorzata");
        Book book2 = new Book("Franz Kafka", "Proces");
        Book book3 = new Book("Franz Kafka", "Proces");
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println("-----");
        System.out.println(book2 == book3);
        System.out.println(book2.equals(book3));

    }
}
