package com.ibm.library.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibm.library.exception.BadValue;
import com.ibm.library.model.Book;
import com.ibm.library.repo.LibraryRepo;

@Service
public class LibraryServiceImpl implements LibraryService {

    private ArrayList<Book> books = new ArrayList<>();
    
    @Autowired
    private LibraryRepo Repo_connect;
    

	public ArrayList<Book> getBooks() throws BadValue, IOException {
		ArrayList<Book> books = Repo_connect.getBooks();
		
		System.out.println(books);
		//get books form LibraryRepo
		for(Book i: books) {
			if(i.getAuthor().equals("Tom Smith")) {
				StringBuilder sb = new StringBuilder("Tom Smith");
				sb.append(" - CHECKED");
				i.setAuthor(sb.toString());
                
				
				//Calculate late fee
				int numDaysLate;
				int titleLength = i.getTitle().length();
		    	if(titleLength % 2 == 0) {
		    		numDaysLate = -1 * titleLength;
		    	} else {
		    		//i.calculateLateFee(-1);
		    	    numDaysLate = -1 * titleLength;
		    	}
		    	
		    	try {
		    		if(numDaysLate < 0) {
		    			throw new BadValue();
		    		} else {
			    		double lateFee = i.calculateLateFee(numDaysLate);
			    		i.setNotes("Fee is " + lateFee);
		    		}
		    	} catch(BadValue badValue) {
		    		i.setNotes(badValue.getMessage());
		    	}
				
			}
		}
		return books;
	}
}
