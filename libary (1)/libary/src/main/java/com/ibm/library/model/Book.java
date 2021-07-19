package com.ibm.library.model;

import com.ibm.libary.exception.BadValue;

public abstract class Book {
    private int isbn;
    private String title;
    private String author;
    private String notes;
       
    public Book(int isbn, String title, String author, String notes) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.notes = notes;
	}

	public abstract double calculateLateFee(int numDaysLate) throws BadValue;
    
    
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
    
    
}
