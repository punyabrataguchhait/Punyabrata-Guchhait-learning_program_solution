package com.example.library;

import com.example.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring XML config
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the service bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Call method
        bookService.addBook("Spring in Action");
    }
}
