package com.company.exercise7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Exercise 7 is related to the usability of Collections API together with lambda annotations.
 */


public class CollectionsExamples {

    public static void main(String[] args){

        Book book1 = new Book("MyFirstBook", "First Author", 40);
        Book book2 = new Book("MySecondBook", "Second Author", 130);
        Book book3 = new Book("MyThirdBook", "Third Author", 30);

        List<Book> collectionOfBooks = Arrays.asList(book1, book2, book3, book1);

        //Using method reference inside a stream to sum the number of pages in the Book collection.
        int total = collectionOfBooks
                    .stream()
                    .mapToInt(Book::getPages)
                    .sum();

        System.out.println(total);

        //Using .map and .collect to aggregate all authors names in the same list.
        List<String> authorNames = collectionOfBooks
                                   .stream()
                                   .map(Book::getAuthor)
                                   .collect(Collectors.toList());

        System.out.println(authorNames);


        //In order to remove the duplicates we can also use the set collection and its implementation, HashSet.
        List<Book> duplicateBooks = Arrays.asList(book1, book1, book2, book2);

        Set<Book> noDuplicatedBooks = new HashSet<>(duplicateBooks);

        noDuplicatedBooks.forEach(
                b -> System.out.println(b.toString())
        );


    }

}
