package com.example.exercises4.ApiRepository;


import com.example.exercises4.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface BookRepository extends JpaRepository<Book, Integer> {


    List<Book> findByCategory(@Param("category") String category);


    List<Book> findByNumberOfPages(int numberOfPages);


    List<Book> findByAuthor(@Param("author") String author);


    Book findByTitle(@Param("title") String title);

}
