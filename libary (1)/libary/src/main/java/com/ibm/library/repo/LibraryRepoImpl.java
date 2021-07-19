package com.ibm.library.repo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.ibm.library.model.Book;
import com.ibm.library.model.BookFiction;
import com.ibm.library.model.BookNonFiction;

@Component
public class LibraryRepoImpl implements LibraryRepo {
    
	@Override
	public ArrayList<Book> getBooks() throws IOException {
		ArrayList<Book> listOfBooks = new ArrayList<>();
		
		String location = "C:\\projects\\library-project\\libary (1)\\libary\\src\\main\\java\\com\\ibm\\library\\repo\\book.txt";
		//try {
		FileInputStream fileInput = new FileInputStream(location);
	    InputStreamReader inputStream = new InputStreamReader(fileInput);
	    LineNumberReader lineNumber = new LineNumberReader(inputStream);
	    
	    String[] booksList = lineNumber.readLine().split(",");
	    for(int i = 0; i < 3; i++) {
	    	Book book = null;
	    	if(booksList[0].equals("FICTION")) {
	    		book = new BookFiction(Integer.parseInt(booksList[1]), booksList[2], booksList[3], null);
	    	} else if(booksList[0].equals("NONFICTION")) {
	    		book = new BookNonFiction(Integer.parseInt(booksList[1]), booksList[2], booksList[3], null);
	    	} 	
	    	listOfBooks.add(book);
	    	booksList = lineNumber.readLine().split(",");
	    }
	    
		return listOfBooks;
		
	};
}
