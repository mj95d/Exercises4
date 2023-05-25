package com.example.exercises4.Controller;

import com.example.exercises4.ApiResponse.ApiResponse;
import com.example.exercises4.ApiResponse.ApiResponseB;
import com.example.exercises4.Model.Book;
import com.example.exercises4.Service.BookService;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/book")
public class BookController {


    private BookService bookService;

    @GetMapping("/get")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.status(200).body(book);
    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponseB> addBook(@Valid @RequestBody Book book) {
        bookService.addBook(book);
//        ApiResponse response = new ApiResponse(true, "Book added successfully");
        return ResponseEntity.status(200).body(book);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ApiResponseB> updateBook(@PathVariable Integer id, @Valid @RequestBody Book book) {
        bookService.updateBook(id, book);
        return ResponseEntity.status(200).body(book);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ApiResponseB> deleteBook(@PathVariable Integer id) {
        bookService.deleteBook(id);
        return ResponseEntity.status(200).body(book);
    }






}
