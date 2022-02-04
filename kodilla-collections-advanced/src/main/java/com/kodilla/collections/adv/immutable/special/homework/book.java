package com.kodilla.collections.adv.immutable.special.homework;

public class book {
    private String title;
    private String author;

    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
