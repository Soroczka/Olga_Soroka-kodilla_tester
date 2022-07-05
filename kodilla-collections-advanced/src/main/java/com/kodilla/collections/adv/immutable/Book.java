package com.kodilla.collections.adv.immutable;

//immutable if class is final
public class Book {
    protected final String author;
    protected final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public final String getAuthor() {
        return author;
    }

    public final String getTitle() {
        return title;
    }
}
