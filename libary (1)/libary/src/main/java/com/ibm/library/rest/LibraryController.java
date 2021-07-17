package com.ibm.library.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ibm.library.service.LibraryService;

@Controller
public class LibraryController {
    
	@Autowired
	LibraryService libraryService;
}
