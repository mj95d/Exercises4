package com.example.exercises4.ApiRepository;


import com.example.exercises4.Model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Integer> {


    Optional<Librarian> findByEmail(@Param("email") String email);


    Optional<Librarian> findByUsername(@Param("username") String username);
}


