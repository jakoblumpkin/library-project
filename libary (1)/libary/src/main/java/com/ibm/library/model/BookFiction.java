package com.ibm.library.model;

import com.ibm.library.exception.BadValue;

public class BookFiction extends Book {
	
	public BookFiction(int isbn, String title, String author, String notes) {
		super(isbn, title, author, notes);
		// TODO Auto-generated constructor stub
	}

	public double calculateLateFee(int numDaysLate) throws BadValue {
		double lateFee = (numDaysLate/2) * 75;
		return lateFee;
	}
	
}
