package com.example.sometests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jackson.JsonObjectDeserializer;

@SpringBootApplication
public class SometestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SometestsApplication.class, args);
        System.out.println("Hello World");

        StringBuilder stringBuilder = new StringBuilder(); // comment coment
        stringBuilder.toString();
    }

}
