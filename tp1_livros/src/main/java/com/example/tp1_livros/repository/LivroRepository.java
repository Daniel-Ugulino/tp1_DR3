package com.example.tp1_livros.repository;

import com.example.tp1_livros.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
