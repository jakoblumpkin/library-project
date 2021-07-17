package com.ibm.library.model;

import com.ibm.libary.exception.BadValue;

public class BookFiction extends Book {
   
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
