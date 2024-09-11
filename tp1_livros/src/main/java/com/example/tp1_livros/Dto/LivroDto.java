package com.example.tp1_livros.Dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LivroDto {
    private String title;
    private Long autorId;
}
