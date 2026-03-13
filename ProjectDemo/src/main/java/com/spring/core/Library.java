package com.spring.core;
import java.util.List;

public class Library {
	private List<Book> books;

    // Getter method
    public List<Book> getBooks() {
        return books;
    }

    // Setter method used by Spring to inject the list from XML
    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
