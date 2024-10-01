package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.model.Book;
import com.example.Library.Management.System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        model.addAttribute("newBook", new Book());
        return "book-list"; // Ensure this matches the HTML file name
    }

    @PostMapping
    public String addBook(@ModelAttribute Book newBook) {
        bookService.addBook(newBook);
        return "redirect:/books";
    }

    @GetMapping("/{id}/borrow")
    public String borrowBook(@PathVariable Long id) {
        bookService.borrowBook(id);
        return "redirect:/books";
    }

    @GetMapping("/{id}/return")
    public String returnBook(@PathVariable Long id) {
        bookService.returnBook(id);
        return "redirect:/books";
    }
}
