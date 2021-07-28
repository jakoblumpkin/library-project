package com.ibm.library.exception;

public class BadValue extends Exception {
	

	public void BadValue() {
	       System.out.println("Must be positive!");
	    }
	
	public String getMessage() {
		return "Must be Positive";
	}
}
