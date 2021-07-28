package com.ibm.library.model;

import com.ibm.library.exception.BadValue;

public class BookNonFiction extends Book{
    
	public BookNonFiction(int isbn, String title, String author, String notes) {
		super(isbn, title, author, notes);
	}

	
	public double calculateLateFee(int numDaysLate) throws BadValue {
		double lateFee = (numDaysLate*1.5) * 80;
		return lateFee;
	}
}
