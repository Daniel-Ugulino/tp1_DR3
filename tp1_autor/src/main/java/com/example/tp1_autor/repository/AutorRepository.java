package com.example.tp1_autor.repository;

import com.example.tp1_autor.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
