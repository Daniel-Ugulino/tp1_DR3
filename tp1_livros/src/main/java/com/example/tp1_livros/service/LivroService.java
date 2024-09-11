package com.example.tp1_livros.service;

import com.example.tp1_livros.Dto.AutorDto;
import com.example.tp1_livros.Dto.LivroDto;
import com.example.tp1_livros.client.AutorClient;
import com.example.tp1_livros.domain.Livro;
import com.example.tp1_livros.repository.LivroRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private AutorClient autorClient;

    public Livro salvar(LivroDto livroDto) {
        AutorDto autorDto = autorClient.get(livroDto.getAutorId());
        Livro livro = new Livro();
        BeanUtils.copyProperties(livroDto, livro);
        livro.setAuthor(autorDto.getNome());
        return livroRepository.save(livro);
    }
}
