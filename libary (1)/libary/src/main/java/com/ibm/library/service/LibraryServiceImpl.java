package com.ibm.library.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.libary.exception.BadValue;
import com.ibm.library.model.Book;
import com.ibm.library.repo.LibraryRepo;

public class LibraryServiceImpl implements LibraryService {

    private ArrayList<Book> books = new ArrayList<>();
    
    @Autowired
    private LibraryRepo libraryRepo;
    

	public ArrayList<Book> getBooks() throws BadValue {
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
		    	} else {
		    		i.calculateLateFee(titleLength);
		    	}
				
			}
		}
		return books;
	}
}
