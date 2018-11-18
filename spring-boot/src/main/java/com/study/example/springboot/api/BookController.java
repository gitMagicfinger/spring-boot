package com.study.example.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.example.springboot.domain.Book;
import com.study.example.springboot.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/{bookId}")
	public ResponseEntity<Book> findById(@PathVariable Long bookId) {
		Book book = bookService.findById(bookId)
				.orElseThrow(() -> new RuntimeException("Not Found " + bookId));
		return ResponseEntity.ok(book);
	}
	
	@GetMapping("/save")
	public ResponseEntity<Book> save() {
		Book book = new Book();
		book.setName("boot-spring-boot");
		book.setIsbn10("0123456789");
		book.setIsbn13("0123456789012");
		
		bookService.save(book);
		return ResponseEntity.ok(book);
	}
}
