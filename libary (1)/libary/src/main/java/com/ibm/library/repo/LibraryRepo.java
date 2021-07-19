package com.ibm.library.repo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.ibm.library.model.Book;

public interface LibraryRepo {
     public ArrayList<Book> getBooks() throws IOException;
}
