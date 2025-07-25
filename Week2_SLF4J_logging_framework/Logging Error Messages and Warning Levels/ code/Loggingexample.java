package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loggingexample {
    private static final Logger logger = LoggerFactory.getLogger(Loggingexample.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }
}
