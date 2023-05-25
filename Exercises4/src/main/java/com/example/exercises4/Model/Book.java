package com.example.exercises4.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Locale;
@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@NotNull
    private String title;
@Column
    private String author;

    @Enumerated(EnumType.STRING)
    private Locale.Category category;
@NotNull
    private Integer ISBN;

    @Min(value = 8, message = "Number of least 8")
    private Integer numberOfPages;


}
