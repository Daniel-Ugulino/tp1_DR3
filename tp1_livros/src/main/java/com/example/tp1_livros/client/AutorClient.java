package com.example.tp1_livros.client;

import com.example.tp1_livros.Dto.AutorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "client-service", url = "http://localhost:8080/autor")
public interface AutorClient {
    @GetMapping("/{id}")
    AutorDto get(@PathVariable Long id);
}
