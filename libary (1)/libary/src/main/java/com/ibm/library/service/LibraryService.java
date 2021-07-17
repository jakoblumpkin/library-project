package com.ibm.library.service;

import java.util.ArrayList;

import com.ibm.libary.exception.BadValue;
import com.ibm.library.model.Book;


public interface LibraryService {

	public ArrayList<Book> getBooks() throws BadValue;
}
