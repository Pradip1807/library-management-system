package com.example.Library.Management.System.service;

import com.example.Library.Management.System.model.Book;
import com.example.Library.Management.System.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book borrowBook(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Book not found"));
        if (!book.isBorrowed()) {
            book.setBorrowed(true);
            return bookRepository.save(book);
        }
        throw new IllegalStateException("Book is already borrowed");
    }

    public Book returnBook(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Book not found"));
        if (book.isBorrowed()) {
            book.setBorrowed(false);
            return bookRepository.save(book);
        }
        throw new IllegalStateException("Book is not borrowed");
    }
}
