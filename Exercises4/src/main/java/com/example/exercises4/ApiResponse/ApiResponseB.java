package com.example.exercises4.ApiResponse;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponseB <Book> {
    private boolean success;
    private String message;
    private Book data;
}