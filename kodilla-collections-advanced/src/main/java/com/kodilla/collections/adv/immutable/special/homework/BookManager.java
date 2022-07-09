package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookManager {
    private static List<Book> books = new LinkedList<>();

    public static Book createBook(String title, String author){
//        Book book = new Book(title, author);
//        return book;
        return new Book(title, author);
    }



}
