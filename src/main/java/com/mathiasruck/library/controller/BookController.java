package com.mathiasruck.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mathiasruck.library.pojo.Book;
import com.mathiasruck.library.repository.BookRepository;

@Controller    
@RequestMapping(path="/book")
public class BookController {

	
	@Autowired
	private BookRepository bookRepository;
	
	
	@RequestMapping(path="/all")
	public @ResponseBody Iterable<Book> getAllUsers() {
		// This returns a JSON or XML with the users
		return bookRepository.findAll();
	}
}
