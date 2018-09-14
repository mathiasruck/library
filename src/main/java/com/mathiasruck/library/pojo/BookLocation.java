package com.mathiasruck.library.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BookLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String bookcase;
	private String shelf;

	@OneToOne(mappedBy = "book")
	private Book book;

	@OneToOne
	private Library library;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public String getBookcase() {
		return bookcase;
	}

	public void setBookcase(String bookcase) {
		this.bookcase = bookcase;
	}

	public String getShelf() {
		return shelf;
	}

	public void setShelf(String shelf) {
		this.shelf = shelf;
	}

}
