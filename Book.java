package com.classdemo;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {
        // Creating a list to hold books
        List<Book> bookCollection = new ArrayList<>();

        // Adding books to the collection
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        bookCollection.add(book1);
        bookCollection.add(book2);

        // Displaying the books in the collection
        System.out.println("Books in the collection:");
        for (Book book : bookCollection) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println();
        }

        // Removing a book from the collection
        bookCollection.remove(book1);

        // Displaying the updated collection
        System.out.println("After removing a book, the collection contains:");
        for (Book book : bookCollection) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println();
        }
    }
}
