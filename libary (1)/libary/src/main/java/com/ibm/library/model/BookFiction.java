package com.ibm.library.model;

import com.ibm.library.exception.BadValue;

public class BookFiction extends Book {
	
	public BookFiction(int isbn, String title, String author, String notes) {
		super(isbn, title, author, notes);
		// TODO Auto-generated constructor stub
	}

	public double calculateLateFee(int numDaysLate) throws BadValue {
		try {
		if(numDaysLate < 0) {
			throw new BadValue();
		}
		} catch(BadValue b) {
			System.out.println(b);
		}
		double lateFee = (numDaysLate/2) * 75;
		return lateFee;
	}
	
}
