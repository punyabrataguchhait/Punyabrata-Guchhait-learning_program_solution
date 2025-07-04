package com.example.querymethods.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private double price;

    @Temporal(TemporalType.DATE)
    private Date publishedDate;

    // Getters and Setters
}
