package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagazzinoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MagazzinoApplication.class, args);
    }
}

/*
 * per TESTARLO
 * nel TERMINALE
 * 
 * mvn clean
 * mvn spring-boot:run
 * .
 * su CHROME
 * http://localhost:8080/prodotti
 * 
 */