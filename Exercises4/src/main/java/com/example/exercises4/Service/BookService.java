package com.example.exercises4.Service;

import com.example.exercises4.ApiRepository.BookRepository;
import com.example.exercises4.Model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.List;
@Service
@Transactional
@Validated
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Integer id, Book book) {
        Book existingBook = bookRepository.findById(id).orElseThrow(() -> new RuntimeException());
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setCategory(book.getCategory());
        existingBook.setISBN(book.getISBN());
        existingBook.setNumberOfPages(book.getNumberOfPages());
        return bookRepository.save(existingBook);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    public List<Book> getBooksByCategory(String category) {
        return bookRepository.findByCategory(category);
    }

    public List<Book> getBooksByNumberOfPagesGreaterThan(Integer pages) {
        return bookRepository.findByNumberOfPages(pages);
    }

    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public List<Book> searchBooksByTitle(String title) {
        return bookRepository.findByAuthor(title);
    }
}



























