package com.ibm.library.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.ibm.library.exception.BadValue;
import com.ibm.library.model.Book;

@Component
public interface LibraryService {

	public ArrayList<Book> getBooks() throws BadValue, IOException;
}
