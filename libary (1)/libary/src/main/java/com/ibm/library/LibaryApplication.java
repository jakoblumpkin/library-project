package com.ibm.library;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ibm.library.exception.BadValue;
import com.ibm.library.model.Book;
import com.ibm.library.service.*;

import com.ibm.library.service.LibraryServiceImpl;

@SpringBootApplication
public class LibaryApplication {

	public static void main(String[] args) throws BadValue, IOException {
		ConfigurableApplicationContext run = SpringApplication.run(LibaryApplication.class, args);
		LibraryService books = run.getBean(LibraryServiceImpl.class);
		ArrayList<Book> testing = books.getBooks();
		
		for(Book books1: testing) {
			System.out.println(books1.getTitle());
			System.out.println(books1.getAuthor());
			System.out.println(books1.getNotes());
			System.out.println("-----------------------");
		}

	}

}
