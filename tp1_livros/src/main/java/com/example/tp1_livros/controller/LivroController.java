package com.example.tp1_livros.controller;

import com.example.tp1_livros.Dto.LivroDto;
import com.example.tp1_livros.domain.Livro;
import com.example.tp1_livros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    LivroService livroService;

    @PostMapping
    public ResponseEntity<Livro> save(@RequestBody LivroDto livro) {
        Livro livroEntity = livroService.salvar(livro);
        return ResponseEntity.status(HttpStatus.OK).body(livroEntity);

    }
}
