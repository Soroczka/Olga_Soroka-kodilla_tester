package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {
        Book abc = BookManager.createBook("ABC", "Author");
        Book cde = BookManager.createBook("ABC", "Author");
        System.out.println(abc == cde);
        System.out.println(abc.equals(cde));
        System.out.println(abc.hashCode());
        System.out.println(cde.hashCode());

        Book newBook1 = BookManager.addBook("My New Book", "Author Name");
        System.out.println(newBook1);
        Book newBook2 = BookManager.addBook("My New Book", "Author Name");
        System.out.println(newBook2);

    }
}
