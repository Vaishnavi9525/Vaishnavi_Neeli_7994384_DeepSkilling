package com.deepskilling.library;

public class Main {

    public static void main(String[] args) {

        Book[] books = {

            new Book(1,"C Programming","Dennis"),
            new Book(2,"Java","James"),
            new Book(3,"Python","Guido"),
            new Book(4,"Spring","Rod")
        };

        Book b1 =
            LinearSearch.search(books,"Python");

        if(b1 != null)
            System.out.println(
                "Linear Search Found: "
                + b1.title);

        Book b2 =
            BinarySearch.search(books,"Python");

        if(b2 != null)
            System.out.println(
                "Binary Search Found: "
                + b2.title);
    }
}