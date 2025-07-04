package com.example.querymethods.repository;

import com.example.querymethods.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String keyword);
    List<Book> findByAuthorStartingWith(String prefix);
    List<Book> findByPriceGreaterThan(double price);
    List<Book> findByPriceLessThan(double price);
    List<Book> findByPublishedDateBetween(Date start, Date end);
    List<Book> findAllByOrderByTitleAsc();
    List<Book> findTop3ByOrderByPublishedDateDesc();
}
