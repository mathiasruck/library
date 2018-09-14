package com.mathiasruck.library.pojo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Book {

	
	//TODO Adjust relationships https://www.baeldung.com/spring-data-rest-relationships
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private Date date;

	@OneToOne
	@JoinColumn(name = "author_id")
	private Author author;

	@OneToOne
	@JoinColumn(name = "book_location_id")
	private BookLocation bookLocation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BookLocation getBookLocation() {
		return bookLocation;
	}

	public void setBookLocation(BookLocation bookLocation) {
		this.bookLocation = bookLocation;
	}

}
