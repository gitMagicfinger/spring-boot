package com.study.example.springboot.service;

import java.util.List;
import java.util.Optional;
import com.study.example.springboot.domain.Book;

public interface BookService {
	public Optional<Book> findById(Long id);
	
	public Book save(Book book);
//	public List<Book> findAll(OffSetPageRequest request);
}
