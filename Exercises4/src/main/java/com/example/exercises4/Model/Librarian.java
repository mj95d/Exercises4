package com.example.exercises4.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Data
@Entity
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;

    @NotBlank
    private String username;

    @NotBlank
    @Pattern(regexp = " number password")
    private String password;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

}