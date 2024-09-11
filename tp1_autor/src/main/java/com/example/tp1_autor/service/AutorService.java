package com.example.tp1_autor.service;

import com.example.tp1_autor.domain.Autor;
import com.example.tp1_autor.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public Autor findById(Long id) {
        return autorRepository.findById(id).get();
    }

    public void delete(Long id) {
        autorRepository.deleteById(id);
    }

    public Autor update(Autor autor) {
        return autorRepository.save(autor);
    }
}
