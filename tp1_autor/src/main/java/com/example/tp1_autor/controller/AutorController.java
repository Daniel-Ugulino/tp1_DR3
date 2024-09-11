package com.example.tp1_autor.controller;

import com.example.tp1_autor.domain.Autor;
import com.example.tp1_autor.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @GetMapping
    public ResponseEntity<Object> findAll() {
        try {
            List<Autor> autor = autorService.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        try {
            Autor autor = autorService.findById(id);
            return ResponseEntity.status(HttpStatus.OK).body(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Autor autor) {
        try {
            Autor autorEntity = autorService.save(autor);
            return ResponseEntity.status(HttpStatus.OK).body(autorEntity);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@RequestBody Autor autor) {
        try {
            Autor autorEntity = autorService.update(autor);
            return ResponseEntity.status(HttpStatus.OK).body(autorEntity);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        try {
            autorService.delete(id);
            return ResponseEntity.status(HttpStatus.OK).body("autor deletedo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }
}
