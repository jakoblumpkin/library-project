package com.ibm.library.rest;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.*;
import com.ibm.library.exception.BadValue;
import com.ibm.library.model.Book;
import com.ibm.library.service.LibraryService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
//@SessionAttributes({"title"})
public class LibraryController extends HttpServlet {
    
	@Autowired
	LibraryService libraryServiceImpl;
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public ArrayList books(ModelMap model)
			throws BadValue, IOException {
		System.out.println("restiswork");
        model.addAttribute("title", "jakob");
		ArrayList<Book> books = libraryServiceImpl.getBooks();
		model.put("title", "Tom");
		return books;
	}
	
}
