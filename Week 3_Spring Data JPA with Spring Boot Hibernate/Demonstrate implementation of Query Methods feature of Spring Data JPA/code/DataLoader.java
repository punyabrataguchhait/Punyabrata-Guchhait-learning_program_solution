package com.example.querymethods.runner;

import com.example.querymethods.entity.Book;
import com.example.querymethods.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {
    private final BookRepository bookRepo;

    public DataLoader(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        bookRepo.save(new Book(null, "Spring in Action", "Craig Walls", 699.0, sdf.parse("2023-01-10")));
        bookRepo.save(new Book(null, "Java for Beginners", "James", 399.0, sdf.parse("2022-12-01")));
        bookRepo.save(new Book(null, "Spring Boot Guide", "Adam", 599.0, sdf.parse("2023-04-12")));

        System.out.println(bookRepo.findByTitleContaining("Spring"));
        System.out.println(bookRepo.findByAuthorStartingWith("Ja"));
        System.out.println(bookRepo.findByPriceGreaterThan(500));
        System.out.println(bookRepo.findByPublishedDateBetween(sdf.parse("2022-01-01"), sdf.parse("2023-12-31")));
        System.out.println(bookRepo.findTop3ByOrderByPublishedDateDesc());
    }
}
