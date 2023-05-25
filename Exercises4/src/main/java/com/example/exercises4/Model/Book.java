package com.example.exercises4.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Locale;
@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@NotNull
     @Column
    private String title;
@Column
    private String author;
 @Column
    @Enumerated(EnumType.STRING)
    private Locale.Category category;
@NotNull
     @Column
    private Integer ISBN;
 @Column
    @Min(value = 8, message = "Number of least 8")
    private Integer numberOfPages;


}
