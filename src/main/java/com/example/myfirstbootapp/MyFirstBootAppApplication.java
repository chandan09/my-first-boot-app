package com.example.myfirstbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstBootAppApplication.class, args);
		System.out.println("Hello !! This is my first APP");
	}

}
