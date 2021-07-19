package com.ibm.library.service;

import java.io.IOException;
import java.util.ArrayList;

import com.ibm.libary.exception.BadValue;
//import com.ibm.library.repo.LibraryRepo;
//import com.ibm.library.repo.LibraryRepoImpl;
import com.ibm.library.service.LibraryServiceImpl;
import com.ibm.library.model.Book;
import com.ibm.library.service.LibraryService;

public class testing {

	public static void main(String[] args) throws IOException, BadValue {
		
		//LibraryRepo testing = new LibraryRepoImpl();
		//testing.getBooks();
		
		LibraryService testing = new LibraryServiceImpl();
		
		ArrayList<Book> Books = testing.getBooks();
		
		for(Book i :Books) {
			System.out.println(i.getAuthor());
		}
		
	}

}
