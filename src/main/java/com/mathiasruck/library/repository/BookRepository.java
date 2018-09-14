package com.mathiasruck.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.mathiasruck.library.pojo.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
