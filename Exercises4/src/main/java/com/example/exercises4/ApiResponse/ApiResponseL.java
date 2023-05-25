package com.example.exercises4.ApiResponse;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponseL <Librarian> {
    private boolean success;
    private String message;
    private Librarian data;
}