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

    public static Book addBook(String title, String author){
        Book newBook = createBook(title, author);
        if (books.size() == 0){
            books.add(newBook);
        } else {
            for (int i = 0; i < books.size(); i++){
                if (books.get(i).equals(newBook)){
                    System.out.println("You cannot add the book to the collection. Reason: Book exists in the list.");
                    return null;
                } else {
                    books.add(newBook);
                }
            }
        }
        return newBook;

    }



}
