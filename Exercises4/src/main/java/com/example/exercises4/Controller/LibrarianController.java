package com.example.exercises4.Controller;

import com.example.exercises4.ApiResponse.ApiResponse;
import com.example.exercises4.ApiResponse.ApiResponseL;
import com.example.exercises4.Model.Book;
import com.example.exercises4.Model.Librarian;
import com.example.exercises4.Service.BookService;
import com.example.exercises4.Service.LibrarianService;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/Librarian")
public class LibrarianController {


    public LibrarianService librarianService;


    @GetMapping("/get")

    public ResponseEntity<ApiResponseL> getAllLibrarian() {
        return ResponseEntity.status(200).body(Librarian);
    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponseL> addAll(@Valid @RequestBody Librarian librarian) {
//        librarianService.addLibrarian(Librarian);
        return ResponseEntity.status(200).body("Librarian add");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateLibrarian(@PathVariable Integer id, @Valid @RequestBody Librarian librarian) {
//        librarianService.updateLibrarian(Id, librarian);
        return ResponseEntity.status(200).body("Librarian update");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteLibrarian(@PathVariable Librarian librarian) {
        return ResponseEntity.status(200).body("Librarian deleted");
    }


}

