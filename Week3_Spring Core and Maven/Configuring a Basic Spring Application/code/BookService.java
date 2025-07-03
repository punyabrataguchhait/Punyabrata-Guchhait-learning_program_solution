package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void addBook(String bookName) {
        System.out.println("Adding book: " + bookName);
        if (bookRepository != null) {
            bookRepository.saveBook(bookName);
        } else {
            System.out.println("BookRepository not initialized!");
        }
    }

    // For Exercise 2 (Setter injection)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
