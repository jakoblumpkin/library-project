package com.ibm.libary;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ibm.libary.exception.BadValue;
import com.ibm.library.service.*;

import com.ibm.library.service.LibraryServiceImpl;

@SpringBootApplication
public class LibaryApplication {

	public static void main(String[] args) throws BadValue, IOException {
		ConfigurableApplicationContext run = SpringApplication.run(LibaryApplication.class, args);

	}

}
