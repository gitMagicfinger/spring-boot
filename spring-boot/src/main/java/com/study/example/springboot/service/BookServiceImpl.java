package com.study.example.springboot.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.study.example.springboot.domain.Book;
import com.study.example.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService{
	private final BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Optional<Book> findById(Long id) {
		return bookRepository.findById(id);
	}

	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	/*@Override
	public List<Book> findAll(OffSetPageRequest request) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
}
