package com.kodilla.collections.adv.immutable.special.homework;

import com.kodilla.collections.adv.immutable.Book;

public class BookManager {

    private Book createBook;
    private String title;
    private String author;

    public Book createBook(String title, String author) {
        this.title = title;
        this.author = author;
        return new Book(title, author);
    }

}



