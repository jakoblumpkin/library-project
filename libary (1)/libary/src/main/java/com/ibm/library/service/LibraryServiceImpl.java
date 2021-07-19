package com.ibm.library.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibm.libary.exception.BadValue;
import com.ibm.library.model.Book;
import com.ibm.library.repo.LibraryRepo;
import com.ibm.library.repo.LibraryRepoImpl;

@Service
@Configuration
public class LibraryServiceImpl implements LibraryService {

    private ArrayList<Book> books = new ArrayList<>();
    
    @Autowired
    private LibraryRepo LibraryRepoImpl;
    
    @Bean
	public ArrayList<Book> getBooks() throws BadValue, IOException {
		LibraryRepo reop1 = new LibraryRepoImpl();
		ArrayList<Book> books = reop1.getBooks();
		
		System.out.println(books);
		//get books form LibraryRepo
		for(Book i: books) {
			if(i.getAuthor().equals("Tom Smith")) {
				StringBuilder sb = new StringBuilder("Tom Smith");
				sb.append(" - CHECKED");
				i.setAuthor(sb.toString());
                
				
				//Calculate late fee
				int titleLength = i.getTitle().length();
		    	if(titleLength % 2 != 0) {
		    		i.calculateLateFee(-1);
		    		i.setNotes("Must be positive!");
		    	} else {
		    		i.setNotes("Fee is: " + i.calculateLateFee(titleLength));
		    	}
				
			}
		}
		return books;
	}
}
